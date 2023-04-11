package com.example.studentapi.repository;

import com.example.studentapi.repository.entity.StudentEntity;
import com.example.studentapi.service.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository <StudentEntity, Integer> {
    List<Student> findByName(String name);
    @Query("SELECT s FROM StudentEntity s WHERE s.name = :name")
    List<Student> selectByName(@Param("name") String name);
}

