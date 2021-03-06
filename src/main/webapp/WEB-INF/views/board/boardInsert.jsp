<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#sample {
	display: none;
}
</style>
<c:import url="../template/bootStrap.jsp"></c:import>
<title>noticeInsert</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
		<form id="frm" action="./${board }Insert" method="post" enctype="multipart/form-data">
			<div class="form-row">
				<div class="col">
					Title <input type="text" id="title" class="form-control check" placeholder="Title" name="title">
				</div>
				<div class="col">
					Writer <input type="text" id="writer" class="form-control check" name="writer" value="${member.id }" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label for="contents">Contents</label>
				<textarea class="form-control check" id="contents" rows="20" name="contents"></textarea>
			</div>
			<input type="button" id="add" value="ADD" class="btn btn-primary">
			<input type="button" id="del" value="DELETE" class="btn btn-danger">
			<div id="files">
			
			</div>
			<input type="button" id="btn" value="WRITE" class="btn btn-dark">
		</form>
	</div>

	<div id="sample">
		<div class="input-group">
			<div class="custom-file">
				<input type="file" class="custom-file-input" id="inputGroupFile04" name="files" aria-describedby="inputGroupFileAddon04">
				<label class="custom-file-label" for="inputGroupFile04">Choose file</label>
			</div>
			<div class="input-group-append delete">
				<input class="btn btn-outline-secondary" value="DELETE" type="button" id="inputGroupFileAddon04">
			</div>
		</div>
	</div>

	<script type="text/javascript" src="../resources/jquery/boardInsert.js"></script>
	<script type="text/javascript" src="../resources/jquery/insertFile.js"></script>
</body>
</html>