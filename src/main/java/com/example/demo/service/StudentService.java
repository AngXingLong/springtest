package com.example.demo.service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public void insert(String name) {
        studentRepository.save(new Student(name));
    }

    @Transactional
    public Student getById(Long id) { return studentRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString())); }

    @Transactional
    public void updateById(Long Id, String name) {
        Student student = studentRepository.findById(Id).orElse(new Student());
        student.setName(name);
        studentRepository.save(student);
    }

    @Transactional
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }





}