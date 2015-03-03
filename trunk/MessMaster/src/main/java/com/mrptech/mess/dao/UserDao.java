/**
 * 
 */
package com.mrptech.mess.dao;

import java.util.List;

import com.mrptech.mess.model.Users;



/**
 * @author Manas RP
 *
 */
public interface UserDao {

	/**
	 * 
	 * @param loginId user id
	 * @param password password
	 * @return Users
	 */
	public List<Users> viewAll();

	public void saveUser(Users users);
	
}