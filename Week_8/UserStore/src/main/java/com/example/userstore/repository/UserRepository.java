package com.example.userstore.repository;

import com.example.userstore.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> list = new ArrayList<>();

    public UserRepository() {
        list.add(new User(100, "Bob", "bob@mese.hu", "Bobi"));
        list.add(new User(101, "Bobek", "bobek@mese.hu", "Bobeki"));
        list.add(new User(102, "Ed", "ed@mese.hu", "Edi"));
        list.add(new User(103, "Edd", "edd@mese.hu", "Eddi"));
        list.add(new User(104, "Ededi", "ededi@mese.hu", "Ededdi"));
    }

    public List<User> getAll() {
        return list;
    }

    public User getUserByInt(int id) {
        return list.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

//    public User save(User user) {
//        list.add(new User(300, "Hello", "hello@freemail.hu", "Bello"));
//        return user;
//    }

    public User save() {
        list.add(new User(300, "Hello", "hello@freemail.hu", "Bello"));
        return list.get(list.size()-1);
    }



    public int count() {
        return list.size();
    }




}
