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
<c:import url="../template/bootStrap.jsp"></c:import>
<title>bankbookList</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
	<h2>Bankbook List Page</h2>
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th>NAME</th>
					<th>RATE</th>
					<th>SALE</th>
				</tr>
			</thead>
			<tbody>
				<!-- 반복문 시작 -->
				<c:forEach
					items="${list}"
					var="DTO"
				>
					<tr>
						<td><a href="./bankbookSelect?bookNumber=${DTO.bookNumber }">${DTO.bookName}</a></td>
						<td>${DTO.bookRate}</td>
						<td>${DTO.bookSale}</td>
					</tr>
				</c:forEach>
				<!-- 반복문 끝 -->
			</tbody>
		</table>
	</div>
	<div class="container">
		<ul class="pagination">
			<li class="page-item"><a class="page-link" href="#">Previous</a></li>
			<c:forEach begin="${pager.startNum }" end="${pager.lastNum }" var="i">
				<li class="page-item"><a class="page-link" href="./bankbookList?curPage=${i}">${i}</a></li>
			</c:forEach>
			<li class="page-item"><a class="page-link" href="#">Next</a></li>
		</ul>
	</div>
</body>
</html>