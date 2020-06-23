package org.apache.test.demo;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.test.demo.mapper.ApplicationMapper;
import org.apache.test.demo.mapper.TUserMapper;
import org.apache.test.demo.pojo.Application;
import org.apache.test.demo.pojo.TUser;
import org.apache.test.demo.util.DbUtil;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by meijunjie on 2019/1/29.
 */
public class MybatisDemo {

    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = DbUtil.getSqlSession();


    try {
        System.out.println(sqlSession.toString());

        System.out.println("---------------------------------------------------------------------");


        ApplicationMapper applicationMapper = sqlSession.getMapper(ApplicationMapper.class);

        List<Application> applicationList = applicationMapper.selectAllWithAnnotation();
        applicationList.forEach(System.out::println);

        System.out.println(applicationMapper.selectApplication(1).toString());




        System.out.println("执行接口默认方法---------------------");
        applicationMapper.defaultMethod();

        applicationMapper.insertApplication(Application.builder().applicationName("APP1").owner("Mike1").build());
        sqlSession.commit();

    }catch (Exception e){
            e.printStackTrace();
        }finally {
        sqlSession.close();
        }
    }


    @Test
    public void testTUser(){
        SqlSession sqlSession = DbUtil.getSqlSession();

        TUserMapper tUserMapper = sqlSession.getMapper(TUserMapper.class);

        TUser tUser = TUser.builder().userName("Peter")
                .age(11)
                .sex("female")
                .iphone("13011028798")
                .email("peter@gmail.com")
                .address("america")
                .build();

        Long primaryKey = tUserMapper.insertUser(tUser);
        System.out.println(primaryKey);
        sqlSession.commit();
        sqlSession.close();
    }



    @Test
    public void testInsertUserWithPrimaryKey(){
        SqlSession sqlSession = DbUtil.getSqlSession();

        TUserMapper tUserMapper = sqlSession.getMapper(TUserMapper.class);

        TUser tUser = TUser.builder().userName("Jack")
                .age(11)
                .sex("female")
                .iphone("13011028798")
                .email("peter@gmail.com")
                .address("america")
                .build();

        tUserMapper.insertUserWithPrimaryKey(tUser);
        sqlSession.commit();
        System.out.println(tUser);
        sqlSession.close();
    }


    @Test
    public void testBatchInsertUser(){
        SqlSession sqlSession = DbUtil.getSqlSession();
        TUserMapper tUserMapper = sqlSession.getMapper(TUserMapper.class);

        List<TUser> tUsers = new ArrayList<>();


        for(int i=10000;i<1000000;i++){
            tUsers.add(TUser.builder().userName("Peter-"+i)
                    .age(11)
                    .sex("female")
                    .iphone("13011028798")
                    .email("peter@gmail.com")
                    .address("america")
                    .build());
        }

        System.out.println("成功插入行数: " + tUserMapper.batchInsertUser(tUsers));
        sqlSession.commit();
        sqlSession.close();

    }
}
