package com.example.studentapi.service;

import com.example.studentapi.mapper.StudentMapper;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.repository.entity.StudentEntity;
import com.example.studentapi.service.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final Logger logger = LoggerFactory.getLogger(StudentService.class);
    private  StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public List<Student> selectAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentEntity -> studentMapper.convertEntityToModel(studentEntity))
                .collect(Collectors.toList());
    }

    public Integer selectNumber() {
        return selectAllStudents().size();
    }

    public Student createStudent(String name, String email, Integer locker) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(name);
        studentEntity.setEmail(email);
        studentEntity.setLocker(locker);
        studentRepository.save(studentEntity);
        logger.info("Custom log: Status code: {}", HttpStatus.CREATED);
        return studentMapper.convertEntityToModel(studentEntity);
    }

    public Student selectStudentById(Integer id) {
        StudentEntity studentEntity = studentRepository.getById(id);
        return studentMapper.convertEntityToModel(studentEntity);
    }
}