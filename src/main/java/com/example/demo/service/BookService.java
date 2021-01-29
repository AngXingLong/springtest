package com.example.demo.service;

import com.example.demo.dao.BookRepository;
import com.example.demo.model.Book;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;


@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Transactional
    public void insert(String name) {
        bookRepository.save(new Book(name));
    }

    @Transactional
    public Book getById(Long id) { return bookRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString())); }

    @Transactional
    public void updateById(Long Id, String name) {
        Book book = bookRepository.findById(Id).orElse(new Book());
        book.setName(name);
        bookRepository.save(book);
    }

    @Transactional
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

}