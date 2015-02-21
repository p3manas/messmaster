<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript">
$(function(){
	$('#password').bind("cut copy paste", function(e) {
    	e.preventDefault();
    });
	$('#confirmPassword').bind("cut copy paste", function(e) {
    	e.preventDefault();
    });
	$('#answer').bind("cut copy paste", function(e) {
    	e.preventDefault();
    });
});

function refreshCaptcha(){
	document.getElementById('captcha').src='/portal/img/stickyImg?'+(new Date().getTime());
}

function newUserFormValidation(){
	cleanFormErrors();
	var valid = true;

	var pwdErr = textFieldValidation("password", "Y", '<spring:message code="password.mandatory.errmsg"/>', 
			6, '<spring:message code="password.min.length.errmsg"/>',
			20, '<spring:message code="password.max.length.errmsg"/>',
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
	
	var secQuestErr = valDrop("questionId", "Y", '<spring:message code="question.is.mandatory.errmsg"/>');
	if(secQuestErr != null){
		$( "#questionerrmsg" ).html(secQuestErr);
		valid = false;
	}
	
	var secAnsErr = textFieldValidation("answer", "Y", '<spring:message code="answer.mandatory.errmsg"/>', 
			null, null, 
			20, '<spring:message code="answer.max.length.errmsg"/>', 
			null, null);
	if(secAnsErr != null){
		$( "#secAnsErrMsg" ).html(secAnsErr);
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
	$( "#userNameErrMsg" ).html('');
	$( "#pwdErrMsg" ).html('');
	$( "#confPwdErrMsg" ).html('');
	$( "#questionerrmsg" ).html('');
	$( "#secAnsErrMsg" ).html('');
	$( "#captchaErrormsg" ).html('');
}

function newUserSubmit(){
	if(newUserFormValidation() == true){
		document.forms["newUserForm"].submit();
	}
}
</script>
<div class="col-md-8 row-top rows1">
<div class="panel panel-info" id="ad-login">
				   <div class="panel-heading pnfo" style="background:#EAAC43;">
		           </div>
					  <div class="panel-body panel-body-tkt-details">
	<form:form method="POST" commandName="newUserForm" name="newUserForm" class=" formnew1">
		<span id="loginError"></span>
		<table>
			<tr>
				<td colspan="2"><span class="error"  id="errormsg"></span></td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="userNameErrMsg" ></span></td>
			</tr>
			<tr>
				<td><span class="formlabel"><spring:message code="user.name.lbl" /><span class="requiredstar">*</span></span></td>
				<td><span class="datalabel">${newUserForm.userName}</span></td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="pwdErrMsg" ></span></td>
			</tr>
			<tr>
				<td><span class="formlabel"><spring:message code="password.lbl" /><span class="requiredstar">*</span></span></td>
				<td><form:password path="password" class="form-control"/></td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="confPwdErrMsg" ></span></td>
			</tr>
			<tr>
				<td><span class="formlabel"><spring:message code="confirm.password.lbl" /><span class="requiredstar">*</span></span></td>
				<td><form:password path="" id="confirmPassword" class="form-control" /></td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="questionerrmsg" ></span></td>
			</tr>
			<tr>
				<td><span class="formlabel"><spring:message code="security.question.lbl" /><span class="requiredstar">*</span></span></td>
				<td>
					<form:select path="questionId" id="questionId" class="form-control">
					<form:option value=""><spring:message code="please.select.lbl"/></form:option>
						<c:if test="${questionslist ne null }">
							<c:forEach items="${questionslist}" var="entry">
					        	<form:option value="${entry.id}" title="${entry.question}" label="${entry.question}" />
					    	</c:forEach>
						</c:if>
					</form:select>
				</td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="secAnsErrMsg" ></span></td>
			</tr>
			<tr>
				<td><span class="formlabel"><spring:message code="answer.lbl" /></span><span class="requiredstar">*</span></td>
				<td><form:password path="answer" maxlength="20" class="form-control"/></td>
			</tr>
			<tr>
				<td colspan="2"><span class="formerrmsg"  id="captchaErrormsg" >${captchaError}</span></td>
			</tr>
			<tr>
				<td colspan="2">
					<span class="formlabel"><spring:message code="captcha.lbl" /></span>
					<span class="requiredstar">*</span><img class="capimg capig" alt="captchaImg" id="captcha" src="<%=request.getContextPath()%>/img/stickyImg"/><a class="reprs" href="javascript:refreshCaptcha()" style="text-align:center"><i class="fa fa-refresh"></i></a>
					<form:input path="captchaStr" autocomplete="off" class="form-control capmg"/>
				</td>
			</tr> 
			<tr>
				<td></td>
				<td>
					<form:hidden path="userName"/>
					<input type="button" class="btn btn-info" onClick="newUserSubmit()" value='<spring:message code="submit.lbl"/>'/>
				</td>
			</tr>
		</table>
	</form:form>
</div>
</div>
</div>