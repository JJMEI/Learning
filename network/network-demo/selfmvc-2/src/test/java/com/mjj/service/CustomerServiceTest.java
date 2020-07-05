package com.mjj.service;

import com.mjj.web.model.Customer;
import com.mjj.web.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }


    @Before
    public void init(){
        // TODO 初始化数据库
    }

    @Test
    public void getCustomerListTest(){
        CustomerService customerService = new CustomerService();
        List<Customer> customers = customerService.getCustomerList();
        Assert.assertEquals(5,customers.size());
    }


    @Test
    public void getCustomerTest(){
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomer(){
        Customer customer = new Customer();

        boolean crateResult = customerService.createCustomer(customer);
        Assert.assertEquals(true,crateResult);
    }
}
