<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container">
<h1>${board } Select Page</h1>
<h3>Title : ${DTO.title }</h3>
<h3>Writer : ${DTO.writer }</h3>
<h3>Contents : ${DTO.contents }</h3>

</div>
</body>
</html>