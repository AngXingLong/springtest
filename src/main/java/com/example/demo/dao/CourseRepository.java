package com.example.demo.dao;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {}
