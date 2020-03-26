package com.mjj.learning.self.mybatis;

import com.mjj.learning.self.mybatis.entity.TUser;
import com.mjj.learning.self.mybatis.mapper.TUserMapper;
import com.mjj.learning.self.mybatis.session.SqlSession;
import com.mjj.learning.self.mybatis.session.SqlSessionFactory;
import org.xml.sax.SAXException;

public class TestSelfMyBatis {

    public static void main(String[] args) throws SAXException {
        SqlSession sqlSession = new SqlSessionFactory().openSeesion();

        TUserMapper tUserMapper = sqlSession.getMapper(TUserMapper.class);

        System.out.println(tUserMapper.selectByPrimaryKey(1));

        for (TUser tUser : tUserMapper.selectAll()){
            System.out.println(tUser);
        }
    }
}
