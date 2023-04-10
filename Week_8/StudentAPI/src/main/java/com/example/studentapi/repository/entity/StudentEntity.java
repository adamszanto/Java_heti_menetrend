package com.example.studentapi.repository.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="locker")
    private Integer locker;

    public StudentEntity(Integer id, String name, String email, Integer locker) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.locker = locker;
    }

    public StudentEntity() {
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLocker() {
        return locker;
    }

    public void setLocker(Integer locker) {
        this.locker = locker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(email, that.email)) return false;
        return Objects.equals(locker, that.locker);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (locker != null ? locker.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", locker=" + locker +
                '}';
    }
}