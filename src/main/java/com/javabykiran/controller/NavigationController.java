package com.javabykiran.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.hibernate.Links;
import com.javabykiran.model.DownloadsModel;
import com.javabykiran.model.OperatorsModel;
import com.javabykiran.model.StateModel;
import com.javabykiran.service.UserOperationsService;

@Controller
public class NavigationController 
{
	@Autowired
	UserOperationsService uos;
	
	@RequestMapping(value = "/loginpage")
	public String openLoginPageController() {
		System.out.println("openLoginPage..........");
		return "login";
	}
	
	@RequestMapping(value = "/register")
	public String getRegisterPageController()
	{
		return "register";
	}

	@RequestMapping(value="/deletemultiple", params = "adduserpage", method = RequestMethod.GET)
	public ModelAndView getAddUserPageController()
	{
		System.out.println("I am in Add User Page");
		ModelAndView mv=new ModelAndView();
		ArrayList<StateModel> statelist=uos.getStateListService();
		System.out.println("Statelist >> "+statelist);
		mv.setViewName("add_user");
		mv.addObject("statelist", statelist);
		return mv;
	}
	
	@RequestMapping(value = "/dashboard")
	public String getDashboardController()
	{
		return "dashboard";
	}
	
	@RequestMapping(value = "/downloads")
	public ModelAndView getDownloadsController()
	{
		System.out.println("I am Download Controller..");
		ModelAndView mv=new ModelAndView();
		ArrayList<DownloadsModel> downloadlist=uos.getDownloadService();
		System.out.println("Download >> "+downloadlist);
		mv.setViewName("downloads");
		mv.addObject("downloadlist", downloadlist);
		return mv;
	}
	
	@RequestMapping(value = "/links")
	public ModelAndView getLinksController()
	{
		System.out.println("I am in Link Controller...");
		ModelAndView mv=new ModelAndView();
		List<Links> linklist=uos.getLinklistService();
		System.out.println(linklist);
		mv.addObject("linklist", linklist);
		mv.setViewName("links");
		return mv;
	}
	
	@RequestMapping(value = "/logout")
	public String getLogoutController()
	{
		return "logout";
	}
	
	@RequestMapping(value = "/operators")
	public ModelAndView getOperatorsController()
	{
		System.out.println("I am in Operator Controller...");
		ModelAndView mv=new ModelAndView();
		ArrayList<OperatorsModel> Operatorlist=uos.getOperatorService();
		System.out.println(Operatorlist);
		mv.addObject("Operatorlist", Operatorlist);
		mv.setViewName("operators");
		return mv;
	}
	
	@RequestMapping(value = "/profile")
	public String getProfileController()
	{
		return "profile";
	}
}
