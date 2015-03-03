package com.mrptech.mess.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mrptech.mess.constants.path.LoginTiles;
import com.mrptech.mess.dto.UserDto;
import com.mrptech.mess.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController implements LoginTiles{

	private static final Logger LOGGER = Logger.getLogger(LoginController.class.getName());
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	String displayUsers(Model model){
		LOGGER.info("started Operation for display users");
			model.addAttribute("USERS", userService.viewAll());
		return "user.display";
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/add")
	String addUser(Map model){
		LOGGER.info("started Operation for add user");
		UserDto dto=new UserDto();
		model.put("userForm", dto);
		return "user.add";
	}
	
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	String saveUser(Model model,@ModelAttribute UserDto userForm){
		LOGGER.info("started Operation for add user");
		userService.saveUser(userForm);
				
		displayUsers(model);
		return "user.display";
	}
}
