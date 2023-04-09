package com.example.studentapi.repository.entity;

import java.util.Objects;

public class StudentEntity {
    private Integer id;
    private String name;
    private String email;
    private Integer lockerNumber;

    public StudentEntity(Integer id, String name, String email, Integer lockerNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lockerNumber = lockerNumber;
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

    public Integer getLockerNumber() {
        return lockerNumber;
    }

    public void setLockerNumber(Integer lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(email, that.email)) return false;
        return Objects.equals(lockerNumber, that.lockerNumber);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (lockerNumber != null ? lockerNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", lockerNumber=" + lockerNumber +
                '}';
    }
}
