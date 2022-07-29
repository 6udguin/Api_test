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
<h2>부산 영도구 관광정보 검색</h2>
<form action="/Search/SearchBusanYD" id="form1" method="POST">
<select id="numOfRowsOption" name="numOfRows">
<option value="10">10</option>
<option value="20">20</option>
<option value="30">30</option>
<option value="40">40</option>
<option value="50">50</option>
</select>
<input type="text" id="title" name="title">

<input type="submit" value="검색">
</form>
</body>
</html>