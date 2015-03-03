/**
 * 
 */
package com.mrptech.mess.utils;

import java.math.BigDecimal;
import java.util.Random;

import com.mrptech.mess.constants.Tiles;


/**
 * @author prasadj
 *
 */
public class UIUtil implements Tiles {

	public static String redirectPath(String path){
		return Tiles.RD_PATH_PREFIX + path;
	}
	
	
	
	
	
	public static BigDecimal getUserRandom(){
		
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(1000000000);
		 
 
		return new BigDecimal(randomInt);
	}
	
	
	public static String getJsonSuccessMsg(Object msg){
		return "{\"success\":\"" +  msg + "\"}";
	}
	
	public static String getJsonErrorMsg(Object msg){
		return "{\"error\":\"" + msg + "\"}";
	}

}