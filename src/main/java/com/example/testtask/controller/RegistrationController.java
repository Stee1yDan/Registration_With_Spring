package com.example.testtask.controller;

import com.example.testtask.model.User;
import com.example.testtask.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RegistrationController
{
    private final UserService userService;
    @GetMapping("/registration")
    public String register(Model model)
    {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String register(@ModelAttribute("user") @Valid User user, Model model)
    {
        userService.saveUser(user);
        System.out.println(user);
        return "redirect:/login";
    }

}
