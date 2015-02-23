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
import com.mrptech.mess.dto.LoginDto;
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
	public Users validateLgin(String loginId, String password) {
		List<Users> users = (List<Users>) hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(Users.class).add(Restrictions.eq("userId", loginId))
						.add(Restrictions.eq("userId", loginId)));
		return null;
	}

}