package com.mrptech.mess.listner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.mrptech.mess.dto.AuthenticationDto;

public class MessMasterListner implements ServletContextListener{

	@Inject
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		/*
		@SuppressWarnings("unchecked")
		List<Users> users11 = (List<Users>) hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Users.class).add(
						Restrictions.eq("userId", "sysAdmin@manas.com")));
		System.out.println("Manas  " + users11);*/

		 Map<String, List<AuthenticationDto>> map=new HashMap<String, List<AuthenticationDto>>();

		AuthenticationDto dto=new AuthenticationDto();
		dto.setUserName("View Shopping History");
		dto.setPassword("test");
		AuthenticationDto dto1=new AuthenticationDto();
		dto1.setUserName("View Shopping Report");
		dto1.setPassword("test");
		AuthenticationDto dto2=new AuthenticationDto();
		dto2.setUserName("View Complaint");
		dto2.setPassword("test");
		
		List<AuthenticationDto> list=new ArrayList<AuthenticationDto>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		
		map.put("Enquiry", list);
		
		
		
		
		AuthenticationDto user=new AuthenticationDto();
		user.setUserName("Add user");
		user.setPassword("login/test");
		AuthenticationDto user1=new AuthenticationDto();
		user1.setUserName("Update user");
		user1.setPassword("#");
		AuthenticationDto user2=new AuthenticationDto();
		user2.setUserName("delete user");
		user2.setPassword("#");
		
		List<AuthenticationDto> users=new ArrayList<AuthenticationDto>();
		users.add(user);
		users.add(user1);
		users.add(user2);
		
		map.put("User Management", users);
		
		
		
		
		AuthenticationDto access=new AuthenticationDto();
		access.setUserName("change password");
		access.setPassword("login/test");
		AuthenticationDto access1=new AuthenticationDto();
		access1.setUserName("Reset password");
		access1.setPassword("login/test");
		AuthenticationDto access2=new AuthenticationDto();
		access2.setUserName("delete password");
		access2.setPassword("#");
		
		List<AuthenticationDto> accesss=new ArrayList<AuthenticationDto>();
		accesss.add(access);
		accesss.add(access1);
		accesss.add(access2);
		
		map.put("Access Management", accesss);
		
		
		
		
		
		//event.getServletContext().setAttribute("SideMenu", map);

		

	}

}
