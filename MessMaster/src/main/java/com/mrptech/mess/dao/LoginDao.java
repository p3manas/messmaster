/**
 * 
 */
package com.mrptech.mess.dao;

import java.util.List;
import java.util.Map;

import com.mrptech.mess.dto.LoginDto;



/**
 * @author Manas RP
 *
 */
public interface LoginDao {

	Map<String, List<LoginDto>> getAuthenticationByLoginName(String loginId);


	
}