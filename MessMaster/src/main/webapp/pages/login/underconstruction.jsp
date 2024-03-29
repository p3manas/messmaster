<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
	<head>
		<!-- Bootstrap core CSS -->
	    <link href="${contextPath}/css/bootstrap.min.css" rel="stylesheet">
	    <link href="${contextPath}/css/bootstrap-reset.css" rel="stylesheet">
	    <!--external css-->
	    <link href="${contextPath}/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
	    <!--right slidebar-->
	    <link href="${contextPath}/css/slidebars.css" rel="stylesheet">
	      
	    <!-- Custom styles for this template -->
	    <link href="${contextPath}/css/style.css" rel="stylesheet">
	    <link href="${contextPath}/css/style-responsive.css" rel="stylesheet" /> 
	      
	    <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
	    <!--[if lt IE 9]>
	    <script src="${contextPath}/js/html5shiv.js"></script>
	    <script src="${contextPath}/js/respond.min.js"></script>
	    <![endif]-->
			
		<!-- easy ui libraries -->
		<link href="${contextPath}/theams/default/easyui.css" rel="stylesheet" type="text/css" />
		<link href="${contextPath}/theams/default/datagrid.css" rel="stylesheet" type="text/css" />
		<link href="${contextPath}/theams/icon.css" rel="stylesheet" type="text/css" />   
	    <!-- Custom styles for this template -->
	    
	    <link href="${contextPath}/css/bootstrap-responsive.min.css" rel="stylesheet">
    
		<script type='text/javascript' src='<%=request.getContextPath()%>/js/eu/jquery.min.js'></script>
		<script type='text/javascript' src='<%=request.getContextPath()%>/js/eu/jquery.easyui.min.js'></script>
		<script type='text/javascript' src='<%=request.getContextPath()%>/js/expressions.js'></script>
		<script type='text/javascript' src='<%=request.getContextPath()%>/js/validations.js'></script>
		<script type='text/javascript' src='<%=request.getContextPath()%>/js/datevalidations.js'></script>
		<script type='text/javascript' src='<%=request.getContextPath()%>/js/slidebars.min.js'></script>
		<script type='text/javascript' src='<%=request.getContextPath()%>/js/scripts.js'></script>
		
		
		<jsp:include page="/pages/common.jsp" ></jsp:include>
	</head>
	<body>
		<section id="container">
			<jsp:include page="/pages/header.jsp" ></jsp:include>
			<%-- <jsp:include page="/pages/navigator.jsp" ></jsp:include> --%>
		</section>	
		<div class="page-content">
		 <section id="main-content">
       <section class="wrapper">
               <div class="row">
					<div class="center"><h1>Under Construction</h1></div>
				</div>
			</section>
		</section>
			
		</div>	
		
		<jsp:include page="/pages/footer.jsp" ></jsp:include>
	</body>
</html>