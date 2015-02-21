/**
 * 
 */
package com.mrptech.mess.dto;

/**
 * @author Manas RP
 *
 */
public class NewUserDto {

	/*private Long authId;*/
	
	private String password;
	
	private Long questionId;
	
	private String answer;
	
	private String newUserCode;
	
	private String userName;
	
	private String captchaStr;
	
	public NewUserDto(){
	}

/*	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
	}*/

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

	public String getNewUserCode() {
		return newUserCode;
	}

	public void setNewUserCode(String newUserCode) {
		this.newUserCode = newUserCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getCaptchaStr() {
		return captchaStr;
	}

	public void setCaptchaStr(String captchaStr) {
		this.captchaStr = captchaStr;
	}

	
}