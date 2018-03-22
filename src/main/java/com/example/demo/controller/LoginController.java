package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("")
    public String login() {

        return "page/login";
    }
    @RequestMapping("carLogin")
    public String carLogin() {

        return "page/carmanagement/login";
    }
    @RequestMapping("/carManagement")
    public String carManagement() {

        return "page/carmanagement/index";
    }


}
