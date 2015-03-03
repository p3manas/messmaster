/**
 * 
 */
package com.mrptech.mess.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mrptech.mess.constants.path.LoginTiles;
import com.mrptech.mess.dto.LoginDto;
import com.mrptech.mess.service.LoginService;



/**
 * This class will operate login functionality.
 * @author manas rp
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController  implements LoginTiles{

	private static final Logger LOGGER = Logger.getLogger(LoginController.class.getName());

	
	@Autowired
	LoginService loginService;
	
	@Autowired
	ApplicationContext context;
	
	@RequestMapping(method = RequestMethod.GET)
	public String login( Model model) {
		LoginDto dto = new LoginDto();
		model.addAttribute(AUTHENTICATION_FORM, dto);
		return CUSTOMER_LOGIN;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String doLogin(HttpServletRequest request,Model model, Locale locale, @ModelAttribute LoginDto loginDto){
		LOGGER.info("Enter into method doCustomerLogin.");
		
		HttpSession session=request.getSession();		
		LoginDto users=loginService.login(loginDto.getUserName(), loginDto.getPassword());
		
		if (users !=null) {
			session.setAttribute("IS_LOGIN_SUC", true);
			session.setAttribute("USER_TYPE", users.getUserType());
			
			return CUSTOMER_DASHBOARD_VIEW;
		}else{
			model.addAttribute(AUTHENTICATION_FORM, loginDto);
			return CUSTOMER_LOGIN;
		}
		
		
		
		
		
		
		
		
	}
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String logout(HttpServletRequest request, Model model) {
		LoginDto dto = new LoginDto();
		model.addAttribute(AUTHENTICATION_FORM, dto);
		
		HttpSession session=request.getSession();
		session.removeAttribute("IS_LOGIN_SUC");
		session.removeAttribute("USER_TYPE");
		
		return "user.logout";
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String viewAdmin() {
		
		//HttpSession session=request.getSession();
		//session.getAttribute("SideMenu");
		//model.put("SideMenu", session.getAttribute("SideMenu"));
		return "test.dashboard";
		
	}
}