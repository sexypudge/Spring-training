package org.example.springtraining.domain;

public class MySqlConnector {
    private String url;

    public void connect() {
        System.out.println("Đã kết nối tới Database: " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }
}