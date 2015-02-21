/**
 * 
 */
package com.mrptech.mess.dao;

import java.util.List;
import java.util.Map;

import com.mrptech.mess.dto.AuthenticationDto;



/**
 * @author Manas RP
 *
 */
public interface LoginDao {

	Map<String, List<AuthenticationDto>> getAuthenticationByLoginName(String loginId);


	
}