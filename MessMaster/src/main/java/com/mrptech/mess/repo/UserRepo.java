/**
 * 
 */
package com.mrptech.mess.repo;

import java.util.List;

import com.mrptech.mess.dto.UserDto;

/**
 * @author Manas Ranjan
 *
 */
public interface UserRepo {

	public List<UserDto> viewAll();
	
	public void saveUser(UserDto dto);
}
