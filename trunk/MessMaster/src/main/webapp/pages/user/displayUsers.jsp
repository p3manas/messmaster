<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.mrptech.mess.constants.Tiles" %>
<jsp:include page="/pages/commonPopUp.jsp" ></jsp:include>
<script type="text/javascript">
function addUser(){
	var id = $("#id").val();
	var category = $("#category").val();
	window.location.href = '<%=request.getContextPath()%>/<%=Tiles.RD_URL_PATH_PREFIX%>/user/add';
}
</script>
<div class="container">
<!-- 	<button type="button" class="btn btn-primary btn-lg" onclick="updateAction();"  data-toggle="modal" data-target="#myModal">Add User</button>
 -->
 <button type="button" class="btn btn-primary btn-lg" onclick="addUser();"  >Add User</button>		
	<hr>
	
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
			<tbody>
				<tr>
					<th>Login Name</th>
					<th>Contact No</th>
					<th>User Name</th>
					<th>status</th>
				</tr>
				
				<c:if test="${USERS ne null }">
				
							<c:forEach items="${USERS}" var="users">
							<tr>
						        <td>${ users.userName}</td>
								<td>${ users.mobNo}</td>
								<td>${ users.firstName}</td>
								<td>${ users.status}</td>
							</tr>
						    </c:forEach>
						</c:if>
					
				
			</tbody>
		</table>
	</div>
</div>
