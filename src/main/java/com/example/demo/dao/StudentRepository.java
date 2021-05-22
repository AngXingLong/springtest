package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends  CrudRepository<Student, Long>, RevisionRepository<Student, Long, Long> {

    //@EntityGraph(attributePaths = { "books" })
    List<Student> findByName(String name);

}
