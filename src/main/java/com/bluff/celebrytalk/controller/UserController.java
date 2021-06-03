package com.bluff.celebrytalk.controller;

import com.bluff.celebrytalk.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @RequestMapping("/user")
    @Cacheable(value = "vets")
    public String home(Model model) {
        log.info("user controller");

        model.addAttribute("user", "user112");

        return "user/user";
    }
}
