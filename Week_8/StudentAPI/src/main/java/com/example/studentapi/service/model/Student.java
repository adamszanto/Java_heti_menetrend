package com.example.studentapi.service.model;

import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer locker;

    public Student(Integer id, String name, String email, Integer locker) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.locker = locker;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

        Student student = (Student) o;

        if (!Objects.equals(name, student.name)) return false;
        if (!Objects.equals(email, student.email)) return false;
        return Objects.equals(locker, student.locker);
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
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", lockerNumber=" + locker +
                '}';
    }
}
