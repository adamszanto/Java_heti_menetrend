package com.example.databasetestproject.controller;

import com.example.databasetestproject.repository.Student;
import com.example.databasetestproject.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path="/add")
    public ResponseEntity <Student> addNewUser (@RequestParam String name, @RequestParam String email) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        studentRepository.save(student);
        Student savedStudent = studentRepository.save(student);
        logger.info("Status code: {}", HttpStatus.CREATED);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
