package com.example.studentapi.repository;

import com.example.studentapi.repository.entity.StudentEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

import static jakarta.transaction.Transactional.TxType.REQUIRES_NEW;

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

        //entityManager.getTransaction();
        if(studentEntity.getStudentId() != null) {
            entityManager.merge(studentEntity);
        } else {
            entityManager.persist(studentEntity);
        }
        return studentEntity;
    }

    public List<StudentEntity> findAllStudent() {
        return entityManager.createQuery("SELECT s FROM StudentEntity s", StudentEntity.class).getResultList();
    }

    public Long count() {
        List<Long> result = entityManager.createQuery("SELECT COUNT(s) as cnt FROM StudentEntity s").getResultList();
        if(!result.isEmpty()) {
            return result.get(0);
        }
        return 0L;
    }
    @Transactional
    public void deleteAll() {
        entityManager.createQuery("DELETE FROM StudentEntity").executeUpdate();
    }
}
