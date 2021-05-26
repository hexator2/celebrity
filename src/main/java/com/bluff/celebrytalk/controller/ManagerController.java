package com.bluff.celebrytalk.controller;

import com.bluff.celebrytalk.service.ManagerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ManagerController {
    private final ManagerService managerService;

}
