package com.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.model.RegistrationModel;
import com.javabykiran.service.RegistrationService;

@Controller
public class RegistrationController {
	
	public RegistrationController()
	{
		System.out.println("I m in RegistrationController Constructor...");
	}

	@Autowired
	RegistrationService rs;

	
	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public ModelAndView RegisterController(@ModelAttribute RegistrationModel rm)
	{
		System.out.println("I am in Registration controller..");
		System.out.println(rm);
		ModelAndView mv=new ModelAndView();
		String check=rs.getRegisterService(rm);
		if(check.equals("success"))
		{
			mv.setViewName("register");
			mv.addObject("success", "User Registered Successfully");
		}
		else if(check.equals("fail"))
		{
			mv.setViewName("register");
			mv.addObject("fail", "User Registered UnSuccessfully");

		}
		return mv;
	}
}
