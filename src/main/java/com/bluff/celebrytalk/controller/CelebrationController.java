package com.bluff.celebrytalk.controller;

import com.bluff.celebrytalk.service.CelebrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CelebrationController {
    private final CelebrationService celebrationService;

    @RequestMapping("/celebrationList")
    @Cacheable(value = "vets")
    public String home() {
        log.info("celebration controller");
        return "celebration/celebration";
    }

}
