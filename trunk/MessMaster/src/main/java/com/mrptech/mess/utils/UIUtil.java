/**
 * 
 */
package com.mrptech.mess.utils;

import com.mrptech.mess.constants.Tiles;


/**
 * @author prasadj
 *
 */
public class UIUtil implements Tiles {

	public static String redirectPath(String path){
		return Tiles.RD_PATH_PREFIX + path;
	}
	
	
	
	
	
	
	
	public static String getJsonSuccessMsg(Object msg){
		return "{\"success\":\"" +  msg + "\"}";
	}
	
	public static String getJsonErrorMsg(Object msg){
		return "{\"error\":\"" + msg + "\"}";
	}

}