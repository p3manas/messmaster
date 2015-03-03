<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.mrptech.mess.constants.Tiles" %>
<jsp:include page="/pages/commonPopUp.jsp" ></jsp:include>

<script type="text/javascript">
	$(function(){
	    $('#dateOfBirth').datebox().datebox('calendar').calendar({
	        validator: function(date){
	            var now = new Date();
	            var d1 = new Date(now.getFullYear(), now.getMonth(), now.getDate());
	            return date <= d1;
	        }
	    });
	    
		
		<%-- var stateId = $( "#stateId" ).val();
		if(stateId != null){
			selectOptionsAjaxService('', '<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/commonajax/districtsaddr?stateId=' + stateId, 'districtId');
		} --%>
		
	});

function cancelAction() {
		$.messager.confirm('<spring:message code="confirm.lbl"/>', '<spring:message code="confirm.msg.cancel.add.admin"/>', function(r){
            if(r){
            	window.location.href = '<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/user';
            }
      	});
	}
	
	
	function adFormValidation(){
		cleanFormErrors();
		var valid = true;
		 var userNameErr = textFieldValidation("loginName", "Y", '<spring:message code="user.name.mandatory.errmsg"/>', 
				6, '<spring:message code="user.name.min.length.errmsg"/>', 
				40, '<spring:message code="user.name.max.length.errmsg"/>', 
				RegularExpression, '<spring:message code="user.name.expression.errmsg"/>');
		if(userNameErr != null){
			$( "#loginnameerrmsg" ).html(userNameErr);
			valid = false;
		}
		
		var firstNameErr = textFieldValidation("firstName", "Y", '<spring:message code="first.name.mandatory.errmsg"/>', 
				2, '<spring:message code="first.name.min.length.errmsg"/>', 
				40, '<spring:message code="first.name.max.length.errmsg"/>', 
				NameWithSpaceExpression, '<spring:message code="first.name.expression.errmsg"/>');
		if(firstNameErr != null){
			$( "#fnameerrmsg" ).html(firstNameErr);
			valid = false;
		}
		
		var middleNameErr = textFieldValidation("middleName", null, null, 
				null, null, 
				40, '<spring:message code="middle.name.max.length.errmsg"/>', 
				NameWithSpaceExpression, '<spring:message code="middle.name.expression.errmsg"/>');
		if(middleNameErr != null){
			$( "#mnameerrmsg" ).html(middleNameErr);
			valid = false;
		}
		
		var lastNameErr = textFieldValidation("lastName", "Y", '<spring:message code="last.name.mandatory.errmsg"/>', 
				null, null,
				40, '<spring:message code="last.name.max.length.errmsg"/>', 
				NameWithSpaceExpression, '<spring:message code="last.name.expression.errmsg"/>');
		if(lastNameErr != null){
			$( "#lnameerrmsg" ).html(lastNameErr);
			valid = false;
		}
		
		var phoneNameErr = textFieldValidation("phoneNumber", "Y", '<spring:message code="phone.number.mandatory.errmsg"/>', 
				10, '<spring:message code="phone.number.min.length.errmsg"/>', 
				15, '<spring:message code="phone.number.max.length.errmsg"/>', 
				NumberExpression, '<spring:message code="phone.number.expression.errmsg"/>');
		if(phoneNameErr != null){
			$( "#pherrmsg" ).html(phoneNameErr);
			valid = false;
		}
		
		var altPhoneNameErr = textFieldValidation("altPhoneNumber", "N", '<spring:message code="altphone.number.mandatory.errmsg"/>', 
				10, '<spring:message code="phone.number.min.length.errmsg"/>',  
				15, '<spring:message code="phone.number.max.length.errmsg"/>', 
				NumberExpression, '<spring:message code="phone.number.expression.errmsg"/>');
		if(altPhoneNameErr != null){
			$( "#altpherrmsg" ).html(altPhoneNameErr);
			valid = false;
		}
		
		var emailErr = textFieldValidation("email", "Y", '<spring:message code="email.mandatory.errmsg"/>', 
				null, null, 
				40, '<spring:message code="email.id.max.length.errmsg"/>', 
				EmailExpression, '<spring:message code="email.id.errmsg"/>');
		if(emailErr != null){
			$( "#emailerrmsg" ).html(emailErr);
			valid = false;
		}
		
		var genderErr = radioButtonValidation("gender", "Y", '<spring:message code="gender.is.mandatory.errmsg"/>');
		if(genderErr != null){
			$( "#gendererrmsg" ).html(genderErr);
			valid = false;
		}

		
		
		var addrLine1Err = textFieldValidation("line1", "Y", '<spring:message code="addrLine1.mandatory.errmsg"/>', 
				null, null, 
				100, '<spring:message code="addrLine1.max.length.errmsg"/>', 
				AddressExpression , '<spring:message code="addr.line1.errmsg"/>');
		if(addrLine1Err != null){
			$( "#addrl1errmsg" ).html(addrLine1Err);
			valid = false;
		}	
		
		var addrLine2Err = textFieldValidation("line2", null, null, 
				null, null, 
				100, '<spring:message code="addrLine2.max.length.errmsg"/>', 
				AddressExpression , '<spring:message code="addr.line2.errmsg"/>');
		if(addrLine2Err != null){
			$( "#addrl2errmsg" ).html(addrLine2Err);
			valid = false;
		}
		
	
		
 		var dobErr = dobValidation("dateOfBirth", "Y", '<spring:message code="dob.mandatory.errmsg"/>', 
				'<spring:message code="dob.allow.errmsg"/>', true, '<spring:message code="dob.feature.errmsg"/>');
		if(dobErr != null){
			$( "#dateofbirtherrmsg" ).html(dobErr);
			valid = false;
		} 
		return valid;
	}
	
	function cleanFormErrors(){
	 	$( "#loginnameerrmsg" ).html('');
		$( "#fnameerrmsg" ).html('');
		$( "#mnameerrmsg" ).html('');
		$( "#lnameerrmsg" ).html('');
		$( "#pherrmsg" ).html('');
		$( "#emailerrmsg" ).html('');
		$( "#altpherrmsg" ).html('');
		$( "#dateofbirtherrmsg" ).html('');		
		$( "#gendererrmsg" ).html('');
		$( "#addrl1errmsg" ).html('');
		$( "#addrl2errmsg" ).html('');
	}
	
	function onSubmitPage(){

		//if(adFormValidation() == true){
			$.messager.confirm('<spring:message code="confirm.lbl"/>', '<spring:message code="confirm.msg.add.admin"/>', function(r){
	            if(r){
	            	document.forms["userForm"].submit();
	            }
	      	});
		} 
	//}
	
</script>





<div class="col-md-10">
<form:form commandName="userForm" method="POST" name="userForm" action="saveUser" class="formnew1">
<section class="panel panel2">
		<header class="panel-heading tab-bg-dark-navy-blue">
		    <ul class="nav nav-tabs nav-justified ">
		        <li class="active"><a href="#" data-toggle="tab" ><spring:message code="add.user.lbl" /></a></li>
		    </ul>
		</header>
		<div class="panel-body panel-body1">
		    <div class="tab-content tasi-tab">

	<table class="tabx">
        
        <tr>
			<td></td><td><span class="formerrmsg" id="loginnameerrmsg"></span></td>
	    </tr>
		<tr>
			<td><span class="formlabel"><spring:message code="user.name.lbl" /></span><span class="requiredstar">* </span></td>
			<td><form:input class="formtf1 form-control" path="userName" autocomplete="off" size="20" maxlength="40" /></td>
		</tr>
		<tr>
			<td></td><td><span class="formerrmsg" id="fnameerrmsg"></span></td>
	    </tr>
		<tr>
			<td><span class="formlabel"><spring:message code="first.name.lbl" /></span><span class="requiredstar">* </span></td>
			<td><form:input class="formtf1 form-control" path="firstName" autocomplete="off" size="20" maxlength="40"  /></td>
		</tr>
        <tr>
			<td></td><td><span class="formerrmsg" id="mnameerrmsg"></span></td>
	    </tr>
		 <tr>
			<td><span class="formlabel"><spring:message code="middle.name.lbl" /></span></td>
			<td><form:input class="formtf1 form-control" path="middleName" autocomplete="off" size="20" maxlength="40" /></td>
		</tr>
		<tr>
			<td></td><td><span class="formerrmsg" id="lnameerrmsg"></span></td>
	    </tr>
		<tr>
			<td><span class="formlabel"><spring:message code="last.name.lbl" /></span><span class="requiredstar">* </span></td>
			<td><form:input class="formtf1 form-control" path="lastName" autocomplete="off" size="20" maxlength="40"  /></td>
		</tr>
		<tr>
			<td></td><td><span class="formerrmsg" id="pherrmsg"></span></td>
	    </tr>
		<tr>
			<td><span class="formlabel"><spring:message code="phone.number.lbl" /></span><span class="requiredstar">* </span></td>
			<td><form:input class="formtf1 form-control" path="phoneNumber" autocomplete="off" size="20" maxlength="15"/></td>
		</tr>
		<tr>
		<td></td><td><span class="formerrmsg" id="altpherrmsg"></span></td>
	    </tr>
		<tr>
			<td><span class="formlabel"><spring:message code="altphone.number.lbl" /></span></td>
			<td><form:input class="formtf1 form-control" path="altPhoneNumber" autocomplete="off" size="20" maxlength="15"/></td>
		</tr>
		<tr>
			<td></td><td><span class="formerrmsg" id="emailerrmsg"></span></td>
	    </tr>
		<tr>
			<td><span class="formlabel"><spring:message code="email.lbl" /></span><span class="requiredstar">* </span></td>
			<td><form:input class="formtf1 form-control" path="email" autocomplete="off" size="20" maxlength="40" /></td>
		</tr>
					
		<tr>
			<td></td><td><span class="formerrmsg" id="gendererrmsg"></span></td>
	    </tr>
		 <tr>
			<td><span class="formlabel"><spring:message code="gender.lbl" /></span><span class="requiredstar">* </span></td>
			<td> 
				<span class="formlabel"><spring:message code="male.lbl" /></span>
			     <form:radiobutton class="fromrb" path="gender" value="M" />
		         <span class="formlabel"><spring:message code="female.lbl" /></span>
			     <form:radiobutton class="fromrb" path="gender" value="F" />
			</td>
		</tr>	
		
		
	    <tr>
			<td></td><td><span class="formerrmsg" id="addrl1errmsg"></span></td>
	    </tr>
	    <tr>
			<td><span class="formlabel"><spring:message code="addr.line1.lbl" /></span><span class="requiredstar">* </span></td>
		<td>
			<form:textarea class="fromta formtf1  form-control" path="address1" size="20" maxlength="100"/>
		</td>
		</tr>
		<tr>
			<td></td><td><span class="formerrmsg" id="addrl2errmsg"></span></td>
	    </tr>
		<tr>
			<td><span class="formlabel"><spring:message code="addr.line2.lbl" /></span></td>
			<td><form:textarea class="fromta formtf1 form-control" path="address2" size="20" maxlength="100"/></td>
		</tr>
	    
	    <tr>
			<td></td><td><span class="formerrmsg" id="dateofbirtherrmsg"></span></td>
	    </tr>
	    <tr>
			<td><span class="formlabel"><spring:message code="dateof.birth.lbl" /></span><span class="requiredstar">* </span></td>
			<td><form:input class="easyui-datebox" path="dateOfBirth"/></td>
		</tr>
           <%-- <tr>
             <form:hidden path="category"></form:hidden>
             <form:hidden path="categoryStr"></form:hidden>
			<td></td>
			<td>
				
			</td>
		</tr>  --%>
	</table>

</div>
</div>
<div class="footbtn1">
<input type="button" class="btna btn btn-info btm" onClick="onSubmitPage();" value='<spring:message code="add.lbl"/>'/>
<input type="button" class="btna btn btn-primary btm" onclick="cancelAction();" value='<spring:message code="cancel.lbl"/>'/>
</div>
</section>
</form:form>
</div>





