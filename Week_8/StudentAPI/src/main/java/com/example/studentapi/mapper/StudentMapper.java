package com.example.studentapi.mapper;

import com.example.studentapi.controller.dto.StudentDto;
import com.example.studentapi.repository.entity.StudentEntity;
import com.example.studentapi.service.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public StudentEntity convertModelToEntity(Student student) {
        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setName(student.getName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setLockerNumber(student.getLockerNumber());

        return studentEntity;
    }

    public Student convertEntityToModel(StudentEntity studentEntity) {
        Student student = new Student();

        student.setName(studentEntity.getName());
        student.setEmail(studentEntity.getEmail());
        student.setLockerNumber(student.getLockerNumber());

        return student;
    }

    public StudentDto convertModelToDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setStudent(student);

        return studentDto;
    }

}
