/**
 * 
 */
package com.mrptech.mess.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

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

import com.mrptech.mess.constants.path.CustomerLogin;
import com.mrptech.mess.dto.AuthenticationDto;
import com.mrptech.mess.service.LoginService;



/**
 * @author manas rp
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController  implements CustomerLogin{

	private static final Logger LOGGER = Logger.getLogger(LoginController.class.getName());

	
	@Autowired
	LoginService loginService;
	
	@Autowired
	ApplicationContext context;
	
	@RequestMapping(method = RequestMethod.GET)
	public String customerLogin(HttpServletRequest request, Model model) {
		AuthenticationDto dto = new AuthenticationDto();
		model.addAttribute(AUTHENTICATION_FORM, dto);
		return CUSTOMER_LOGIN;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.POST)
	public String doCustomerLogin(@SuppressWarnings("rawtypes") Map model, HttpServletRequest request, Locale locale, @ModelAttribute AuthenticationDto authenticationDto){
		
		
		
		//context.
		
		Map<String, List<AuthenticationDto>>  map=loginService.login("sysAdmin@manas.com", "", 12);
		
		HttpSession session=request.getSession();
		session.setAttribute("SideMenu", map);
		model.put("SideMenu", map);
		
		return CUSTOMER_DASHBOARD_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String viewAdmin(Map model, Long id, Locale locale, HttpServletRequest request) {
		
		HttpSession session=request.getSession();
		session.getAttribute("SideMenu");
		model.put("SideMenu", session.getAttribute("SideMenu"));
		return "test.dashboard";
		
	}
}