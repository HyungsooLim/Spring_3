<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib
	prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"
%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootStrap.jsp"></c:import>
<title>noticeSelect</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
		<h2>Notice</h2>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">SUBJECT</th>
					<th scope="col">NAME</th>
					<th scope="col">DATE</th>
					<th scope="col">HIT</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${DTO.title }</td>
					<td>${DTO.writer }</td>
					<td>${DTO.regdate }</td>
					<td>${DTO.hit }</td>
				</tr>
				<tr>
					<td>${DTO.contents }</td>
				</tr>
			</tbody>
		</table>
		<c:if test="${not empty member and member.id eq 'admin' }">
		<a href="./noticeUpdate?num=${DTO.num }" class="btn btn-dark" role="button">Update</a>
		<a href="./noticeDelete?num=${DTO.num }" class="btn btn-danger" role="button">Delete</a>
		</c:if>
	</div>

</body>
</html>