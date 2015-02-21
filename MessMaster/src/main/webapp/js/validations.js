function textFieldValidation(fieldId, mandatory, mandatoryErr, minValue, minErr, maxValue, maxErr, expr, exprErr){
	var value = $( "#" + fieldId ).val();
	$( "#" + fieldId ).value = value.trim();
	if(mandatory == "Y" || mandatory == "y"){
		if(value == ""){
			return mandatoryErr;
		}
	}
	if(value != ""){
		if(minValue != null){
			if(value.length < minValue){
				return minErr;
			}
		}
	    if(maxValue != null){
			if(value.length > maxValue){
				return maxErr;
			}
		}
	    if(expr != null){
			if( !expr.test(value) ){
				return exprErr;
			}
		}
	}
	return null;
}

function radioButtonValidation(fieldName, mandatory, mandatoryErr){
	if(mandatory == "Y" || mandatory == "y"){
		var value = $('input[name=' + fieldName + ']:checked').val();
		if(value == undefined || value == "" ){
			return mandatoryErr;
		}
	}
}

function valDrop(fieldId, mandatory, mandatoryErr) {
	if(mandatory == "Y" || mandatory == "y"){
		var value = $( "#" + fieldId ).val();
		if(value == "" || value == undefined){
			return mandatoryErr;
		}
	}
}

function confrimtionDialog(message, useraction){
	 $.messager.confirm('Confirm', message, useraction);
}

function dobValidation(fieldId, mandatory, mandatoryErr, exprErr, pastDate, pastErr){
	var value = $( "#" + fieldId ).datebox('getValue');
	var err = dateValidation(fieldId, mandatory, mandatoryErr, exprErr);
	if(err == null){
		if(pastDate == true){
			var date = new Date(value);
			if( !(date < new Date())){
				return pastErr;
			}
		}
		return null;
	}
	else {
		return err;
	}
	
}

function dateValidation(fieldId, mandatory, mandatoryErr, exprErr){
	var value = $( "#" + fieldId ).datebox('getValue');
	$( "#" + fieldId ).value = value.trim();
	if(mandatory == "Y" || mandatory == "y"){
		if(value == ""){
			return mandatoryErr;
		}
	}
	if(value != ""){
		if( !isValidDate(value) ){
			return exprErr;
		}
	}
	return null;
}

//Pagination
function pagerFilter(data){
	if (typeof data.length == 'number' && typeof data.splice == 'function'){ // is array
		data = {
				total: data.length,
				rows: data
		}
	}
	var dg = $(this);
	var opts = dg.datagrid('options');
	var pager = dg.datagrid('getPager');
	pager.pagination({
		onSelectPage:function(pageNum, pageSize){
			opts.pageNumber = pageNum;
			opts.pageSize = pageSize;
			pager.pagination('refresh',{
				pageNumber:pageNum,
				pageSize:pageSize
			});
			dg.datagrid('loadData',data);
		}
	});
	if (!data.originalRows){
		data.originalRows = (data.rows);
	}
	if (!opts.remoteSort && opts.sortName){
		var target = this;
		var names = opts.sortName.split(',');
		var orders = opts.sortOrder.split(',');
		data.originalRows.sort(function(r1,r2){
			var r = 0;
			for(var i=0; i<names.length; i++){
				var sn = names[i];
				var so = orders[i];
				var col = $(target).datagrid('getColumnOption', sn);
				var sortFunc = col.sorter || function(a,b){
					return a==b ? 0 : (a>b?1:-1);
				};
				r = sortFunc(r1[sn], r2[sn]) * (so=='asc'?1:-1);
				if (r != 0){
					return r;
				}
			}
			return r;
		});
	}
	var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
	var end = start + parseInt(opts.pageSize);
	data.rows = (data.originalRows.slice(start, end));
	return data;
}

// decimal number validation
function decimalTextFieldValidation(fieldId, mandatory, mandatoryErr, expr, exprErr){
	var value = $( "#" + fieldId ).val();
	$( "#" + fieldId ).value = value.trim();
	if(mandatory == "Y" || mandatory == "y"){
		if(value == ""){
			return mandatoryErr;
		}
	}
	if(value != ""){
		if(expr != null){
			if( !expr.test(value) ){
				return exprErr;
			}
		}
	}
	return null;
}


function checkPwd(fieldId, containAlphaNumError ) {
	var value = $( "#" + fieldId ).val();
	if (value.search(/\d/) == -1 || value.search(/[a-zA-Z]/) == -1 || value.search(/[#@!_$.]/) == -1) { 
		return containAlphaNumError;
	}  
}
