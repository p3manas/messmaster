/**
 * 
 */
package com.mrptech.mess.service.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mrptech.mess.dto.LoginDto;
import com.mrptech.mess.repository.LoginRepository;
import com.mrptech.mess.service.LoginService;


/**
 * @author prasadj
 *
 */
@Component("loginService")
@Transactional (rollbackFor=Exception.class)
public class LoginServiceImpl implements LoginService {

	@Inject
	private LoginRepository loginRepository;
	
	public LoginServiceImpl(){
	}

	@Override
	public Map<String, List<LoginDto>> login(String loginId, String password,
			Integer categoryId) {
		return loginRepository.login(loginId, password, categoryId);
	}

	
}