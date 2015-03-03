/**
 * 
 */
package com.mrptech.mess.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mrptech.mess.dao.LoginDao;
import com.mrptech.mess.dto.LoginDto;
import com.mrptech.mess.model.Users;
import com.mrptech.mess.service.LoginService;


/**
 * @author Manas RP
 *
 */
@Component("loginService")
@Transactional (rollbackFor=Exception.class,readOnly=false)
public class LoginServiceImpl implements LoginService {

	@Inject
	private LoginDao loginDao;
	
	public LoginServiceImpl(){
	}

	@Override
	public LoginDto login(String loginId, String password) {
		Users users=loginDao.validateLgin(loginId, password);
		
		if (users !=null) {
			LoginDto dto=new LoginDto();
			dto.setNodeCode(users.getNodeCode());
			dto.setUserType(users.getUserType());
			return dto;
		}
		return null;
	}

	
	
}