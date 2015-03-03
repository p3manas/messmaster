/**
 * 
 */
package com.mrptech.mess.repo.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mrptech.mess.dao.UserDao;
import com.mrptech.mess.dto.UserDto;
import com.mrptech.mess.model.Users;
import com.mrptech.mess.repo.UserRepo;
import com.mrptech.mess.utils.UIUtil;


/**
 * @author Manas RP
 *
 */
@Component

public class UserRepoImpl implements UserRepo {

	@Inject
	private UserDao userDao;
	
	public UserRepoImpl(){
	}


	@Override
	public List<UserDto> viewAll() {
		List<Users> users=userDao.viewAll();
		List<UserDto> dtos=null;
		if (users != null) {
			dtos=new ArrayList<UserDto>();
			for (Users user : users) {
				UserDto dto=new UserDto();
				dto.setStatus(user.getStatus());
				dto.setFirstName(user.getFirstName());
				dto.setUserName(user.getUserId());
				dto.setMobNo(user.getMsisdn());
				dtos.add(dto);
			}
			return dtos;
		}else{
			return null;
		}
	}

	@Override
	public void saveUser(UserDto userDto) {
		
		Users users=new Users();
		users.setAccountId(UIUtil.getUserRandom());
		users.setNodeCode("USER_TYPE");
		users.setCreatedBy("Manas");
		users.setCreatedOn(new Date());
		users.setFirstName(userDto.getFirstName());
		users.setLastName(userDto.getLastName());
		users.setMiddleName(userDto.getMiddleName());
		users.setMsisdn(userDto.getMobNo());
		users.setAddress1(userDto.getAddress1());
		
		userDao.saveUser(users);
	}

	
	
}