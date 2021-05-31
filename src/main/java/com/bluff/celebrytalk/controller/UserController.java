package com.bluff.celebrytalk.controller;

import com.bluff.celebrytalk.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @RequestMapping("/userList")
    @Cacheable(value = "vets")
    public String home() {
        log.info("user controller");
        return "user/user";
    }
}
