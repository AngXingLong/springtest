package com.example.demo.controller;

import com.example.demo.model.Session;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/session")
public class SessionController {

    @GetMapping
    public Session sessionGet(HttpSession httpSession){
        return new Session(httpSession);
    }

    @PostMapping
    public Session sessionSet(HttpSession httpSession){
        Session sessionData = new Session (httpSession);
        sessionData.setId(1L);
        sessionData.setUsername("hey");
        return new Session(httpSession);
    }


}


