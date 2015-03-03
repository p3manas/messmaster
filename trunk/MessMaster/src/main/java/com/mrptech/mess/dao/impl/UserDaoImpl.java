/**
 * 
 */
package com.mrptech.mess.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mrptech.mess.dao.UserDao;
import com.mrptech.mess.model.Users;

/**
 * @author Manas RP
 *
 */
@SuppressWarnings("unchecked")
@Repository
@Transactional(readOnly=false)
public class UserDaoImpl implements UserDao {

	@Inject
	private HibernateTemplate hibernateTemplate;

	public UserDaoImpl() {
	}

	@Override
	public List<Users> viewAll() {
		return (List<Users>)hibernateTemplate.findByNamedQuery("Users.findAll");
	}

	@Override
	public void saveUser(Users users) {
		hibernateTemplate.save(users);
	}

}