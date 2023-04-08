package com.example.userstore.repository;

import com.example.userstore.repository.entity.UserEntity;
import com.example.userstore.service.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    // private List<UserEntity> list = new ArrayList<>();
    private Map<Integer, UserEntity> list = new HashMap<>();

//    public UserRepository() {
//        list.add(new UserEntity(100, "Bob", "bob@mese.hu", "Bobi"));
//        list.add(new UserEntity(101, "Bobek", "bobek@mese.hu", "Bobeki"));
//        list.add(new UserEntity(102, "Ed", "ed@mese.hu", "Edi"));
//        list.add(new UserEntity(103, "Edd", "edd@mese.hu", "Eddi"));
//        list.add(new UserEntity(104, "Ededi", "ededi@mese.hu", "Ededdi"));
//    }

    public UserRepository() {
        list.put(100, new UserEntity("Bob", "bob@mese.hu", "Bobi"));
        list.put(101, new UserEntity("Bobek", "bobe@mese.hu", "Bobeki"));
        list.put(102, new UserEntity("Ed", "ed@mese.hu", "Edi"));
        list.put(103, new UserEntity("Edd", "edd@mese.hu", "Eddi"));
        list.put(104, new UserEntity("Eddedi", "ededi@mese.hu", "Ededdi"));
    }

    public List<UserEntity> getAll() {
        return list;
    }

    // Primitívet ne használjak id-nek, nullt ne adjunk vissza... akkor optinalt kellene inkább használni.
    public UserEntity getUserByInt(int id) {
        return list.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }


    public UserEntity save() {
        list.add(new UserEntity("Hello", "hello@freemail.hu", "Bello"));
        return list.get(list.size()-1);
    }



    public int count() {
        return list.size();
    }




}
