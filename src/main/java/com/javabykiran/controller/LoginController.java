package com.javabykiran.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.model.LoginModel;

import com.javabykiran.service.LoginService;

@Controller
public class LoginController 
{	
	public LoginController()
	{
		System.out.println("I m in LoginController"); 
	}

	@Autowired
	LoginService loginService;

	
	@RequestMapping(value = "/login")
	public ModelAndView checkLoginController(@ModelAttribute LoginModel lm,HttpSession session) {
		System.out.println("I am in Login Controller.");
		ModelAndView mv=new ModelAndView();
		boolean check=loginService.checkLoginService(lm);
		if (check) 
		{
			int loginid=loginService.getLoginIDService(lm.getEmail());
			String loginname=loginService.getLoginNameService(lm.getEmail());
			session.setAttribute("loginid", loginid);
			session.setAttribute("loginname", loginname);
			mv.setViewName("dashboard");
			mv.addObject("msg", "Login Successfully..");
			System.out.println("Login Successfully.");
		} else {
			mv.addObject("msg", "Your Username/Password is Wrong..");
			mv.setViewName("login");
		}
		return mv;
	}
	
}
