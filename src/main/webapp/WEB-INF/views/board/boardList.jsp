<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
				<c:forEach items="${list }" var="DTO">
					<tr>
						<td>${DTO.num }</td>
						<td><a href="./${board}Select?num=${DTO.num }">
						<c:catch>
					<c:forEach begin="1" end="${DTO.depth }">--</c:forEach>
						</c:catch> ${DTO.title }
						</a></td>
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
		<a href="./${board }Insert" class="btn btn-dark" role="button">WRITE</a>

	</div>


	<div class="container">
		<ul class="pagination">
			<c:if test="${pager.pre }">
				<li class="page-item"><a class="page-link p" href="#" title="${pager.startNum-1 }">Previous</a></li>
			</c:if>
			<c:forEach begin="${pager.startNum }" end="${pager.lastNum }" var="i">
				<li class="page-item"><a class="page-link p" href="#" title="${i}">${i}</a></li>
			</c:forEach>
			<c:if test="${pager.next}">
				<li class="page-item"><a class="page-link p" href="#" title="${pager.lastNum+1}">Next</a></li>
			</c:if>
		</ul>
		<div class="input-group mt-3 mb-3">
			<form action="./${board}List" id="frm" class="form-inline">
				<input type="hidden" id="curPage" name="curPage" value="1">
				<div class="input-group-prepend">
					<select class="form-control" id="kind" name="kind">
						<option class="sel">title</option>
						<option class="sel">contents</option>
						<option class="sel">writer</option>
					</select>
				</div>
				<input type="text" class="form-control" id="search" value="${pager.search }" name="search">
				<div class="input-group-append">
					<button class="btn btn-success" type="submit">Search</button>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		let kind = '${pager.kind}';
		$(".sel").each(function() {
			let t = $(this).text();
			if (t == kind) {
				$(this).prop("selected", true);
			}
		});
		
		$(".p").click(function() {
			let curPage = $(this).attr("title");
			$("#curPage").attr("value", curPage);
			let search = '${pager.search}';

			$("#frm").submit();

			/* $("#curPage").attr("value", curPage);
			$("#kind").val(kind);
			$("#search").val(search);
			$("#frm").submit(); */

			//location.href="./${board }List?curPage="+curPage+"&kind=${pager.kind}&search=${pager.search}"; 

		});
	</script>
</body>
</html>