package com.example.studentapi.repository;

import com.example.studentapi.repository.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <StudentEntity, Integer> {

}
