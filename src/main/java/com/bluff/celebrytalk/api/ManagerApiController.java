package com.bluff.celebrytalk.api;


import com.bluff.celebrytalk.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ManagerApiController {
    private final ManagerService managerService;
    
}
