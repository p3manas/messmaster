<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript">
$(function(){
	$("#captchaStr").val('');
	$('#password').bind("cut copy paste", function(e) {
    	e.preventDefault();
    });
	$('#confirmPassword').bind("cut copy paste", function(e) {
    	e.preventDefault();
    });
});

function refreshCaptcha(){
	document.getElementById('captcha').src='/portal/img/stickyImg?'+(new Date().getTime());
}

function resetPwdFormValidation(){
	cleanFormErrors();
	var valid = true;

	var pwdErr = textFieldValidation("password", "Y", '<spring:message code="password.mandatory.errmsg"/>', 
			6, '<spring:message code="new.password.min.length.errmsg"/>', 
			20, '<spring:message code="new.password.max.length.errmsg"/>', 
			null, null);
	if(pwdErr != null){
		$( "#pwdErrMsg" ).html(pwdErr);
		valid = false;
	}
	
	if(pwdErr == null){
		var pwdValErr = checkPwd("password", '<spring:message code="new.password.alpha.numeric.errmsg"/>');
		if(pwdValErr != null){
			$( "#pwdErrMsg" ).html(pwdValErr);
			valid = false;
		}
	}
	
	var cpwdErr = textFieldValidation("confirmPassword", "Y", '<spring:message code="confirm.password.mandatory.errmsg"/>', 
			null, null, 
			null, null, 
			null, null);
	if(cpwdErr != null){
		$( "#confPwdErrMsg" ).html(cpwdErr);
		valid = false;
	}
	else if($("#password").val() != $("#confirmPassword").val()){
		$( "#confPwdErrMsg" ).html('<spring:message code="pwd.cpwd.not.matching.errmsg"/>');
		valid = false;
	}
	
	var captchaErr = textFieldValidation("captchaStr", "Y", '<spring:message code="captcha.mandatory.errmsg"/>', 
			null, null, 
			null, null, 
			null,null);
	if(captchaErr != null){
		$( "#captchaErrormsg" ).html(captchaErr);
		valid = false;
	} 
	return valid;
}

function cleanFormErrors(){
 	$( "#pageerrormsg" ).html('');
 	$( "#pagsuccessmsg" ).html('');
	$( "#pwdErrMsg" ).html('');
	$( "#confPwdErrMsg" ).html('');
	$( "#captchaErrormsg" ).html('');
}

function resetPwdFormSubmit(){
	if(resetPwdFormValidation() == true){
		document.forms["authenticationForm"].submit();
	}
}
</script>
<div class="col-md-6 row-top">
<div class="panel panel-info" id="ad-login">
				   <div class="panel-heading pnfo" style="background:#EAAC43;">
		           </div>
					  <div class="panel-body panel-body-tkt-details">
	<form:form method="POST" commandName="authenticationForm" name="authenticationForm" class=" formnew1">
	<h5 class="fortitle"><spring:message code="reset.lbl" /></h5>
		<span id="loginError"></span>
		<table>
			<tr>
				<td colspan="2"><span class="error"  id="errormsg"></span></td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="pwdErrMsg" ></span></td>
			</tr>
			<tr>
				<td><span class="formlabel"><spring:message code="password.lbl" /><span class="requiredstar">*</span></span></td>
				<td><form:password path="password" class="form-control" maxlength="20"/></td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="confPwdErrMsg" ></span></td>
			</tr>
			<tr>
				<td><span class="formlabel"><spring:message code="confirm.password.lbl" /><span class="requiredstar">*</span></span></td>
				<td><input type="password" id="confirmPassword" class="form-control" maxlength="20"/></td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="captchaErrormsg" >${captchaError}</span></td>
			</tr>
			<tr>
				<td colspan="2">
					<span class="formlabel"><spring:message code="captcha.lbl" /><span class="requiredstar">*</span></span>
					<img class="capimg capig1" alt="captchaImg" id="captcha" src="<%=request.getContextPath()%>/img/stickyImg"/><a class="reprs" href="javascript:refreshCaptcha()" style="text-align:center"><i class="fa fa-refresh"></i></a>
			        <form:input path="captchaStr" autocomplete="off" class="form-control capmg1"/></td>
			</tr>
			<tr>
			<td></td>
				<td>
					<form:hidden path="userName" />
					<input type="button" class="btn btn-info" onClick="resetPwdFormSubmit()" value='<spring:message code="submit.lbl"/>'/>
				</td>
			</tr>
		</table>
	</form:form>
</div>
</div>
</div>