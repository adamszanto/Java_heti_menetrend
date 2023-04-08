package com.example.studentapi.service;

import com.example.studentapi.mapper.StudentMapper;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.repository.entity.StudentEntity;
import com.example.studentapi.service.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
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

    public Map<Integer, Student> getAllStudents() {
        Map<Integer, StudentEntity> studentEntities = studentRepository.getAllStudends();

        return studentEntities.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> studentMapper.convertEntityToModel(entry.getValue())
                ));
    }

    public Integer getNumber() {
        return getAllStudents().size();
    }

    public Student createStudent() {
        StudentEntity studentEntity = studentRepository.save();
        return studentMapper.convertEntityToModel(studentEntity);
    }

    public Student getStudentById(Integer id) {
        StudentEntity studentEntity = studentRepository.getById(id);
        if(studentEntity != null) {
            return studentMapper.convertEntityToModel(studentEntity);
        } else {
            return null;
        }
    }
}
