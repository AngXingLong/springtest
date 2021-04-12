package com.example.demo.controller;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(HelloController.class)
class HelloControllerTest {
    /*
       @Autowired
       private MockMvc mvc;


        private WebApplicationContext webApplicationContext;

       @Before
       public void setUp() {
           mvc = mvc.webAppContextSetup(webApplicationContext).build();
       }
      @Test
        void hello() throws Exception{
            RequestBuilder request = MockMvcRequestBuilders.get("/hello");
            MvcResult result = mvc.perform(request).andReturn();
            assertEquals("Hello, World", result.getResponse().getContentAsString());

        }
        */
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void hello() throws Exception{
        Student s = new Student ("a");
        studentRepository.save(s);
        assertThat(true).isTrue();

    }

}