package com.bluff.celebrity.api.controller;

import com.bluff.celebrity.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    AdminService adminService;

    @RequestMapping("index")
    public String index() {
        System.out.println("11");
        adminService.insert();
        System.out.println("22");
        return "API Test 중입니다.1111";
    }

}