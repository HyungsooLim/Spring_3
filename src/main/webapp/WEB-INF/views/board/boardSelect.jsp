<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
		<h1>${board }SelectPage</h1>
		<h3>Title : ${DTO.title }</h3>
		<h3>Writer : ${DTO.writer }</h3>
		<h3>Contents : ${DTO.contents }</h3>
		<div>
			<c:forEach items="${DTO.qnaFiles }" var="file">
				<a href="../resources/upload/${board }/${file.fileName}">${file.originName }</a><br>
			</c:forEach>
		</div>
		<a href="./${board}Update?num=${DTO.num}" class="btn btn-danger">Update</a>
		<a href="#" id="del" class="btn btn-info">Delete</a>
		<c:if test="${board ne 'notice'}">
			<a href="./${board }Reply?num=${DTO.num}" class="btn btn-primary">Reply</a>
		</c:if>
		<form action="./${board}Delete" id="frm">
			<input type="hidden" name="num" value="${DTO.num}">
		</form>
		
	</div>
	<script type="text/javascript">
		const del = document.getElementById("del");
		const frm = document.getElementById("frm");
		del.addEventListener("click", function() {
			let result = confirm("Delete?");
			if(result){
				frm.setAttribute("method", "POST");
				frm.submit();
				//location.href="./${board}Delete?num=${DTO.num}";
			}
		});
	</script>
</body>
</html>