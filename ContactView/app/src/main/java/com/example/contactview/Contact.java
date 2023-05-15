package com.example.contactview;

public class Contact {
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private String profileImage;

    public Contact(String fullName, String email, String phone, String address, String profileImage) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.profileImage = profileImage;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
