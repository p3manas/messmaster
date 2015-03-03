/**
 * 
 */
package com.mrptech.mess.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mrptech.mess.dto.UserDto;
import com.mrptech.mess.repo.UserRepo;
import com.mrptech.mess.service.UserService;


/**
 * @author Manas RP
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Inject
	private UserRepo userRepo;
	
	public UserServiceImpl(){
	}


	@Override
	public List<UserDto> viewAll() {
		return userRepo.viewAll();
	}

	
	@Override
	public void saveUser(UserDto userDto) {
		
		/*Users users=new Users();
		users.setAccountId(UIUtil.getUserRandom());
		users.setNodeCode("USER_TYPE");
		users.setCreatedBy("Manas");
		users.setCreatedOn(new Date());
		users.setFirstName(userDto.getFirstName());
		users.setLastName(userDto.getLastName());
		users.setMiddleName(userDto.getMiddleName());
		users.setMsisdn(userDto.getMobNo());
		users.setAddress1(userDto.getAddress1());
		*/
		userRepo.saveUser(userDto);
	}

	
	
}