package com.javabykiran.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.model.AddUserModel;
import com.javabykiran.model.StateModel;
import com.javabykiran.model.UserlistModel;
import com.javabykiran.service.UserOperationsService;

@Controller
public class UserOperationsController {

	public UserOperationsController() {
		System.out.println("I Am in UserOperationsController ");
	}
	
	@Autowired
	UserOperationsService uos;
	
	@RequestMapping(value = "/userlist" , method = RequestMethod.GET)
	public ModelAndView UserlistController(@RequestParam("page_id") int page_id)
	{
		int loginid=uos.getLoginIDService();
		System.out.println("I am in UserOperations COntroller userlist method..");
		ModelAndView mv=new ModelAndView();
		int total = 5;
	    if(page_id == 1) 
	    {
	            // do nothing!
	    }
	    else 
	    {            
	            page_id= (page_id-1)*total+1;  
	    }
	    ArrayList<UserlistModel> userlist=uos.getUSerListService(loginid,page_id,total);
		System.out.println("Userlist >> "+userlist);
		mv.addObject("userlist", userlist);
		mv.setViewName("users");
		return mv;
	}

	@RequestMapping(value = "/adduser" , method = RequestMethod.POST)
	public ModelAndView AddUserController(@RequestParam("state") int sid,@ModelAttribute AddUserModel aum,BindingResult results)
	{
		System.out.println("I am in UserOperations COntroller Add User method.. >> "+sid);
		int loginid=uos.getLoginIDService();
		System.out.println(aum);
		ModelAndView mv=new ModelAndView();
		boolean check=uos.getAddUserService(aum,sid);
		if(check)
		{
			ArrayList<UserlistModel> userlist=uos.getUSerListService(loginid,1,5);
			System.out.println("userlist >> "+userlist);
			mv.addObject("success", "User added Successfully");
			mv.addObject("userlist", userlist);
			mv.setViewName("users");
		}
		else
		{
			mv.addObject("fail", "User Does not added");
			mv.setViewName("add_user");
		}
		return mv;
	}
	
	@RequestMapping(value = "/updateUser")
	public ModelAndView UpdateUserController(@RequestParam("iduser") int iduser)
	{
		System.out.println("I m in user operations set update data..");
		ModelAndView mv=new ModelAndView();
		ArrayList<AddUserModel> userlist=uos.getUpdateUserDataService(iduser);
		ArrayList<StateModel> statelist=uos.getStateListService();
		System.out.println("Statelist >> "+statelist);
		mv.addObject("statelist", statelist);
		mv.addObject("userlist", userlist);
		mv.setViewName("updateUser");
		return mv;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView UpdateController(@RequestParam("state") int sid,@ModelAttribute AddUserModel aum)
	{
		int loginid=uos.getLoginIDService();
		System.out.println("I am useroperations of update method SID >> "+sid);
		System.out.println(aum);
		ModelAndView mv=new ModelAndView();
		boolean check=uos.getUpdateService(aum,sid);
		if(check)
		{
			ArrayList<UserlistModel> userlist=uos.getUSerListService(loginid,1,5);
			System.out.println("userlist >> "+userlist);
			System.out.println("User Updated Successfully");
			mv.addObject("success", "User Updated Successfully");
			mv.addObject("userlist", userlist);
			mv.setViewName("users");
		}
		else
		{
			mv.addObject("fail", "User Does not updated");
			mv.setViewName("users");
		}
		return mv;
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public ModelAndView DeleteUserController(@RequestParam("iduser") int iduser)
	{
		int loginid=uos.getLoginIDService();	
		System.out.println("I am in UseroperationController delete method");
		System.out.println("delete user id >> "+iduser);
		ModelAndView mv=new ModelAndView();
		boolean check=false;
		check=uos.getdeleteUserService(iduser);
		if(check)
		{
			ArrayList<UserlistModel> userlist=uos.getUSerListService(loginid,1,5);
			System.out.println("userlist >> "+userlist);
			System.out.println("User Deleted Successfully");
			mv.addObject("success", "User Deleted Successfully");
			mv.addObject("userlist", userlist);
			mv.setViewName("users");
		}
		else
		{
			System.out.println("User Does Not Deleted...");
			mv.addObject("fail", "User Does not deleted");
			mv.setViewName("users");
		}
		return mv;
	}
	
	@RequestMapping(value = "/deletemultiple" , method = RequestMethod.GET)
	public ModelAndView MultipleDeleteController(@RequestParam("deletemultiple") ArrayList<Integer> iduser)
	{
		System.out.println("I am Multiple Delete Controller..");
		System.out.println("Id user to delete >> "+iduser);
		ModelAndView mv=new ModelAndView();
		for(Integer id:iduser)
		{
			boolean check=uos.getdeleteUserService(id);
			if(check)
			{
				System.out.println("User Deleted Successfully >> "+id);
			}
			else
			{
				System.out.println("User Does not Deleted Successfully >> "+id);
			}
		}
		int loginid=uos.getLoginIDService();
		ArrayList<UserlistModel> userlist=uos.getUSerListService(loginid,1,5);
		System.out.println("userlist >> "+userlist);
		mv.addObject("userlist", userlist);
		mv.setViewName("users");
		return mv;
	}
}
