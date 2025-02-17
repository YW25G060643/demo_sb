package com.bootcamp.demo.demo_sb_customer;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.assertj.MockMvcTester.MockMvcRequestBuilder;

import com.bootcamp.demo.demo_sb_customer.service.CustomerService;

//every test file is a test env, with your targetbean cycle
//for unit test, we don`t need service &repository layer (bean)
@WebNvcTest(controllers = CustomerController.class)//context includes all web related beans
public class CustomerControllerTest {
    @MockBean
    private CustomerService customerService;

    //@WebNvcTest inject MockMvc Bean into context
    @Autowired
    private MockMvc mockMvc;//pretend Postman

    @Test
    void TestGetAllCustomers() throws Exception{
        ResultActions result = MockMvc.perform(MockMvcRequestBuilder.get("/customers"));
        //verify result
        result.andExpect(status().is0k())
          .andExpect(content().contentType())
    }
}
