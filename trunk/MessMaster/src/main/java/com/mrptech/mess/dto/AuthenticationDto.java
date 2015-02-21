/**
 * 
 */
package com.mrptech.mess.dto;


/**
 * @author manas rp
 *
 */
public class AuthenticationDto {

	private Long id;
	
	private String userName;
	
	private Integer pwAttempts;
	
	private Integer status;
	
	private Integer category;
	
	private String newUserCode;
	
	private String password;
	
	private Long questionId;
	
	private String answer;
	
	private String roleId;
	
	private String captchaStr;
	
	public AuthenticationDto(){
	
	}

	public AuthenticationDto(Long id, Integer pwAttempts, String userName, String newUserCode, Integer status, Integer category, Long questionId, String answer){
		this.id = id;
		this.pwAttempts = pwAttempts;
		this.userName = userName;
		this.status = status;
		this.category = category;
		this.newUserCode = newUserCode;
		this.questionId = questionId;
		this.answer = answer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getPwAttempts() {
		return pwAttempts;
	}

	public void setPwAttempts(Integer pwAttempts) {
		this.pwAttempts = pwAttempts;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public void setCategoryId(Integer category) {
		this.category = category;
	}

	public String getNewUserCode() {
		return newUserCode;
	}

	public void setNewUserCode(String newUserCode) {
		this.newUserCode = newUserCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the captchaStr
	 */
	public String getCaptchaStr() {
		return captchaStr;
	}

	/**
	 * @param captchaStr the captchaStr to set
	 */
	public void setCaptchaStr(String captchaStr) {
		this.captchaStr = captchaStr;
	}

}