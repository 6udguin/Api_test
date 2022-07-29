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
<h2>웹문서 검색 결과</h2>
<div style="margin: 15px;"></div>
	<c:forEach var ="webkrList" items ="${webkrList}" >
	<table>
	<tr>
	<td>이름</td>
	<td>${ webkrList.title }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ webkrList.link }">${ webkrList.link }</a></td>
	</tr>
	<tr>
	<td>요약</td>
	<td>${ webkrList.description }</td>
	</tr>
	</table>
	<div style="margin: 15px;"></div>
	</c:forEach>
</body>
</html>