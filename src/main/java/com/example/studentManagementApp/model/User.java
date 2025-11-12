package com.example.studentManagementApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

    private String userName;
    private String email;
    @JsonIgnore
    private String password;
    private String role;

    public User(){

    }

    public User(String userName, String email, String password, String role) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setRole(String role) {
        this.role = role;
    }
}
