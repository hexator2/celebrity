package com.bluff.celebrytalk.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexApiController {
    @RequestMapping("index")
    public String index() {
        // adminService.insert();
        return "API Test";
    }

}