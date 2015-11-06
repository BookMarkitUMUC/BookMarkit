package com.bookmarkit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookmarkit.model.User;
 
@Controller
@RequestMapping(value = "/register")
public class BookMarkController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        User userForm = new User();    
        model.put("userForm", userForm);
         
        return "register";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
            Map<String, Object> model) {
         
        // registration logic here
         
        // testing purpose
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        System.out.println("email: " + user.getEmail());
         
        return "registerSuccess";
    }}
