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
<title>noticeUpdate</title>
</head>
<body>
	<c:import url="../template/header.jsp]"></c:import>
	<form
		action="./noticeUpdate"
		method="post"
	>
		<div class="form-row">
			<div class="col">
			<input type="text" name="num" value="${DTO.num }" hidden="">
				Title <input
					type="text"
					class="form-control"
					name="title"
					value="${DTO.title }"
				>
			</div>
			<div class="col">
				Writer <input
					type="text"
					class="form-control"
					name="writer"
					value="${DTO.writer }"
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
			>${DTO.contents }</textarea>
		</div>
		<button
			type="submit"
			class="btn btn-dark"
		>Submit</button>
	</form>
</body>
</html>