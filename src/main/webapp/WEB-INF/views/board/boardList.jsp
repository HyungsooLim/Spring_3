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
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
		<h2 style="text-align: center; padding: 43px 0;">${board }</h2>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">NO</th>
					<th scope="col">SUBJECT</th>
					<th scope="col">NAME</th>
					<th scope="col">DATE</th>
					<th scope="col">HIT</th>
				</tr>
			</thead>
			<tbody>
				<!-- 반복문 시작 -->
				<c:forEach
					items="${list }"
					var="DTO"
				>
					<tr>
						<td>${DTO.num }</td>
						<td><a href="./${board}Select?num=${DTO.num }">${DTO.title }</a></td>
						<td>${DTO.writer }</td>
						<td>${DTO.regDate }</td>
						<td>${DTO.hit }</td>
					</tr>
				</c:forEach>
				<!-- 반복문 끝 -->
			</tbody>
		</table>
	</div>
	<div>
		<a
			href="./${board }Insert"
			class="btn btn-dark"
			role="button"
		>WRITE</a>

	</div>

	<!-- 
	<div class="container">
		<ul class="pagination">
			<c:if test="${pager.pre }">
				<li class="page-item"><a
					class="page-link"
					href="./noticeList?curPage=${pager.startNum-1 }&kind=${pager.kind}&search=${pager.search}"
				>Previous</a></li>
			</c:if>
			<c:forEach
				begin="${pager.startNum }"
				end="${pager.lastNum }"
				var="i"
			>
				<li class="page-item"><a
					class="page-link"
					href="./noticeList?curPage=${i}&kind=${pager.kind}&search=${pager.search}"
				>${i}</a></li>
			</c:forEach>
			<c:if test="${pager.next }">
				<li class="page-item"><a
					class="page-link"
					href="./noticeList?curPage=${pager.lastNum+1 }&kind=${pager.kind}&search=${pager.search}"
				>Next</a></li>
			</c:if>
		</ul>
		<div class="input-group mt-3 mb-3">
			<form
				action="./noticeList"
				class="form-inline"
			>
				<div class="input-group-prepend">
					<select
						class="form-control"
						id="sel1"
						name="kind"
					>
						<option>title</option>
						<option>contents</option>
						<option>writer</option>
					</select>
				</div>
				<input
					type="text"
					class="form-control"
					placeholder=""
					name="search"
				>
				<div class="input-group-append">
					<button
						class="btn btn-success"
						type="submit"
					>Search</button>
				</div>
			</form>
		</div>
		-->

</body>
</html>