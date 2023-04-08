package com.example.studentapi.repository;

import com.example.studentapi.repository.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class StudentRepository {
    private Map<Integer, StudentEntity> list = new HashMap<>();

    public StudentRepository() {
        list.put(10, new StudentEntity("Lazlo", "hello@freemail.hu", 13));
        list.put(11, new StudentEntity("Lazlo", "hello@freemail.hu", 15));
        list.put(12, new StudentEntity("Lazlo", "hello@freemail.hu", 16));
        list.put(13, new StudentEntity("Lazlo", "hello@freemail.hu", 20));
    }

    public Map<Integer, StudentEntity> getAllStudends() {
        return list;
    }

    public StudentEntity save() {
        list.put(14, new StudentEntity("Habak", "ukk@free", 22));
        return list.get(list.size()-1);

    }

    public Optional<Map.Entry<Integer, StudentEntity>> getById(Integer id) {
        return list.entrySet().stream()
                .filter(student -> student.getKey() == id)
                .findFirst();
    }
}
