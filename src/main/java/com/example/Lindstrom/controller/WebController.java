package com.example.Lindstrom.controller;
import com.example.Lindstrom.business.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired
    ProjectService service;

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
