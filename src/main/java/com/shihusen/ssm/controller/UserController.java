package com.shihusen.ssm.controller;

import com.shihusen.ssm.entity.User;
import com.shihusen.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by shihusen on 2016/6/2.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
            return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkLogin(User user,Model model) {
        int result = userService.checkLogin(user);
        if (1 == result) {
            model.addAttribute("userName",user.getUserName());
            return "success";
        } else {
            return "login";
        }
    }
}
