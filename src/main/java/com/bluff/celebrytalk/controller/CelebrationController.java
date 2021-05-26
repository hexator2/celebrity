package com.bluff.celebrytalk.controller;

import com.bluff.celebrytalk.service.CelebrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CelebrationController {
    private final CelebrationService celebrationService;

    @GetMapping(value = "celebrations")
    public String list(Model model) {
        log.info("celebrations list controller");
        return "index";
    }

}
