package org.example.springtraining.domain;

import io.micrometer.common.util.StringUtils;

import java.util.Optional;

public class TodoValidator {
    public boolean isValid(Todo todo) {
        return Optional.ofNullable(todo)
                .filter(t -> !StringUtils.isEmpty(t.getTitle())) // Kiểm tra title khác rỗng
                .filter(t -> !StringUtils.isEmpty(t.getDetail())) // Kiểm tra detail khác rỗng
                .isPresent();
    }
}

