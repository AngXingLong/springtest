package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/course/insert", method = { RequestMethod.GET, RequestMethod.POST })
    public void insertStudent(@RequestParam(required = true) String name) {
        courseService.insert(name);
    }

    @RequestMapping(value = "/course/select", method = { RequestMethod.GET, RequestMethod.POST })
    public Course getStudent(@RequestParam(required = true) Long id) {
        return courseService.getById(id);
    }

    @RequestMapping(value = "/course/delete", method = { RequestMethod.GET, RequestMethod.POST })
    public void deleteStudent(@RequestParam(required = true) Long id) { courseService.deleteById(id); }

    @RequestMapping(value = "/course/update", method = { RequestMethod.GET, RequestMethod.POST })
    public void updateStudent(@RequestParam(required = true) Long id, @RequestParam(required = true) String name) { courseService.updateById(id, name);}

}