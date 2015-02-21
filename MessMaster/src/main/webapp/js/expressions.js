var NameExpression = /^[A-Za-z]*$/;
var NameWithSpaceExpression = /^[A-Za-z ]*$/;
var NumberExpression = /^[0-9]*$/;
var RegularExpression = /^[A-Za-z0-9@_.]*$/;
var NameAndNumberExpression = /^[A-Za-z0-9 ]*$/;
var EmailExpression = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
var AddressExpression = /^[A-Za-z0-9\s\r\n #&()-/.,'"]*$/;
var DecimalExpression1 = /^[0-9]{0,5}(\.[0-9]{1,2})?$/;   
var DecimalExpression2 = /^[0-9]{0,2}(\.[0-9]{1,2})?$/; 
var TextAreaExpression = /^[A-Za-z0-9\s\r\n -/.,'"]*$/;
						