package com.example.studentapi;

import com.example.studentapi.mapper.StudentMapper;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.service.StudentService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ApplicationConfiguration {
    @Bean
    public StudentService studentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        return new StudentService(studentRepository, studentMapper);
    }

//    @Bean
//    public ObjectMapper objectMapper() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
//        return objectMapper;
//    }
}
