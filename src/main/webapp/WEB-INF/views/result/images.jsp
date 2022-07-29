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
결과:[ImageVo [title=양구군, 해안면 고랭지 감자 피해 조사 나서,
 link=http://imgnews.naver.net/image/5477/2022/07/07/0000036128_001_20220707165611245..jpg,
  thumbnail=https://search.pstatic.net/common/?src=http://imgnews.naver.net/image/5477/2022/07/07/0000036128_001_20220707165611245..jpg&type=b150, 
  sizeheight=1080, sizewidth=1920],
 -->
<h2>Image 검색 결과</h2>
	<div style="margin: 15px;"></div>
	<c:forEach var ="imageList" items ="${imageList}" >
	<table>
	<tr>
	<td>제목</td>
	<td>${ imageList.title }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ imageList.link }">${ imageList.link }</a></td>
	</tr>
	<tr>
	<td>썸네일</td>
	<td><img src="${ imageList.thumbnail } "></td>
	</tr>
	<tr>
	<td>가로 x 세로</td>
	<td>${ imageList.sizewidth } x ${ imageList.sizeheight }</td>
	</tr>
	
	</table>
	
	<div style="margin: 15px;"></div>
	</c:forEach>
</body>
</html>