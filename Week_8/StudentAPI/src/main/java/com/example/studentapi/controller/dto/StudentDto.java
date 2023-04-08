package com.example.studentapi.controller.dto;

import com.example.studentapi.service.model.Student;

import java.util.Objects;

public class StudentDto {
    private Student student;

    public StudentDto() {

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentDto that = (StudentDto) o;

        return Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return student != null ? student.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "student=" + student +
                '}';
    }
}
