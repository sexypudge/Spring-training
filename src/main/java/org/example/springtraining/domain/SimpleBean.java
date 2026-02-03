package org.example.springtraining.domain;

public class SimpleBean {
    private String username;

    public SimpleBean(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Đây là simple bean, tên là: " + username;
    }

    public String getUsername() { return username; }
}