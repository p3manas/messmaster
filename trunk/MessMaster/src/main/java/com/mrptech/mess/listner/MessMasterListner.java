package com.mrptech.mess.listner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.mrptech.mess.dto.LoginDto;

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

		 Map<String, List<LoginDto>> map=new HashMap<String, List<LoginDto>>();

		LoginDto dto=new LoginDto();
		dto.setUserName("View Shopping History");
		dto.setUrl("test");
		LoginDto dto1=new LoginDto();
		dto1.setUserName("View Shopping Report");
		dto1.setUrl("test");
		LoginDto dto2=new LoginDto();
		dto2.setUserName("View Complaint");
		dto2.setUrl("test");
		
		List<LoginDto> list=new ArrayList<LoginDto>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		
		map.put("Enquiry", list);
		
		
		
		
		LoginDto user=new LoginDto();
		user.setUserName("Add user");
		user.setUrl("login/test");
		LoginDto user1=new LoginDto();
		user1.setUserName("Update user");
		user1.setUrl("#");
		LoginDto user2=new LoginDto();
		user2.setUserName("delete user");
		user2.setUrl("#");
		
		List<LoginDto> users=new ArrayList<LoginDto>();
		users.add(user);
		users.add(user1);
		users.add(user2);
		
		map.put("User Management", users);
		
		
		
		
		LoginDto access=new LoginDto();
		access.setUserName("change password");
		access.setUrl("login/test");
		LoginDto access1=new LoginDto();
		access1.setUserName("Reset password");
		access1.setUrl("login/test");
		LoginDto access2=new LoginDto();
		access2.setUserName("delete password");
		access2.setUrl("#");
		
		List<LoginDto> accesss=new ArrayList<LoginDto>();
		accesss.add(access);
		accesss.add(access1);
		accesss.add(access2);
		
		map.put("Access Management", accesss);
		
		
		
		
		
		//event.getServletContext().setAttribute("SideMenu", map);

		

	}

}
