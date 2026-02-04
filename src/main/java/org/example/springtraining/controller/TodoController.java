package org.example.springtraining.controller;

import org.example.springtraining.domain.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class TodoController {
    // List tạm thay Database
    List<Todo> todoList = new CopyOnWriteArrayList<>();

    // Lấy danh sách việc cần làm
    @GetMapping("/listTodo")
    public String index(Model model, @RequestParam(value = "limit", required = false) Integer limit) {
        model.addAttribute("todoList", limit != null ? todoList.subList(0, limit) : todoList);
        return "listTodo";
    }

    // Trả về trang thêm công việc
    @GetMapping("/addTodo")
    public String addTodo(Model model) {
        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    // Nhận dữ liệu từ Form gửi lên
    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute Todo todo) {
        todoList.add(todo);
        return "success";
    }
}