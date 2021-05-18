package com.bluff.celebrity.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("admin")
    public String index() {
        return "index";
    }
}