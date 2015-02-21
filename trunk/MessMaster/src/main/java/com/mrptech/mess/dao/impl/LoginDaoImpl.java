/**
 * 
 */
package com.mrptech.mess.dao.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mrptech.mess.dao.LoginDao;
import com.mrptech.mess.dto.AuthenticationDto;
import com.mrptech.mess.model.Users;

/**
 * @author Manas RP
 *
 */
@Component
public class LoginDaoImpl implements LoginDao {

	@Inject
	private HibernateTemplate hibernateTemplate;

	public LoginDaoImpl() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, List<AuthenticationDto>> getAuthenticationByLoginName(String loginId) {

		String str="SELECT rol.roleDesc,res.resourceDesc,res.url FROM RolesResources rss,Resources res,Roles rol WHERE rol.id.roleCode=rss.id.roleCode   and "
				+ "res.id.resourceId=rss.id.resourceId  and rss.id.roleCode in( SELECT id.roleCode FROM RolesGroupRoles where "
				+ "id.groupRoleCode=?)";
		
		List<?> list=hibernateTemplate.find(str, "SYSTEM_ADMIN");
		
		Map<String, List<AuthenticationDto>> map=new LinkedHashMap<String, List<AuthenticationDto>>();
		String temp=null;
		List<AuthenticationDto> tests=new ArrayList<AuthenticationDto>();
		Object[] arryStr=list.toArray();
		for (int i = 0; i < arryStr.length; i++) {
			
			Object[] newStr=(Object[]) arryStr[i];
			//if prev value not equals to next value.
			if (temp != null && !temp.equals(newStr[0])) {
				map.put(temp, tests);
				tests=new ArrayList<AuthenticationDto>();			
			}

			for (int j = 1; j < newStr.length; ) {
				temp=newStr[0].toString();
				AuthenticationDto test=new AuthenticationDto();
				test.setUserName(newStr[1].toString());
				test.setPassword(newStr[2].toString());
				tests.add(test);
				break;
			}
		}
		//for last value
		map.put(temp, tests);
		
		
		System.out.println(map);
		List<Users> users = (List<Users>) hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Users.class).add(
						Restrictions.eq("userId", loginId)));
		System.out.println("Manas  " + users);
		System.out.println(list);
		
		return map;
		
	}

}