<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootStrap.jsp"></c:import>
<title>memberJoinCheck</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container">
		<h1>Member Join Check Page</h1>
		<div class="form-check">
			<label class="form-check-label"> 
				<input type="checkbox" class="form-check-input" value="" id="all">전체동의
			</label>
		</div>
		<div class="form-check">
			<label class="form-check-label"> 
				<input type="checkbox" class="form-check-input c1" value="">동의
			</label>
		</div>
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>
		
		<div class="form-check">
			<label class="form-check-label"> 
				<input type="checkbox" class="form-check-input c1" value="">동의
			</label>
		</div>
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>
		
		<div class="form-check">
			<label class="form-check-label"> 
				<input type="checkbox" class="form-check-input c1" value="">동의
			</label>
		</div>
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>
		
		<div class="form-check">
			<label class="form-check-label"> 
				<input type="checkbox" class="form-check-input c1" value="">동의
			</label>
		</div>
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>
		
		<button class="btn btn-danger" onclick="check()">JOIN</button>
	</div>
	<script type="text/javascript" src="../resources/js/memberJoinCheck.js"></script>
</body>
</html>