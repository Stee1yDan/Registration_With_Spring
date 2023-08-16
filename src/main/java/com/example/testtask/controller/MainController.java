package com.example.testtask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
{
    @GetMapping("/")
    public String showMainPage()
    {
        return "main";
    }

    @GetMapping("/login")
    public String showLoginPage()
    {
        return "login";
    }
}
