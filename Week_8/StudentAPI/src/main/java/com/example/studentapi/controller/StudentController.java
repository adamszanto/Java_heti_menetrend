package com.example.studentapi.controller;

import com.example.studentapi.controller.dto.StudentDto;
import com.example.studentapi.mapper.StudentMapper;
import com.example.studentapi.service.StudentService;
import com.example.studentapi.service.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private final Logger logger = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;
    private final StudentMapper studentMapper;

    @Autowired
    public StudentController(StudentService studentService, StudentMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @GetMapping
    public void getStudent() {
        logger.info("Custom log: Got all students");
    }

    @GetMapping("all")
    public List<Student> getAll() {
        return studentService.selectAllStudents();
    }

    @GetMapping("{id}")
    public StudentDto getStudentById(@PathVariable(value = "id") Integer id) {
        logger.info("Custom log: Got user id: {}", id);
        Student student = studentService.selectStudentById(id);
        return studentMapper.convertModelToDto(student);
    }

    @GetMapping("number")
    public Integer getNumber() {
        return studentService.selectNumber();
    }

    @PostMapping("add")
    public ResponseEntity <Student> createStudent(@RequestParam String name, @RequestParam String email, @RequestParam Integer locker) {
        Student student = studentService.createStudent(name, email, locker);

        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }
}