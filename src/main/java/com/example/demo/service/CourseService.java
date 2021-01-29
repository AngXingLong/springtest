package com.example.demo.service;

import com.example.demo.dao.CourseRepository;
import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;


@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Transactional
    public void insert(String name) {
        courseRepository.save(new Course(name));
    }

    @Transactional
    public Course getById(Long id) { return courseRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString())); }

    @Transactional
    public void updateById(Long Id, String name) {
        Course course = courseRepository.findById(Id).orElse(new Course());
        course.setName(name);
        courseRepository.save(course);
    }

    @Transactional
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }





}