package com.mjj.learning.jdbc;

import org.testng.annotations.Test;

import java.sql.*;

public class JdbcTest {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "rootroot";







    @Test
    public void select(){

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{

            // 1. 加载mysql驱动,JDBC4.0不需要手动加载驱动
//            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取数据库连接
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            // 3. 获取sql执行器statement
            // Statement PrepareStatement
            statement = connection.createStatement();
            // 4. 执行sql
            resultSet = statement.executeQuery("select * from t_user where userName='MJJ' and password=" + "222;drop TABLE t_user");


            // 遍历resultSet;
            while (resultSet.next()){
                Integer id = resultSet.getInt("id");
                String userName = resultSet.getString("userName");
                String realName = resultSet.getString("realName");
                String mobile = resultSet.getString("mobile");
                String email = resultSet.getString("email");
                String note = resultSet.getString("note");
                String password = resultSet.getString("password");

                System.out.println(new TUser(id,userName,realName,mobile,email,note,password));
            }
        }catch ( SQLException e) {
            e.printStackTrace();
        }finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

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
