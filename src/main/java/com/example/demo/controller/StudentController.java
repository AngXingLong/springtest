package com.example.demo.controller;

import java.util.Optional;

import com.example.demo.model.Student;
import com.example.demo.dao.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student/insert", method = { RequestMethod.GET, RequestMethod.POST })
    public void insertStudent(@RequestParam(required = true) String name) {
        studentService.insert(name);
    }

    @RequestMapping(value = "/student/select", method = { RequestMethod.GET, RequestMethod.POST })
    public Student getStudent(@RequestParam(required = true) Long id) {
        return studentService.getById(id);
    }

    @RequestMapping(value = "/student/delete", method = { RequestMethod.GET, RequestMethod.POST })
    public void deleteStudent(@RequestParam(required = true) Long id) { studentService.deleteById(id); }

    @RequestMapping(value = "/student/update", method = { RequestMethod.GET, RequestMethod.POST })
    public void updateStudent(@RequestParam(required = true) Long id, @RequestParam(required = true) String name) { studentService.updateById(id, name);}

}