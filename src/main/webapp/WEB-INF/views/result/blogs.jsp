<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/common.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<!-- 
결과:[BlogVo [title=브링백 <b>스파이더</b> 앰플로 안티에이징 해요! 피부탄력... ,
 link=https://blog.naver.com/diecruel?Redirect=Log&logNo=222773336541, 
 description=브링백(Bring Back)의 <b>스파이더</b> 앰플을 사용해봤어요. 제가 정말.. 별별 추출물(?)을 겪어봤다 생각했는데 거미독에서 추출한 유효성분과 활성 EGF를 결합한 건 처음! 독자 개발한 <b>스파이더</b> 베놈 성분이 건조하고... ,
  bloggername=물오른 청순 라이프, 
  bloggerlink=https://blog.naver.com/diecruel, 
  postdate-20220615],

 -->
<h2>블로그 검색 결과</h2>
<div style="margin: 15px;"></div>
	<c:forEach var ="blogList" items ="${blogList}" >
	<table>
	<tr>
	<td>이름</td>
	<td>${ blogList.title }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ blogList.link }">${ blogList.link }</a></td>
	</tr>
	<tr>
	<td>요약</td>
	<td>${ blogList.description }</td>
	</tr>
	<tr>
	<td>블로그 이름</td>
	<td>${ blogList.bloggername }</td>
	</tr>
	<tr>
	<td>블로그 링크</td>
	<td><a href="${ blogList.bloggerlink }">${ blogList.bloggerlink }</a></td>
	</tr>
	<tr>
	<td>작성일</td>
	<td>${ blogList.postdate }</td>
	</tr>
	</table>
	<div style="margin: 15px;"></div>
	</c:forEach>
</body>
</html>