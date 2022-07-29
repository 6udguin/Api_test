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
<h2>도서 검색창</h2>
<form action="/Search/SearchBook" id="form1" method="POST">
<select id="displayOption" name="display">
<option value="10">10</option>
<option value="20">20</option>
<option value="30">30</option>
</select>
<select id="sortOption" name="sort">
<option value="sim">유사도순</option>
<option value="date">출간일순</option>
<option value="count">판매량순</option>
</select>
<select id="searchOption" name="search">
<option value="all">전체 검색</option>
<option value="d_titl">제목 검색</option>
<option value="d_auth">저자명 검색</option>
<option value="d_cont">목차 검색</option>
<option value="d_isbn">isbn 검색</option>
</select>
<input type="text" id="keyword" name="keyword">

<input type="submit" value="검색">
</form>
</body>
</html>