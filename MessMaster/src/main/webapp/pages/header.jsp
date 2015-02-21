<%@page import="com.mrptech.mess.constants.Tiles" %>

<%-- <div class="header navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container-fluid">
			<a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse" style="display:none">
				<i class="fa fa-tasks togl"></i>
			</a>  
			<a href="#" class="logo" ><span>Mess Managent</span></a>	
			<span class="username">Welcome: manas <br>Your last visit was on : Today</span>			                     
			<ul class="nav pull-right top-menu top-menus">
<!-- 	        	<li><a href="#"><i class="fa fa-cog"></i></a></li>
	            <li><a href="#"><i class="fa fa-bell-o"></i></a></li>
	            <li><a href="#"><i class="fa fa-key"></i></a></li> -->
	            <li title="Logout"><a href="<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/customer/logout"><i class="fa fa-power-off"></i></a></li>
		    </ul>
		</div>
	</div>
</div> --%>

   <div class="header navbar navbar-inverse navbar-fixed-top">
   <div class="navbar-inner">
	<div class ="container-fluid">
	<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
		</div>
		<a href="#" class="navbar-brand">ManasWeb</a>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li ><a href="index.html">Home</a></li>
				<li><a href="index.html">About</a></li>
				<li><a href="index.html">Contact</a></li>
				<li class="dropdown">
					<a href="#" class ="dropdown-toggle" data-toggle="dropdown"> WDM Dropdown <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Link1</a></li>
						<li><a href="#">Link2</a></li>
						<li><a href="#">Link3</a></li>
						<li class="divider"></li>
						<li><a href="#">Separate link</a></li>
						<li class="divider"></li>
						<li><a href="#">One more Separate link</a></li>
					</ul>
				</li>
				
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
					  <input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				 </form>
				 <li title="Logout"><a href="<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/customer/logout"><i class="fa fa-power-off"></i></a></li>
			</ul>
		</div>
	</div>
</div>
	</div>