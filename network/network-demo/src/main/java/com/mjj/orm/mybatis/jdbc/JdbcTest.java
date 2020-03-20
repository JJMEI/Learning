package com.mjj.orm.mybatis.jdbc;

import java.sql.*;
import java.util.Calendar;

/**
 *
 *
 * Statement
 *
 * PreparedStatement 预编译Statement   占位符 ? 防止sql注入  提升效率
 *
 * 为什么不使用 jdbc
 *  1. 使用繁琐
 *  2. 技术代码和业务代码耦合
 *  3. 连接资源需要手动关闭，存在安全隐患
 * @author meijunjie
 */
public class JdbcTest {



    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;


        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 2. 从DriverManagerzh
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","rootroot");

            // 3. 创建statement
            statement = connection.createStatement();

            // 4. 执行查询方法
            ResultSet resultSet = statement.executeQuery("select * from `order`");

            while (resultSet.next()){

                // ORM 可以自动映射
                System.out.println(resultSet.getLong("orderid"));
                System.out.println(resultSet.getDate(2, Calendar.getInstance()).toString());
                System.out.println(resultSet.getInt(3));
                System.out.println(resultSet.getInt(4));
            }

        }catch (Exception e){

        }finally {

            // 关闭连接
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
