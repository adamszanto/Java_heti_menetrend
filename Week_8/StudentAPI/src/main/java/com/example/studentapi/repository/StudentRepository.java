package com.example.studentapi.repository;

import com.example.studentapi.repository.entity.StudentEntity;
import com.example.studentapi.service.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class StudentRepository {
    private Map<Integer, StudentEntity> list = new HashMap<>();

    public StudentRepository() {
        list.put(10, new StudentEntity("Lazlo A", "hello@freemail.hu", 13));
        list.put(11, new StudentEntity("Lazlo H", "hello1@freemail.hu", 15));
        list.put(12, new StudentEntity("Lazlo C", "hello2@freemail.hu", 16));
        list.put(13, new StudentEntity("Lazlo K", "hello3@freemail.hu", 20));
    }

    public Map<Integer, StudentEntity> getAllStudends() {
        return list;
    }

    public StudentEntity save() {
        list.put(14, new StudentEntity("Habak", "ukk@free", 22));
    //    return list.get(list.size());
        return getById(14);

    }

//    public Optional<Map.Entry<Integer, StudentEntity>> getById(Integer id) {
//        return list.entrySet().stream()
//                .filter(student -> student.getKey() == id)
//                .findFirst();
//    }

    public StudentEntity getById(Integer id) {
        return list.entrySet().stream()
                .filter(entry -> entry.getKey().equals(id))
                .map(Map.Entry::getValue)
                .findAny()
                .orElse(null);
    }
}
