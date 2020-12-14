package org.apache.test.jdbc.demo;


import org.junit.Test;

import java.sql.*;

/**
 *
 * 使用JDBC编程的优缺点
 *  优点：
 *      执行速度相对较快
 *
 *  缺点:
 *      使用起来复杂，业务代码和技术代码耦合严重，不利于开发
 *      存在资源泄漏的风险，所有资源都需要子啊finally代码块里手动释放，资源可复用性差，浪费资源
 *
 *
 *  PreparedStatement vs Statement
 *
 *  PreparedStatement 继承与Statement
 *  PreparedStatement第一次查询数据库会采用预编译操作，耗时较Statement长，时候多次重复查
 *  Statement 采用字符串拼接的方式生生成sql 会产生sql注入的风险
 *  PreparedStatement 采用占位符的方式，会对传入的参数进行转义操作，避免sql注入的风险
 *
 * 最佳范式
 * Connection connection = null;
 * PreparedStatement statement = null;
 * ResultSet resultSet = null;
 * try{
 *     // 1. 加载驱动,jdbc4.0 DriverManager可以自动加载驱动
 *     Class.forName("com.mysql.jdbc.Driver");
 *
 *     // 2. 从驱动管理器DriverManager中获取Connection;
 *     connection = DriverManager.getConnection(url,userName,password);
 *
 *     // 3. 从connection中获取PreparedStatement 预编译
 *     statement = connection.prepareStatement(sql);
 *
 *     // 4. 设置preparedStatement 参数,手动设值
 *     // 5. 执行
 *     resultSet = preparedStatement.executeQuery();
 *
 *     // 遍历resultSet;
 *     while(resultSet.next()){
 *         // do something;
 *     }
 * }catch(Exception e){
 *     // do something;
 * }finally{
 *
 *     // 释放资源
 *     if(resultSet != null){
 *         resultSet.close();
 *     }
 *
 *     if(preparedStatement != null){
 *         preparedStatement.close();
 *     }
 *
 *     if(connection != null){
 *         connection.close();
 *     }
 * }
 *
 * Created by meijunjie on 2019/1/30.
 */
public class JdbcDemo {



    @Test
    public void testPreparedStatement() throws ClassNotFoundException, SQLException {

        // 1. 注册驱动 static
        Class.forName("com.mysql.jdbc.Driver");

        // 预编译是由手动开启的  ?&useServerPrepStmts=true
        String dbUrl = "jdbc:mysql://localhost:3306/t_wp_user?&useServerPrepStmts=true&cachePrepStmts=true";
        String dbUsername = "root";
        String dbPassword = "rootroot";
        // 2. 创建数据库连接
        Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM t_application where application_name=?");

        preparedStatement.setString(1,"legou-m-api");

        ResultSet resultSet = preparedStatement.executeQuery();

        preparedStatement.setString(1,"legou-u-api");

        long start = System.currentTimeMillis();






        System.out.println("耗时:" + (System.currentTimeMillis()  - start)/1000 + " 秒");



        while (resultSet.next()){
            System.out.println(resultSet.getMetaData().getColumnName(1) + ": " + resultSet.getString(1));
            System.out.println(resultSet.getMetaData().getColumnName(2) + ": " + resultSet.getString(2));
            System.out.println(resultSet.getMetaData().getColumnName(3) + ": " + resultSet.getString(3));
            System.out.println(resultSet.getMetaData().getColumnName(4) + ": " + resultSet.getString(4));
            System.out.println(resultSet.getMetaData().getColumnName(5) + ": " + resultSet.getString(5));
        }

        resultSet.close();
        preparedStatement.close();


        PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT * FROM t_application where application_name=?");

        preparedStatement2.setString(1,"legou-u-api");
        ResultSet resultSet2 = preparedStatement2.executeQuery();


    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 注册驱动 static
        Class.forName("com.mysql.jdbc.Driver");

        String dbUrl = "jdbc:mysql://localhost:3306/t_wp_user";
        String dbUsername = "root";
        String dbPassword = "rootroot";
        // 2. 创建数据库连接
        Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        // 3. 得到执行SQL的Statement
        Statement statement = connection.createStatement();

        String sql = "select * from t_application";

        // 查询
        ResultSet resultSet = statement.executeQuery(sql);


//        statement.addBatch();
//
//        statement.executeBatch()

//        int changeID = statement.executeUpdate("update t_application set application_name='fuck' WHERE id=1");


        while (resultSet.next()){
            // resultSet.getMetaData() 表字段元数据
            System.out.println(resultSet.getMetaData().toString());
            System.out.println(resultSet.getMetaData().getColumnName(1) + ": " + resultSet.getString(1));
            System.out.println(resultSet.getMetaData().getColumnName(2) + ": " + resultSet.getString(2));
            System.out.println(resultSet.getMetaData().getColumnName(3) + ": " + resultSet.getString(3));
            System.out.println(resultSet.getMetaData().getColumnName(4) + ": " + resultSet.getString(4));
            System.out.println(resultSet.getMetaData().getColumnName(5) + ": " + resultSet.getString(5));
            System.out.println("---------------------------------------------");

        }

        // 释放资源
        resultSet.close();
        connection.close();

    }
}
