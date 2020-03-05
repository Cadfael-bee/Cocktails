package com.my.store.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.store.model.User;

@Controller
public class FController {
	
	@RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String index(Model model) {
 
        return "index";
    }
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login(Model model) {
 
        return "login";
    }
	
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
    public String register(Model model, HttpServletRequest request) {
		
		if (request.getAttribute("bean") == null) {
			request.setAttribute("bean", new User());
		}
		if (request.getAttribute("errors") == null) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("userName", "aa");
			request.setAttribute("errors", map);
		}
 
        return "register";
    }
	
	@RequestMapping(value = {"/register"}, method = RequestMethod.POST)
    public String registerr(Model model, HttpServletRequest request) {
		
		if (request.getAttribute("bean") == null) {
			request.setAttribute("bean", new User());
		}
		if (request.getAttribute("errors") == null) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("userName", "aa");
			request.setAttribute("errors", map);
		}
 
        return "register";
    }

}
