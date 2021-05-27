package com.bluff.celebrytalk.controller;

import com.bluff.celebrytalk.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
}
