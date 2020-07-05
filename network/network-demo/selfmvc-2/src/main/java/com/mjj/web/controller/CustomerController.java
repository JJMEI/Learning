//package com.mjj.web.controller;
//
//import com.mjj.web.model.Customer;
//import com.mjj.web.service.CustomerService;
//
//import java.util.List;
//
//@Controller
//public class CustomerController {
//
//    @Inject
//    private CustomerService customerService;
//
//    public View index(Param param){
//        List<Customer> customerList = customerService.getCustomerList();
//
//        return new View("customer.jsp").addModel("customerList",customerList);
//    }
//
//}
