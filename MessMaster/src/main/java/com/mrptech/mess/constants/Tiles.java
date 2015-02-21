/**
 * 
 */
package com.mrptech.mess.constants;

/**
 * @author manas rp
 *
 */
public interface Tiles {
	
	String RD_PREFIX = "redirect:";
	
	String RD_URL_PATH_PREFIX = "mfs"; 
	
	String SLASH_STRING = "/";
	
	String RD_PATH_PREFIX = RD_PREFIX + SLASH_STRING + RD_URL_PATH_PREFIX + SLASH_STRING;
	

	//example
	
	String ID = "id";
	
	String QUESTION_MARK = "?";
	
	String EQUALS_SYMBOL = "=";
	
	String AMPERSAND = "&";
	
	String VIEW_CUSTOMER = "viewcustomer";
	
	String VIEWAPPLICATION = "view";
	
	String CUSTOMER_ID = "customerId";
	
	String REQUEST_ID = "requestId";
	
	String PRODUCT_NAME = "productName";
	
	
	String VIEWAGENT = "viewagent";
	
	String VIEWADMIN = "viewadmin";
	
	String ADD_NEWUSER="add.userregister";
	
	String CHANGE_PASSWORD = "change.password";
	
	String UPDATE_QUESTIONS = "update.questions";
	
	//String LOANAPPMGMT = "applicationmgmt";
	
	String ADD_APPLICATIONS = "add.aplications";
	
	String LISTAPPLICATIONS = "agentlam";
	
	//start:List Of Deposit Management by admin
	
    String DEPOSITREQUESTMGMT_ADMIN = "deprequestmgmt.admin";
    
    //End:List Of Deposit Management by admin
    
    String DEPLISTREQUEST = "addeprqmgmt";
    
  //start:List Of Deposit Application by Agent
    
    String LIST_DEPOSIT_APPLICATIONS = "list.applications.deposit";
    
    String ADD_APPLICATION_DEPOSIT = "add.applications.deposit";
    
    String VIEW_APPLICATION_DEPOSIT = "view.application.deposit";
    
    String UPDATE_APPLICATION_DEPOSIT = "update.application.deposit";
   
  //End:List Of Deposit Application by Agent
    
}