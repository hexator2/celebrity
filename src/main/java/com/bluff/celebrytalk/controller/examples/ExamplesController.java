package com.bluff.celebrytalk.controller.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamplesController {
    @GetMapping("admin")
    public String index() {
        return "index";
    }

    @GetMapping("buttons")
    public String buttons() {
        return "buttons";
    }

    @GetMapping("cards")
    public String cards() {
        return "cards";
    }

    @GetMapping("utilities-color")
    public String utilColor() {
        return "utilities-color";
    }

    @GetMapping("utilities-border")
    public String utilBorder() {
        return "index";
    }

    @GetMapping("utilities-animation")
    public String utilAnimation() {
        return "utilities-animation";
    }

    @GetMapping("utilities-other")
    public String utilOther() {
        return "utilities-other";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("register")
    public String register() {
        return "register";
    }

    @GetMapping("forgot-password")
    public String forgotPassword() {
        return "forgot-password";
    }

    @GetMapping("404")
    public String error() {
        return "404";
    }

    @GetMapping("blank")
    public String blank() {
        return "blank";
    }

    @GetMapping("charts")
    public String charts() {
        return "charts";
    }

    @GetMapping("tables")
    public String tables() {
        return "tables";
    }
}