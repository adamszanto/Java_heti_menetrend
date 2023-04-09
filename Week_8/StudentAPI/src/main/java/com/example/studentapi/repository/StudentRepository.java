package com.example.studentapi.repository;

import com.example.studentapi.repository.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    private Map<Integer, StudentEntity> list = new HashMap<>();

    public StudentRepository() {
        list.put(10, new StudentEntity(10, "Lazlo A", "hello@freemail.hu", 13));
        list.put(11, new StudentEntity(11, "Lazlo H", "hello1@freemail.hu", 15));
        list.put(12, new StudentEntity(12, "Lazlo C", "hello2@freemail.hu", 16));
        list.put(13, new StudentEntity(13, "Lazlo K", "hello3@freemail.hu", 20));
    }

    public List<StudentEntity> findAllStudents() {
        return new ArrayList<>(list.values());
    }

    public StudentEntity save() {
        list.put(14, new StudentEntity(14, "Habak", "ukk@free", 22));
    //    return list.get(list.size());
        return findById(14);

    }

//    public Optional<Map.Entry<Integer, StudentEntity>> getById(Integer id) {
//        return list.entrySet().stream()
//                .filter(student -> student.getKey() == id)
//                .findFirst();
//    }

    public StudentEntity findById(Integer id) {
        return list.entrySet().stream()
                .filter(entry -> entry.getKey().equals(id))
                .map(Map.Entry::getValue)
                .findAny()
                .orElse(null);
    }
}
