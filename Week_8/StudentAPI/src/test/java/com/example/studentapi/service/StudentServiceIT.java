package com.example.studentapi.service;

import com.example.studentapi.repository.CustomRepository;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.service.model.Student;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
public class StudentServiceIT {
    @Autowired
    private StudentService underTest;

    @Autowired
    private StudentRepository customRepository;

    @BeforeEach
    void init() {
        customRepository.deleteAll();
    }

    @Test
    void givenStudentWhenItIsSavedThenItMustBePersisted() {
        // Given
        Student student = new Student();
        student.setId(null);
        student.setName("Bello");
        student.setEmail("hello@free.hu");
        student.setLocker(13);

        // When
        Student result = underTest.createStudent(student);

        // Then
        Assertions.assertNotNull(result.getId());
        Assertions.assertEquals(1, customRepository.count());
    }
}
