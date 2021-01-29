package com.example.demo;

import com.example.demo.dao.BookRepository;
import com.example.demo.dao.CourseRepository;
import com.example.demo.dao.StudentPassRepository;
import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Book;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.model.StudentPass;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentPassRepository studentPassRepository;

    @Autowired
    BookRepository bookRepository;

    @Bean
    CommandLineRunner commandLineRunner() { return args -> {

            Student s = new Student("tester");
            studentRepository.save(s);

            Course c = new Course("a");
            courseRepository.save(c);

            Book b = new Book("a");
            bookRepository.save(b);

            StudentPass sp = new StudentPass("a");
            studentPassRepository.save(sp);

            sp.setStudent(s);
            s.setStudentPass(sp);


            studentRepository.save(s);
            studentPassRepository.save(sp);
            //studentRepository.save(new Student("Tom"));
            //studentRepository.save(new Student("Jerry"));


        };
    }

}
