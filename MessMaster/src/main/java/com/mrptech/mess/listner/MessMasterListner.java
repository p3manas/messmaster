package com.mrptech.mess.listner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.mrptech.mess.dto.LoginDto;



public class MessMasterListner implements HandlerInterceptor{

	@Inject
	HibernateTemplate hibernateTemplate;
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
				//return true;

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

		String userType=null;
		boolean isLoginSuc=false;
		if(!arg3.getViewName().equals("customer.login")){
			 isLoginSuc=(boolean)arg0.getSession().getAttribute("IS_LOGIN_SUC");
			 userType=(String)arg0.getSession().getAttribute("USER_TYPE");
			
		}
		
		

		HandlerMethod handlerMethod=(HandlerMethod)arg2;
		String name=handlerMethod.getMethod().getName();
		if(isLoginSuc && name != "customerLogin"&& arg0.getSession().getAttribute("SideMenu") ==null){
		String str="SELECT rol.roleDesc,res.resourceDesc,res.url FROM RolesResources rss,Resources res,Roles rol WHERE rol.id.roleCode=rss.id.roleCode and "
				+ "res.id.resourceId=rss.id.resourceId  and rss.id.roleCode in( SELECT id.roleCode FROM RolesGroupRoles where "
				+ "id.groupRoleCode=?)";
		
		
		List<?> list=hibernateTemplate.find(str, userType);
		Map<String, List<LoginDto>> map=new LinkedHashMap<String, List<LoginDto>>();
		String temp=null;
		List<LoginDto> tests=new ArrayList<LoginDto>();
		Object[] arryStr=list.toArray();
		System.out.println("Manas :::::");
		for (int i = 0; i < arryStr.length; i++) {
			
			Object[] newStr=(Object[]) arryStr[i];
			//if prev value not equals to next value.
			if (temp != null && !temp.equals(newStr[0])) {
				map.put(temp, tests);
				tests=new ArrayList<LoginDto>();			
			}
			
			temp=newStr[0].toString();
			LoginDto test=new LoginDto();
			test.setUserName(newStr[1].toString());
			test.setUrl(newStr[2].toString());
			tests.add(test);
		}
		//for last value
		map.put(temp, tests);
		arg0.getSession().setAttribute("SideMenu", map);
		}

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		
			return true;
	}
	
}
/*@Controller
public class MessMasterListner implements ServletContextAware , InitializingBean{
	
	@Inject
	HibernateTemplate hibernateTemplate;
	
	private ServletContext sc;
	private Map<String, List<LoginDto>> map=null;
	public void setServletContext(ServletContext servletContext) {
		String str="SELECT rol.roleDesc,res.resourceDesc,res.url FROM RolesResources rss,Resources res,Roles rol WHERE rol.id.roleCode=rss.id.roleCode and "
				+ "res.id.resourceId=rss.id.resourceId  and rss.id.roleCode in( SELECT id.roleCode FROM RolesGroupRoles where "
				+ "id.groupRoleCode=?)";
		
		List<?> list=hibernateTemplate.find(str, "SYSTEM_ADMIN");
		
		map=new LinkedHashMap<String, List<LoginDto>>();
		String temp=null;
		List<LoginDto> tests=new ArrayList<LoginDto>();
		Object[] arryStr=list.toArray();
		System.out.println("Manas ::::::::::::::");
		for (int i = 0; i < arryStr.length; i++) {
			
			Object[] newStr=(Object[]) arryStr[i];
			//if prev value not equals to next value.
			if (temp != null && !temp.equals(newStr[0])) {
				map.put(temp, tests);
				tests=new ArrayList<LoginDto>();			
			}

			for (int j = 1; j < newStr.length; ) {
				temp=newStr[0].toString();
				LoginDto test=new LoginDto();
				test.setUserName(newStr[1].toString());
				test.setUrl(newStr[2].toString());
				tests.add(test);
				break;
			}
		}
		//for last value
		map.put(temp, tests);
        //servletContext.setAttribute("SideMenu", map);
		this.sc = servletContext;
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Manas :::::::::::::: InitiALIZED");
		 this.sc.setAttribute("SideMenu", map);	
	}
}
*/