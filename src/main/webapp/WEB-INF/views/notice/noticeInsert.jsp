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
<title>noticeInsert</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<form
		action="./noticeInsert"
		method="post"
	>
		<div class="form-row">
			<div class="col">
				Title <input
					type="text"
					class="form-control"
					placeholder="Title"
					name="title"
				>
			</div>
			<div class="col">
				Writer <input
					type="text"
					class="form-control"
					placeholder="writer"
					name="writer"
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
		<button
			type="submit"
			class="btn btn-dark"
		>Submit</button>
	</form>
</body>
</html>