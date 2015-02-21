/**
 * 
 */
package com.mrptech.mess.repository.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.mrptech.mess.dao.LoginDao;
import com.mrptech.mess.dto.LoginDto;
import com.mrptech.mess.repository.LoginRepository;



/**
 * @author prasadj
 *
 */
@Component
public class LoginRepositoryImpl implements LoginRepository {

	
	
	@Inject
	private LoginDao loginDao;
	
	

	public LoginRepositoryImpl(){
	}
	
	@Override
	public Map<String, List<LoginDto>> login(String loginId, String password,
			Integer categoryId) {
		Map<String, List<LoginDto>> map=loginDao.getAuthenticationByLoginName(loginId);
		LoginDto loginDto =  new LoginDto();
		return map;
	}



	

}