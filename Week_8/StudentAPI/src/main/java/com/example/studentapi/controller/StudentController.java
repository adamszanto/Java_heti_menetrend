package com.example.studentapi.controller;

import com.example.studentapi.controller.dto.StudentDto;
import com.example.studentapi.mapper.StudentMapper;
import com.example.studentapi.service.StudentService;
import com.example.studentapi.service.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@EnableScheduling
@RestController
@RequestMapping("student")
public class StudentController {

    private final Logger logger = LoggerFactory.getLogger(StudentController.class);
    private StudentService studentService;
    private StudentMapper studentMapper;

    @Autowired
    public StudentController(StudentService studentService, StudentMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    public StudentController() {
    }

    @GetMapping
    public void getStudent() {
        logger.info("Got all students");
    }

    @GetMapping("all")
    public Map<Integer, Student> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("{id}")
    public StudentDto getStudentById(@PathVariable(value = "id") Integer id) {
        logger.info("Got user id: {}", id);
        Student student = studentService.getStudentById(id);
        return studentMapper.convertModelToDto(student);
    }

    @GetMapping("number")
    public Integer getNumber() {
        return studentService.getNumber();
    }

    @PostMapping
    public StudentDto createStudent() {
        logger.info("New student has been created");
        Student student = studentService.createStudent();
        return studentMapper.convertModelToDto(student);
    }
}
