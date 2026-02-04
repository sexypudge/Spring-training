package org.example.springtraining.domain;

import lombok.Data;

@Data // Dùng Lombok để tự tạo Getter/Setter
public class Todo {
    private String title;
    private String detail;
}