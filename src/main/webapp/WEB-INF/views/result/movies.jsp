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
<h2>영화검색결과</h2>
	<c:forEach var ="movieList" items ="${movieList}" >
	<div style="margin: 15px;"></div>
	<table>
	<tr>
	<td>제목</td>
	<td>${ movieList.title }</td>
	</tr>
	<tr>
	<td>원제목</td>
	<td>${ movieList.subtitle }</td>
	</tr>
	<tr>
	<td>개봉일</td>
	<td>${ movieList.pubDate }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ movieList.link } ">${ movieList.link }</a></td>
	</tr>
	<tr>
	<td>이미지</td>
	<td><img src="${ movieList.image }"></td>
	</tr>
	<tr>
	<td>감독</td>
	<td>${ movieList.director }</td>
	</tr>
	<tr>
	<td>배우</td>
	<td>${ movieList.actor }</td>
	</tr>
	<tr>
	<td>유저평점</td>
	<td>${ movieList.userRating }</td>
	</tr>
	</table>
	
	<div style="margin: 15px;"></div>
	</c:forEach>
	
</body>
</html>