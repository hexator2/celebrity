package com.bluff.celebrytalk.controller;

import com.bluff.celebrytalk.service.ManagerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ManagerController {
    private final ManagerService managerService;

    @RequestMapping("/managerList")
    @Cacheable(value = "vets")
    public String home() {
        log.info("manager controller");
        return "manager/manager";
    }

}
