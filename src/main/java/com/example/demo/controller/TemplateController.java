package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/templates")
public class TemplateController {

    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {

        map.put("name", "磊哥");
        return "hello";
    }
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String, Object> map) {

        map.put("name", "磊哥");
        return "helloFtl";
    }
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @RequestMapping("/single")
    public String single() {
        return "single";
    }
    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
