package com.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.LoginBean;
import com.service.LoginService;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginser;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(Model model) {
        model.addAttribute("login", new LoginBean()); 
        return "login"; 
    }

        @RequestMapping(value = "/submitlogin", method = RequestMethod.POST)
    public String checkLoginDetails(@ModelAttribute("login") LoginBean loginBean, 
                                     BindingResult result) {
        if (loginser.validate(loginBean)) {
            return "success";
        } else {
            return "invalid"; 
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndexPage() {
        return "index"; 
    }
}
