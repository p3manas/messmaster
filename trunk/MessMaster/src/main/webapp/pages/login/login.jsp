<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page import="com.mrptech.mess.constants.Tiles" %>
<script type="text/javascript">
localStorage.removeItem("highlight");
$(function(){
	$('#password').bind("cut copy paste", function(e) {
    	e.preventDefault();
    });
});

	function refreshCaptcha(){
		document.getElementById('captcha').src='/portal/img/stickyImg?'+(new Date().getTime());
	}
	function loginFormValidation(){
		cleanFormErrors();
		var valid = true;
		var userNameErr = textFieldValidation("userName", "Y", '<spring:message code="user.name.mandatory.errmsg"/>', 
				null, null, 
				null, null, 
				null, null);
		if(userNameErr != null){
			$( "#userNameErrMsg" ).html(userNameErr);
			valid = false;
		}
		
 		var pwdErr = textFieldValidation("password", "Y", '<spring:message code="password.mandatory.errmsg"/>', 
				null, null, 
				null, null, 
				null, null);
		if(pwdErr != null){
			$( "#pwdErrMsg" ).html(pwdErr);
			valid = false;
		}
		
		/* var captchaErr = textFieldValidation("captchaStr", "Y", '<spring:message code="captcha.mandatory.errmsg"/>', 
				null, null, 
				null, null, 
				null,null);
		if(captchaErr != null){
			$( "#captchaErrormsg" ).html(captchaErr);
			valid = false;
		}  */
		return valid;
	}

	function cleanFormErrors(){
	 	$( "#pageerrormsg" ).html('');
	 	$( "#pagsuccessmsg" ).html('');
		$( "#userNameErrMsg" ).html('');
		$( "#pwdErrMsg" ).html('');
		$( "#captchaErrormsg" ).html('');
	}
	
	function loginSubmit(){
		if(loginFormValidation() == true){
			document.forms["authenticationForm"].submit();
		}
	}
</script>
	 <%-- <form:form method="POST" class="form-signin" commandName="authenticationForm" name="authenticationForm">
    	<h2 class="form-signin-heading"><spring:message code="sign.in.lbl" /></h2>
        <div class="login-wrap">
        	<span class="formerrmsg"  id="userNameErrMsg" ></span>
        	<form:input path="userName" class="form-control" placeholder="User ID" autocomplete="off" autofocus="true"/>
        	<span class="formerrmsg"  id="pwdErrMsg" ></span>
            <form:password path="password" class="form-control" placeholder="Password"/>
            <img class="capimg" alt="captchaImg" id="captcha" src="<%=request.getContextPath()%>/img/stickyImg"/><a href="javascript:refreshCaptcha()" style="text-align:center"><spring:message code="refresh.captcha.lbl" /></a><br>
            <span class="formerrmsg"  id="captchaErrormsg" >${captchaError}</span>
            <form:input path="captchaStr" class="form-control" placeholder="Enter captcha" autocomplete="off" />
            <input type="button" class="btn btn-lg btn-login btn-block" onclick="loginSubmit();" value='<spring:message code="sign.in.lbl" />'/>
            <hr/>
            <a href="<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/customer/sendnewlink" style="text-align:center"><spring:message code="resend.activation.lbl" /></a>
                <br/><br/>
            <div class="form-signin-heading">
	            <a href="<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/customer/forgotpassword" class="pull-left"><spring:message code="forgot.password.lbl" /></a>
    	        <a  href="<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/customer/registration" class="pull-right"><spring:message code="new.user.signup.lbl" /></a>
            </div>
        </div>
	</form:form>
 --%>
 <div class="col-md-4 row-top">
 <div class="panel panel-info" id="ad-login">
				   <div class="panel-heading pnfo" style="background:#EAAC43;">
		           </div>
                  <div class="panel-heading">
				       <h4 class="form-signin-heading"><spring:message code="sign.in.lbl" /></h4>
		          </div>
					  <div class="panel-body panel-body-tkt-details">
					  <form:form method="POST" class="" commandName="authenticationForm" name="authenticationForm">
							  <div class="form-group1">
								<div class="col-xs-9">
								<span class="formerrmsg"  id="userNameErrMsg" ></span>
								  <form:input path="userName" class="form-control" placeholder="User ID" autocomplete="off" autofocus="true"/>
								</div>
							  </div>
                                <div class="form-group1">
								<div class="col-xs-9">
								<span class="formerrmsg"  id="pwdErrMsg" ></span>
								  <form:password path="password" class="form-control" placeholder="Password"/>
								</div>
							  </div>
                               <%-- <div class="form-group1">
								<div class="col-xs-9">
								   <img class="capimg" alt="captchaImg" id="captcha" src="<%=request.getContextPath()%>/img/stickyImg"/><a class="reprs" href="javascript:refreshCaptcha()"><i class="fa fa-refresh"></i></a>
								   <span class="formerrmsg"  id="captchaErrormsg" >${captchaError}</span>
                                 <form:input path="captchaStr" class="form-control" placeholder="Enter captcha" autocomplete="off" />
								</div>
							  </div> --%>
							
							  <div class="form-group1">
									<div class="col-xs-9 marg">
									<input type="button" class="btn btn-default btn-green" onclick="loginSubmit();" value='<spring:message code="sign.in.lbl" />'/>
									</div>
							  </div>
							 <div class="col-xs-8">
							  	<a href="#"><spring:message code="resend.activation.lbl" /></a>
						     </div>
						</form:form><!-- end form-->
					  </div>
					   <div class="panel-footer pf">
                      		<a href="#" class="pull-left clr"><spring:message code="forgot.password.lbl" /></a>
    	              		<a  href="#" class="pull-right clr"><spring:message code="new.user.signup.lbl" /></a>
                      </div>
                      
			    </div>
			    </div>