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

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
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
    public List<StudentDto> getAll() {
        List<Student> studentList = studentService.selectAllStudents();

        List<StudentDto> studentDtoList = new ArrayList<>();

        for(Student student : studentList) {
            StudentDto studentDto = studentMapper.convertModelToDto(student);
        }

        return studentDtoList;
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

    // TODO: StudentDto-t kell visszaadni:
    @PostMapping
    public ResponseEntity <StudentDto> createStudent(@RequestBody StudentDto studentDto) {
        Student student = studentService.createStudent(studentDto.getStudent());
        StudentDto convertedStudent = studentMapper.convertModelToDto(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(convertedStudent);
    }
}