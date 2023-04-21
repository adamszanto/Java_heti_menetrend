package com.example.studentapi.service;

import com.example.studentapi.mapper.StudentMapper;
import com.example.studentapi.repository.CustomRepository;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.repository.entity.StudentEntity;
import com.example.studentapi.service.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    // Mockolni kell: Létrehozunk egy csontvázat, és megmondjuk hogy melyik metódus hogyan viselkedjen. Nem a valós objektumot használjuk.
    // Mock annotáció nem működik osztály annotáció nélkül ami: @ExtendWith
    @Mock
    private CustomRepository customRepository;
    private StudentMapper studentMapper;
    private StudentService underTest;

    // Lefut minden teszttel annotált tesztmetódus előtt
    @BeforeEach
    void init() {
        studentMapper = new StudentMapper();
        underTest = new StudentService(customRepository, studentMapper);
    }

    @Test
    void shouldUnderTestCreateNewStudentWhenStudentProvided() {
        // Given
        Student student = new Student();
        student.setId(101);
        student.setName("Bello");
        student.setEmail("hello@free.hu");
        student.setLocker(13);

        Student expectedResult = new Student();
        expectedResult.setId(student.getId());
        expectedResult.setName(student.getName());
        expectedResult.setEmail(student.getEmail());
        expectedResult.setLocker(student.getLocker());

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentId(student.getId());
        studentEntity.setName(student.getName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setLocker(student.getLocker());

        when(customRepository.save(studentEntity)).thenReturn(studentEntity);

        // When
        Student result = underTest.createStudent(student);

        // Then
        assertEquals(result, expectedResult);
        verify(customRepository).save(studentEntity);
    }

    @Test
    void shouldUnderTestSelectNumberReturnStudentsSize() {
        // Given
        List<StudentEntity> mockStudentEntities = new ArrayList<>();
        mockStudentEntities.add(new StudentEntity(101, "Bello", "hello@free1.hu", 24));
        mockStudentEntities.add(new StudentEntity(102, "Hello", "hello@free2.hu", 25));
        mockStudentEntities.add(new StudentEntity(103, "Eello", "hello@free3.hu", 26));

        when(customRepository.findAllStudent()).thenReturn(mockStudentEntities);

        Integer expected = mockStudentEntities.size();

        // When
        Integer result = underTest.selectNumber();

        // Then
        assertEquals(expected, result);
    }

    @Test
    void shouldUnderTestSelectStudentByIdReturnId() {
        // Given
        Student student = new Student();
        student.setId(101);
        student.setName("Bello");
        student.setEmail("hello@bell.o");
        student.setLocker(13);

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentId(student.getId());
        studentEntity.setName(student.getName());
        studentEntity.setEmail(student.getEmail());
        studentEntity.setLocker(student.getLocker());

        when(customRepository.findById(101)).thenReturn(studentEntity);

        // When
        Student result = underTest.selectStudentById(101);

        // Then
        assertEquals(result, student);
    }
}