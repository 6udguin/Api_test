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
<!--  결과:[BookVo [title=해리 포터와 마법사의 돌 1 (해리포터 20주년 개정판), link=https://search.shopping.naver.com/book/catalog/32473349454, 
image=https://shopping-phinf.pstatic.net/main_3247334/32473349454.20220527085316.jpg, author=J.K. 롤링, price=0, discount=8100, publisher=문학수첩,
 isbn=9788983927620, pubdate=20191119, description=우리 시대에 가장 사랑받는 21세기의 고전 《해리포터》를 고전답게 재해석하다! -->
<h2>도서 검색 결과</h2>
	<div style="margin: 15px;"></div>
	<c:forEach var ="bookList" items ="${bookList}" >
	<table>
	<tr>
	<td>제목</td>
	<td>${ bookList.title }</td>
	</tr>
	<tr>
	<td>출간일</td>
	<td>${ bookList.pubdate }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ bookList.link } ">${ bookList.link }</a></td>
	</tr>
	<tr>
	<td>이미지</td>
	<td><img src="${ bookList.image }"></td>
	</tr>
	<tr>
	<td>저자</td>
	<td>${ bookList.author }</td>
	</tr>
	<tr>
	<td>정가</td>
	<td>${ bookList.price }</td>
	</tr>
	<tr>
	<td>할인가</td>
	<td>${ bookList.discount }</td>
	</tr>
	<tr>
	<td>출판사</td>
	<td>${ bookList.publisher }</td>
	</tr>
	<tr>
	<td>ISBN</td>
	<td>${ bookList.isbn }</td>
	</tr>
	<tr>
	<td>요약</td>
	<td>${ bookList.description }</td>
	</tr>
	</table>
	
	<div style="margin: 15px;"></div>
	</c:forEach>
</body>
</html>