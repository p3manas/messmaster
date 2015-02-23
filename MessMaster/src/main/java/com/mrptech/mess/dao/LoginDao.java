/**
 * 
 */
package com.mrptech.mess.dao;

import com.mrptech.mess.model.Users;



/**
 * @author Manas RP
 *
 */
public interface LoginDao {

	/**
	 * 
	 * @param loginId user id
	 * @param password password
	 * @return Users
	 */
	Users validateLgin(String loginId,String password);


	
}