<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="customer.dashboard.lbl"/></title>

</head>	           
                  <div>
                  <ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="#">Home</a> 
								<i class="icon-angle-right"></i>
							</li>
							<li><a href="#">Dashboard</a></li>
						</ul>
                  </div>
 <div class ="jumbotron">
		<div class="container">
		
		
		
		
		
		
		
		
 <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active" style="height:500px;">
      <img src="<%=request.getContextPath()%>/img/1.jpg">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item" style="height:500px;">
      <img src="<%=request.getContextPath()%>/img/2.jpg">
      <div class="carousel-caption">
      </div>
    </div>
    <div class="item" style="height:500px;">
      <img src="<%=request.getContextPath()%>/img/3.jpg">
      <div class="carousel-caption">
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

</div>
</div>
                  
        <script type="text/javascript">
			 $(function() { 
				 isDashboard = "true";
				 setHighlight("");
		     });
		</script>        

</html>