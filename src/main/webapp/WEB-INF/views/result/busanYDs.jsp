<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h2>부산 영도구 관광정보 검색 결과</h2>
<div style="margin: 15px;"></div>
	<c:forEach var ="busanYDList" items ="${busanYDList}" >
	<table>
	<tr>
	<td>이름</td>
	<td>${ busanYDList.title }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ busanYDList.link }">${ busanYDList.link }</a></td>
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