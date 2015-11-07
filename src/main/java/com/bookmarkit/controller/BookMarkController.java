package com.bookmarkit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookmarkit.model.User;
 
@Controller
public class BookMarkController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
	    return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model) {
	    return "login";
	}
 
    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public String viewRegistration(Model model) {
        User userForm = new User();    
        model.addAttribute("userForm", userForm);
         
        return "register";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
            Model model) {
         
        // registration logic here
         
        // testing purpose
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        System.out.println("email: " + user.getEmail());
         
        return "registerSuccess";
    }}
