package com.example.jpastudent.config;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.repositorie.StudentRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class initData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Sabrina");
        s1.setBornDate(LocalDate.of(2001, 8, 19));

        Student s2 = new Student();
        s2.setName("Mathilde");
        s2.setBornDate(LocalDate.of(1996, 12, 30));

        studentRepository.save(s1);
        studentRepository.save(s2);

    }
}
