package com.mjj.learning.self.mybatis.config;


import com.mjj.learning.self.mybatis.binding.MapperProxyFactory;
import com.mjj.learning.self.mybatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 整个框架的配置类
 * @author meijunjie
 */
public class Configuration {

    /**
     * 记录mapper.xml的存放位置
     */
    public static final String MAPPER_CONFIG_LOCATION = "config";

    /**
     * 记录数据库配置信息文件存放的位置
     */
    public static final String DB_CONFIG_LOCATION = "db.properties";


    private String dbUrl;
    private String dbUserName;
    private String dbPassword;
    private String dbDriver;


    protected final Map<String,MappedStatement> mappedStatements = new HashMap<>();

    /**
     * 为mapper接口动态生成代理类  mybatis一个关键点
     * @param type
     * @param sqlsession
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> type, SqlSession sqlsession){
        return MapperProxyFactory.getMapperProxy(sqlsession,type);
    }

    /**
     * 获取所有MappedStatements
     * @return
     */
    public Map<String,MappedStatement> getMappedStatements(){
        return mappedStatements;
    }

    /**
     * 获取指定资源的MappedStatement
     * @param sourceId
     * @return
     */
    public MappedStatement getMappedStatement(String sourceId){
        return mappedStatements.get(sourceId);
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "dbUrl='" + dbUrl + '\'' +
                ", dbUserName='" + dbUserName + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                ", dbDriver='" + dbDriver + '\'' +
                ", mappedStatements=" + mappedStatements +
                '}';
    }
}
