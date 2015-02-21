<%@page import="com.mrptech.mess.constants.Tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- sidebar start -->
<script type="text/javascript">
		 
		
	$(function() {		
	    $("a").click(function() {	    	
	      $this = $(this);
	      localStorage.setItem("highlight", $this.parent().attr('id'));
		      if($this.parent().parent().parent().hasClass("start")){	
		    	  localStorage.removeItem("highlight");
				  localStorage.setItem("highlight", $this.parent().attr('id')+"|"+$this.parent().parent().parent().attr('id'));
		      }
	    });	    
	    
	    setHighlight(localStorage.getItem("highlight"));
	});
	function setHighlight(id){	
		console.log(id +" "+isDashboard)
		if(id=="undefined" || id=="null" || id==null){		
			return;
		}
		if(isDashboard == "true"){
			isDashboard = "false";
			localStorage.setItem("highlight","dashbord1");
	    	setHighlight("dashbord1");
	    	return;
	    }
		console.log(id+"--->")
		 $('li').removeClass('active');
		 var id_ =id.split("|")
		 $("#"+id_[0]).addClass('active');
		 if(id_.length>0){
			 $("#"+id_[1]).addClass('active open');
			 $("#"+id_[1]+" span").addClass('open'); 
		 }		
	}
</script>
<div class="page-container">
	<div class="page-sidebar nav-collapse collapse">      
		<ul class="page-sidebar-menu">
			<li>
				<div class="sidebar-toggler hidden-phone">
               		<span class="tog-icon" id="menuOpen"><i class="fa fa-ellipsis-v"></i>&nbsp;<i class="fa fa-arrow-left"></i></span>
                 	<span class="tog-icon" id="menuClose" style="display:none;"><i class="fa fa-ellipsis-v"></i>&nbsp;<i class="fa fa-arrow-right"></i></span>
				</div>
			</li>
			
						
				<li class="start" id="dashbord1">
					<a href="<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/custdashboard">
						<i class="fa fa-dashboard"></i> 
						<span class="title"><spring:message code="dashboard.lbl" /></span>
						<span class="selected"></span>
					</a>
				</li>
				
			<c:forEach items="${SideMenu}" var="parent">
			
				<li>
					<a class="" href="javascript:;">
						<i class="fa fa-retweet"></i>
						<span class="title">${parent.key}</span>
						<span class="arrow"></span>
					</a>
					<ul class="sub-menu">
					<c:forEach items="${parent.value}" var="child">
						
							<li id="loanreq"><a href="<%=request.getContextPath()%>/${child.url}">${child.userName}</a></li>
							
					</c:forEach>
					</ul>		
											
					
				</li>
			</c:forEach>
		</ul>
	</div>
</div>
