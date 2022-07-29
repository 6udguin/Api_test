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
<h2>지역 검색 결과</h2>
<div style="margin: 15px;"></div>
	<c:forEach var ="localList" items ="${localList}" >
	<table>
	<tr>
	<td>카테고리</td>
	<td>${localList.category }</td>
	</tr>
	<tr>
	<td>이름</td>
	<td>${ localList.title }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ localList.link }">${ localList.link }</a></td>
	</tr>
	<tr>
	<td>요약</td>
	<td>${ localList.description }</td>
	</tr>
	<tr>
	<td>주소</td>
	<td>${ localList.address }</td>
	</tr>
	<tr>
	<td>도로명 주소</td>
	<td>${ localList.roadAddress }</td>
	</tr>
	<tr>
	<td>좌표</td>
	<td>x=${ localList.mapx }, y=${localList.mapy }</td>
	</tr>
	</table>
	<div style="margin: 15px;"></div>
	</c:forEach>
</body>
</html>