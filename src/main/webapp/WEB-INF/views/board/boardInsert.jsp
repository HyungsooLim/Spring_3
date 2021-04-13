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
<!-- summernote  -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
<!-- summernote  -->
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
			
			<div id="files" title="0"></div>
			
			<input type="button" id="btn" value="WRITE" class="btn btn-dark">
		</form>
	</div>

	<div id="sample">
		<div class="input-group">
			<div class="custom-file">
				<input type="file" id="inputGroupFile04" class="form-control-file border" name="files">
			</div>
			<div class="input-group-append delete">
				<input class="btn btn-outline-secondary" type="button" id="inputGroupFileAddon04" value="Delete">
			</div>
		</div>
	</div>

	<script type="text/javascript" src="../resources/jquery/boardInsert.js"></script>
	<script type="text/javascript" src="../resources/jquery/insertFile.js"></script>
	<script type="text/javascript" src="../resources/jquery/summerFile.js"></script>
</body>
</html>