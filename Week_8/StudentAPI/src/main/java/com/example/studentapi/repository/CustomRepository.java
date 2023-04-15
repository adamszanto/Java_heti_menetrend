package com.example.studentapi.repository;

import com.example.studentapi.repository.entity.StudentEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public StudentEntity findById(Integer id) {
        return entityManager.find(StudentEntity.class, id);
    }

    // Save az itt insert
    @Transactional
    public StudentEntity save(StudentEntity studentEntity) {
        // Megkapjuk a tranzakciós objektumot. Mérföldkövek: Megmondhatjuk hol kezdődik, hol végződik, plusz félúton is elmenthetjük
        // begin(), commit(), rollback()
        // entityManager.getTransaction().begin();

        entityManager.getTransaction();
        if(studentEntity.getId() != null) {
            entityManager.merge(studentEntity);
        } else {
            entityManager.persist(studentEntity);
        }
        return studentEntity;
    }

    public List<StudentEntity> findAllStudent() {
        return entityManager.createQuery("SELECT s FROM StudentEntity s", StudentEntity.class).getResultList();
    }
}
