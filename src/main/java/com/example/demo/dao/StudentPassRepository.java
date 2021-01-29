package com.example.demo.dao;

import com.example.demo.model.Student;
import com.example.demo.model.StudentPass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentPassRepository extends CrudRepository<StudentPass, Long> { }
