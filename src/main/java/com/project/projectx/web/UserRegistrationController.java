package com.project.projectx.web;

import com.project.projectx.model.entity.dto.UserRegistrationDTO;
import com.project.projectx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register() {
        return "auth-register";
    }
    @PostMapping("/register")
    String register(UserRegistrationDTO userRegistrationDTO) {

        userService.registerUser(userRegistrationDTO);

        return "redirect:/";
    }
}
