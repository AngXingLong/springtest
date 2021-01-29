package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.Student;
import com.example.demo.service.BookService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/book/insert", method = { RequestMethod.GET, RequestMethod.POST })
    public void insertStudent(@RequestParam(required = true) String name) {
        bookService.insert(name);
    }

    @RequestMapping(value = "/book/select", method = { RequestMethod.GET, RequestMethod.POST })
    public Book getStudent(@RequestParam(required = true) Long id) {
        return bookService.getById(id);
    }

    @RequestMapping(value = "/book/delete", method = { RequestMethod.GET, RequestMethod.POST })
    public void deleteStudent(@RequestParam(required = true) Long id) { bookService.deleteById(id); }

    @RequestMapping(value = "/book/update", method = { RequestMethod.GET, RequestMethod.POST })
    public void updateStudent(@RequestParam(required = true) Long id, @RequestParam(required = true) String name) { bookService.updateById(id, name);}

}