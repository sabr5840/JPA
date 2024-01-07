package com.example.jpastudent.repositorie;

import com.example.jpastudent.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {


    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneSabrina(){
        List<Student> lst = studentRepository.findAllByName("Sabrina");
        assertEquals(1, lst.size());
    }

    @Test
    void testOneNaja(){
        Student s1 = new Student();
        s1.setName("Naja");
        s1.setBornDate(LocalDate.of(2010, 11, 12));
        studentRepository.save(s1);
        List<Student> lst = studentRepository.findAllByName("Naja");
        assertEquals(1, lst.size());
    }


}