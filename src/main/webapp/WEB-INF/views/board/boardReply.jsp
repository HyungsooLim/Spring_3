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
<title>boardReply</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
	<h2>${board } Reply form</h2>
		<form
			id="frm"
			action="./${board }Reply"
			method="post"
		>
			<div class="form-row">
				<div class="col">
				<input type="hidden" name="num" value="${param.num }">
					Title <input
						type="text"
						id="title"
						class="form-control check"
						placeholder="Title"
						name="title"
					>
				</div>
				<div class="col">
					Writer <input
						type="text"
						id="writer"
						class="form-control check"
						name="writer"
						value="${member.id }"
						readonly="readonly"
					>
				</div>
			</div>
			<div class="form-group">
				<label for="exampleContents">Contents</label>
				<textarea
					class="form-control"
					id="exampleContents"
					rows="20"
					name="contents"
				></textarea>
			</div>
			<input
				id="btn"
				type="submit"
				value="write"
				class="btn btn-dark"
			>
		</form>
	</div>
	<!-- <script
		type="text/javascript"
		src="../resources/js/insertCheck.js"
	></script> -->
</body>
</html>