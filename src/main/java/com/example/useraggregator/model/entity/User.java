package com.example.useraggregator.model.entity;

public class User {

    public User() {
    }

    public User(Long id, String username, String name, String surname) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
    }

    private Long id;

    private String username;
    private String name;
    private String surname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}