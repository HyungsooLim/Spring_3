<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootStrap.jsp"></c:import>
<title>bankbookSelect</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<h1>Bankbook Select Page</h1>
	<h3>NAME : ${DTO.bookName}</h3>
	<h3>NUMBER : ${DTO.bookNumber}</h3>

	<%-- <c:if test="${not empty member and member.id eq 'admin' }">
		<a href="./bankbookDelete?bookNumber=${DTO.bookNumber}">Delete</a>
		<a href="./bankbookUpdate?bookNumber=${DTO.bookNumber}">Update</a>
	</c:if> --%>

	<a href="../account/accountInsert?bookNumber=${DTO.bookNumber}">계좌개설</a>

	<c:catch>
		<c:if test="${member.id eq 'admin' }">
			<a href="./bankbookDelete?bookNumber=${DTO.bookNumber}">Delete</a>
			<a href="./bankbookUpdate?bookNumber=${DTO.bookNumber}">Update</a>
		</c:if>
	</c:catch>
</body>
</html>