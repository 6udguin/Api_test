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
<h2>블로그 검색</h2>
<form action="/Search/SearchBlog" id="form1" method="POST">
<select id="displayOption" name="display">
<option value="10">10</option>
<option value="20">20</option>
<option value="30">30</option>
</select>
<select id="sortOption" name="sort">
<option value="sim">유사도순</option>
<option value="date">날짜순</option>
</select>

<input type="text" id="keyword" name="keyword">

<input type="submit" value="검색">
</form>
</body>
</html>