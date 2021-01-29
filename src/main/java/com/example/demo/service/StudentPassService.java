package com.example.demo.service;

import com.example.demo.dao.StudentPassRepository;
import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;
import com.example.demo.model.StudentPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;


@Service
public class StudentPassService {

    @Autowired
    StudentPassRepository studentPassRepository;

    @Transactional
    public void insert(String name) {
        studentPassRepository.save(new StudentPass(name));
    }

    @Transactional
    public StudentPass getById(Long id) { return studentPassRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString())); }

    @Transactional
    public void updateById(Long Id, String name) {
        StudentPass studentPass = studentPassRepository.findById(Id).orElse(new StudentPass());
        studentPass.setName(name);
        studentPassRepository.save(studentPass);
    }

    @Transactional
    public void deleteById(Long id) {
        studentPassRepository.deleteById(id);
    }





}