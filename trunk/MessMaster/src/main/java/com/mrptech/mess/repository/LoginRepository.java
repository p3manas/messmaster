/**
 * 
 */
package com.mrptech.mess.repository;

import java.util.List;
import java.util.Map;

import com.mrptech.mess.dto.LoginDto;



/**
 * @author prasadj
 *
 */
public interface LoginRepository {

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
	 * 
	 * @param loginId
	 * @param password
	 * @param categoryId
	 * @return
	 */
	Map<String, List<LoginDto>> login(String loginId, String password, Integer categoryId);
	
	
}