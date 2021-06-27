package com.bluff.celebrytalk.api;

import com.bluff.celebrytalk.service.CelebrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CelebrationApiController {
    private final CelebrationService celebrationService;

}
