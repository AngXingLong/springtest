package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.StudentPass;
import com.example.demo.service.StudentPassService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentPassController {

    @Autowired
    StudentPassService studentPassService;

    @RequestMapping(value = "/student-pass/insert", method = { RequestMethod.GET, RequestMethod.POST })
    public void insertStudent(@RequestParam(required = true) String name) {
        studentPassService.insert(name);
    }

    @RequestMapping(value = "/student-pass/select", method = { RequestMethod.GET, RequestMethod.POST })
    public StudentPass getStudent(@RequestParam(required = true) Long id) {
        return studentPassService.getById(id);
    }

    @RequestMapping(value = "/student-pass/delete", method = { RequestMethod.GET, RequestMethod.POST })
    public void deleteStudent(@RequestParam(required = true) Long id) { studentPassService.deleteById(id); }

    @RequestMapping(value = "/student-pass/update", method = { RequestMethod.GET, RequestMethod.POST })
    public void updateStudent(@RequestParam(required = true) Long id, @RequestParam(required = true) String name) { studentPassService.updateById(id, name);}

}