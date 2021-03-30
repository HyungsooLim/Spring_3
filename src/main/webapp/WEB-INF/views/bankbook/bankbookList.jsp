<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<c:import url="../template/bootStrap.jsp"></c:import>
<title>bankbookList</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
		<h2 style="text-align: center; padding: 43px 0;">Bankbook List Page</h2>
		<table class="table">
			<thead class="thead-dark">
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
			<c:if test="${pager.pre }">
				<li class="page-item"><a class="page-link" href="./bankbookList?curPage=${pager.startNum-1 }&kind=${pager.kind}&search=${pager.search}">Previous</a></li>
			</c:if>
			<c:forEach begin="${pager.startNum }" end="${pager.lastNum }" var="i">
				<li class="page-item"><a class="page-link" href="./bankbookList?curPage=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
			</c:forEach>
			<c:if test="${pager.next }">
				<li class="page-item"><a class="page-link" href="./bankbookList?curPage=${pager.lastNum+1 }&kind=${pager.kind}&search=${pager.search}">Next</a></li>
			</c:if>
		</ul>
		<div class="input-group mt-3 mb-3">
			<form action="./bankbookList" class="form-inline">
				<div class="input-group-prepend">
					<select class="form-control" id="sel1" name="kind">
						<option>name</option>
						<option>rate</option>
						<option>sale</option>
					</select>
				</div>
				<input type="text" class="form-control" placeholder="" name="search">
				<div class="input-group-append">
					<button class="btn btn-success" type="submit">Search</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>