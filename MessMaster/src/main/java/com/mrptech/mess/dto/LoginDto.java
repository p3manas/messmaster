/**
 * 
 */
package com.mrptech.mess.dto;

import java.io.Serializable;
import java.util.Date;


/**
 * @author Manas RP
 *
 */
public class LoginDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 779237480842895912L;

	private String userName;
	
	private Integer category;
	
	private Date lastLoginTime;
	
	private Long authId;
	
	
	private Integer status;
	
	
	private Long loginRegionId;
	
	private String loginRegionName;
	
	private Long loginSubRegionId;
	
	private String loginSubRegionName;
	
	private String fullName;
	
	public LoginDto(){
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
	}



	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getLoginRegionId() {
		return loginRegionId;
	}

	public void setLoginRegionId(Long loginRegionId) {
		this.loginRegionId = loginRegionId;
	}

	public String getLoginRegionName() {
		return loginRegionName;
	}

	public void setLoginRegionName(String loginRegionName) {
		this.loginRegionName = loginRegionName;
	}

	public Long getLoginSubRegionId() {
		return loginSubRegionId;
	}

	public void setLoginSubRegionId(Long loginSubRegionId) {
		this.loginSubRegionId = loginSubRegionId;
	}

	public String getLoginSubRegionName() {
		return loginSubRegionName;
	}

	public void setLoginSubRegionName(String loginSubRegionName) {
		this.loginSubRegionName = loginSubRegionName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}