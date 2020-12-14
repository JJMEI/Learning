package com.mjj.learning.self.mybatis.session;

import com.mjj.learning.self.mybatis.config.Configuration;
import com.mjj.learning.self.mybatis.config.MappedStatement;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Properties;

/**
 * @author meijunjie
 */
public class SqlSessionFactory {

    private Configuration configuration = new Configuration();

    public SqlSessionFactory() throws SAXException {
        // 载入DB相关信息
        loadDbInfo();

        // 载入mapper相关信息
        loadMappersInfo();
    }

    public SqlSession openSeesion(){
        return new DefaultSqlSession(configuration);
    }



    private void loadMappersInfo() throws SAXException {

        URL resources;
        resources = SqlSessionFactory.class.getClassLoader().getResource(Configuration.MAPPER_CONFIG_LOCATION);
        if(resources != null){
            File mappers = new File(resources.getFile());
            if(mappers.isDirectory()){
                File[] files = mappers.listFiles();
                if(files == null){
                    return;
                }
                for(File file : files){
                    loadMapperInfo(file);
                }
            }
        }


    }

    /**
     * 解析document 提取配置文件中的参数
     * @param file
     */
    @SuppressWarnings("unchecked")
    private void loadMapperInfo(File file) throws SAXException {
        // 创建SAXReader对象
        SAXReader reader = new SAXReader();

        // 解决Dom4j解析XML配置
        reader.setEntityResolver((publicId, systemId) -> new InputSource(new ByteArrayInputStream("".getBytes())));

        // 通过reader方法读取一个文件 转换成document对象
        Document document = null;
        try{
            document = reader.read(file);
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }


        // 获取根节点元素
       if(document != null){
            Element node = document.getRootElement();

            // 获取命名空间namespace
            String namespace = node.attribute("namespace").getData().toString();

            // 获取子节点列表
            List<Element> selects = node.elements("select");
            for(Element element : selects){
                MappedStatement mappedStatement = new MappedStatement();
                String id = element.attribute("id").getData().toString();
                String resultType = element.attribute("resultType").getData().toString();
                String sql = element.getData().toString();
                // 命名空间+"."+接口方法名 全限定
                String sourceId = namespace+"."+id;
                mappedStatement.setSourceId(sourceId);
                mappedStatement.setResultType(resultType);
                mappedStatement.setNamespace(namespace);
                mappedStatement.setSql(sql);
                configuration.getMappedStatements().put(sourceId,mappedStatement);

                // 帮助垃圾回收
                mappedStatement = null;

            }
        }else {
            System.out.println("解析document 出错");
        }



    }

    private void loadDbInfo() {

        // 类加载器读取 配置信息
        InputStream dbInfo = SqlSessionFactory.class.getClassLoader().getResourceAsStream(Configuration.DB_CONFIG_LOCATION);

        Properties properties = new Properties();
        try {
            properties.load(dbInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        configuration.setDbDriver(properties.getProperty("jdbc.driver"));
        configuration.setDbUrl(properties.getProperty("jdbc.url"));
        configuration.setDbUserName(properties.getProperty("jdbc.username"));
        configuration.setDbPassword(properties.getProperty("jdbc.password"));

    }
}
