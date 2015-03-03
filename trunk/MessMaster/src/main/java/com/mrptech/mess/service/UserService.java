/**
 * 
 */
package com.mrptech.mess.service;

import java.util.List;

import com.mrptech.mess.dto.UserDto;



/**
 * @author Manas RP
 *
 */
public interface UserService {

	/**
	 *  1. get the authentication record based on categoryId and loginId
	 *  2. verify the status 
	 *  	assign the status to dto
	 *  2a. Status is Active - verify the password 
	 *  
	 * 		get the follwoing information on successful login
	 * 		1. authentication id
	 * 		2. user fullname
	 * 		3. role id
	 * 		4. list of action ids
	 * 		5. category id
	 *  	update the pw attempts to 0 if the count > 0
	 *  
	 *  	increase the pw attempts count
	 *  	change the status locked if count is grater than the configured count
	 *  	
	 *  2b. Status is Locked
	 *  	no need to do any action
	 *  2c. Status is NewUser
	 *  	no need to do any action
	 *  2d. Status is Blocked
	 *  	no need to do any action
	 *  2e. Status is Reset
	 *  	no need to do any action
	 */
	
	public List<UserDto> viewAll();
	
	public void saveUser(UserDto dto);
	
}