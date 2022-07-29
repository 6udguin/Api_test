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
<h2>뉴스 검색 결과</h2>
	<div style="margin: 15px;"></div>
	<c:forEach var ="newsList" items ="${newsList}" >
	<table>
	<tr>
	<td>제목</td>
	<td>${ newsList.title }</td>
	</tr>
	<tr>
	<td>제공 언론사 link</td>
	<td><a href="${ newsList.originallink }">${ newsList.originallink }</a></td>
	</tr>
	<tr>
	<td>네이버 link</td>
	<td><a href="${ newsList.link } ">${ newsList.link }</a></td>
	</tr>
	<tr>
	<td>요약</td>
	<td>${ newsList.description }</td>
	</tr>
	</table>
	
	<div style="margin: 15px;"></div>
	</c:forEach>
</body>
</html>