<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bankbookList</title>
</head>
<body>
	<h1>Bankbook List Page</h1>
	<table>
		<thead>
			<tr>
				<th>NAME</th>
				<th>RATE</th>
				<th>SALE</th>
			</tr>
		</thead>
		<tbody>
			<!-- 반복문 시작 -->
			<c:forEach items="${list}" var="DTO">
				<tr>
					<td><a href="./bankbookSelect?bookName=${DTO.bookNumber }">${DTO.bookName}</a></td>
					<td>${DTO.bookRate}</td>
					<td>${DTO.bookSale}</td>
				</tr>
			</c:forEach>
			<!-- 반복문 끝 -->
		</tbody>
	</table>
</body>
</html>