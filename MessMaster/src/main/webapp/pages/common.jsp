<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script type="text/javascript">

function getAjaxService(mydata, urlStr, callbackOperation, target, id, name){
	$.ajax({			   		
   		type	: 'GET',
   		url		: urlStr,
   		data	: mydata,
   		crossDomain : true,
   		beforeSend: function(xhr){
   			xhr.setRequestHeader("Content-type", "application/json");
   			xhr.setRequestHeader('Accept', "application/json");
   		},
   		success : function(data) {
			callbackOperation(data, target, id, name);
   		},		   		
   		error: function(xhr, tStatus, err) {
   			$.messager.alert('<spring:message code="warning.lbl"/>', xhr.status);
   			if(xhr.status == 401){ // illegal access
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="unauthrized.access.errmsg"/>');
   			}
   			if(xhr.status == 406){ // illegal access
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="illigal.access.errmsg"/>');
   			}
   			else if(xhr.status == 408){ // request time out
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="request.timeout.errmsg"/>');
   			}
   			else if(xhr.status == 500){ // internal server error
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="internal.server.errmsg"/>');
   			}
   			else {
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="unknown.errmsg"/>');
   			}
   		}
   	});
}

function postAjaxService(mydata, urlStr, callbackOperation, target){
	$.ajax({			   		
   		type	: 'POST',
   		url		: urlStr,
   		data	: mydata,
   		crossDomain : true,
   		beforeSend: function(xhr){
   			xhr.setRequestHeader("Content-type", "application/json");
   			xhr.setRequestHeader('Accept', "application/json");
   		},
   		success : function(data) {
			callbackOperation(data, target);
   		},		   		
   		error: function(xhr, tStatus, err) {
   			$.messager.alert('<spring:message code="warning.lbl"/>', xhr.status);
   			if(xhr.status == 401){ // illegal access
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="unauthrized.access.errmsg"/>');
   			}
   			if(xhr.status == 406){ // illegal access
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="illigal.access.errmsg"/>');
   			}
   			else if(xhr.status == 408){ // request time out
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="request.timeout.errmsg"/>');
   			}
   			else if(xhr.status == 500){ // internal server error
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="internal.server.errmsg"/>');
   			}
   			else {
   				$.messager.alert('<spring:message code="warning.lbl"/>', '<spring:message code="unknown.errmsg"/>');
   			}
   		}
   	});
}

function searchListAjaxService(mydata, urlStr, target){
	postAjaxService(mydata, urlStr, updatesearchList, target);
}

function updatesearchList(data, target){
	$('#' + target).datagrid({pageNumber: 1});
	$('#' + target).datagrid('getPager').pagination({showRefresh:false});
	$('#' + target).datagrid('loadData', data);
}

function selectOptionsAjaxService(mydata, urlStr, target){
	selectOptionsAjaxServiceWithId(mydata, urlStr, target, "id", "name");
}

function selectOptionsAjaxServiceWithId(mydata, urlStr, target, id, name){
	getAjaxService(mydata, urlStr, updateOptionsData, target, id, name)
}

function updateOptionsData(data, target, id, name){
	removeOptions(target);
	$.each(data, function(i, arr) {
        $('#' + target).append($('<option>').text(arr[name]).attr('value', arr[id]).attr('class', 'formdd'));
    });
}

function removeOptions(target){
	$('#' + target)
    .find('option')
    .remove()
    .end();
	$('#' + target).append($('<option>').text('<spring:message code="please.select.lbl"/>').attr('value', '').attr('class', 'formdd'));
}
function removeMsg(){
	$("#pageerrormsg").html('');
	$("#pagsuccessmsg").html('');
}
</script>