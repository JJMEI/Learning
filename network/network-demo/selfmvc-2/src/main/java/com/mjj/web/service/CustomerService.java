package com.mjj.web.service;

import com.mjj.web.model.Customer;
import com.mjj.web.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author meijunjie
 */
public class CustomerService {


    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        Properties properties = PropsUtil.loadProps("db.properties");
        DRIVER = properties.getProperty("jdbc.driver");
        URL = properties.getProperty("jdbc.url");
        USERNAME = properties.getProperty("jdbc.username");
        PASSWORD = properties.getProperty("jdbc.password");

        // 加载驱动
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver ",e);
            throw new RuntimeException("can not load jdbc driver");
        }
    }

    public List<Customer> getCustomerList(String keyWord){
        // TODO
        return null;
    }

    public List<Customer> getCustomerList(){

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Customer> result = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

            String sql = "select * from t_customer";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                result.add(new Customer(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("email"),
                        resultSet.getInt("score")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(resultSet != null){
                try{
                    resultSet.close();
                } catch (SQLException e) {
                    LOGGER.error("can not close result set ",e);
                }
            }
            if(preparedStatement != null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    LOGGER.error("can not close prepared statement ",e);
                }
            }

        }

        return result;
    }

    public Customer getCustomer(Long id){
        return null;
    }

    /**
     * 最佳实践 参数具体描述或者使用bean封装
     * @param customer
     * @return
     */
    public boolean createCustomer(Customer customer){

        // TODO
        return false;
    }

    public boolean updateCustomer(Customer customer){
        // TODO
        return false;
    }

    public boolean deleteCustomer(Customer customer){
        // TODO
        return false;
    }


}
