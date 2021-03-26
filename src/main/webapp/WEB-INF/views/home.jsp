<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<c:import url="./template/bootStrap.jsp"></c:import>
<title>home</title>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>
	<h1>Home Page</h1>
	<!-- 
	기능
		글 리스트 - 누구나 접근 가능 -> 로그인 X 여도 보여주기
		상세보기 - 글 리스트에서 제목 클릭 - 누구나 접근 가능
		글 수정 - 상세보기 안에 수정 버튼 - 관리자만 접근
		글 삭제 - 상세보기 안에 삭제 버튼 - 관리자만 접근
		글 작성 - 글 리스트에서 작성 버튼 - 관리자만 접근
	
	Back-end
		noticeMapper
		
		package : com.hs.s3.notice
		NoticeDAO
			- getList : 글 리스트
			- getSelect : 상세보기
			- setInsert : 글 작성
			- setDelete : 글 삭제
			- setUpdate : 글 수정
			- setHitUpdate : 조회수 1증가
		NoticeService
			- getList : 글 리스트
			- getSelect : 상세보기 + setHitUpdate
			- setInsert : 글 작성
			- setDelete : 글 삭제
			- setUpdate : 글 수정
		NoticeController
			- getList : 글 리스트
			- getSelect : 상세보기
			- setInsert : 글 작성 - get/post
			- setDelete : 글 삭제
			- setUpdate : 글 수정 - get/post
		NoticeDTO
	
	Front-end
		- /WEB-INF/views/notice/
		
		글 리스트
		/notice/noticeList : GET -> noticeList.jsp
		글 상세보기
		/notice/noticeSelect : GET -> noticeSelect.jsp
		글 작성
		/notice/noticeInsert : GET -> noticeInsert.jsp
		/notice/noticeInsert : POST -> noticeList.jsp
		글 수정
		/notice/noticeUpdate : GET -> noticeUpdate.jsp
		/notice/noticeUpdate : POST -> noticeList.jsp
		글 삭제
		/notice/noticeDelete : GET -> noticeList.jsp
		
	 -->
</body>
</html>