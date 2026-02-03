package com.dev4vn.first_springboot;

import com.dev4vn.first_springboot.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets")
public class PetController {
    @GetMapping("/register")
    public String showForm() {
        return "register-pet";
    }

    @PostMapping("/register")
    public String registerPet(@ModelAttribute Pet pet, Model model) {
        System.out.println("Dữ liệu nhận được: " + pet.getName() + " - " + pet.getAge());
        model.addAttribute("message", "Đăng ký thành công cho " + pet.getName());
        return "success";
    }
}