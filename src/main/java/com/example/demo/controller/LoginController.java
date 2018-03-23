package com.example.demo.controller;

import com.example.demo.mapper.UserManagerMapper;
import com.example.demo.model.UserManager;
import com.example.demo.service.DemoService;
import com.example.demo.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserManagerService userManagerService;

    @RequestMapping("")
    public String login() {

        return "login";
    }
    @RequestMapping("/checLogin")
    @ResponseBody
    public String checLogin(HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        UserManager userManager = new UserManager();
        userManager.setLoginId(userName);
        userManager.setPassword(password);
        UserManager checUser = userManagerService.checLogin(userManager);
        if (checUser != null ){
            return "success";
        }else{
            return "fail";
        }
    }


}
