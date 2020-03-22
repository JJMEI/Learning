package com.mjj.orm.mybatis.demo;

import com.mjj.orm.mybatis.demo.dto.TMmallOrder;
import com.mjj.orm.mybatis.demo.mapper.OrderMapperBasedAnnotation;
import com.mjj.orm.mybatis.demo.mapper.TMmallOrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.util.Date;
import java.util.List;

public class MainTest {

    SqlSessionFactory sqlSessionFactory = null;
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsReader("mybatis-config.xml"));


        SqlSession sqlSession = sqlSessionFactory.openSession();

    }


    @Before
    public void initialization() throws IOException {
        sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsReader("mybatis-config.xml"));
    }


    /**
     * 最优的是订单
     * 如果没有填充订单
     * 则选择的全部
     */
    @Test
    public void testDynamicSqlForIfOperation(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

       for (TMmallOrder order : sqlSession.getMapper(TMmallOrderMapper.class).getByOrderNoOrUid("5820032012476819188224000",301781103L)){
           System.out.println(order);
       }
    }

}
