package com.example.testtask.controller;

import com.example.testtask.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MainController
{
    private final UserService userService;
    @GetMapping("/")
    public String showMainPage(Model model)
    {
        model.addAttribute("users", userService.findAll());
        return "main";
    }

    @GetMapping("/login")
    public String showLoginPage()
    {
        return "login";
    }
}
