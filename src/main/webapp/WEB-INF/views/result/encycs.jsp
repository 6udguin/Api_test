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
결과:[EncycVo [title=<b>러시아</b>
, link=https://terms.naver.com/entry.naver?docId=1087456&cid=40942&categoryId=34079
, description= 극동에서 동부 유럽의 유라시아 대륙에 걸쳐 있는 나라이다. 9세기 루시에 국가 기원을 두며 1917년 <b>러시아</b>혁명이 일어날 때까지 대제국을 이루다 1922년 소비에트 사회주의 공화국... 
, thumbnail=http://openapi-dbscthumb.phinf.naver.net/2765_000_34/20180930212702178_SM7STQGAI.jpg/1394987.jpg?type=m160_160]
 -->
<h2>사전 검색 결과</h2>
<div style="margin: 15px;"></div>
	<c:forEach var ="encycList" items ="${encycList}" >
	<table>
	<tr>
	<td>이름</td>
	<td>${ encycList.title }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ encycList.link }">${ encycList.link }</a></td>
	</tr>
	<tr>
	<td>요약</td>
	<td>${ encycList.description }</td>
	</tr>
	<tr>
	<td>썸네일</td>
	<td><img src="${ encycList.thumbnail }"></td>
	</tr>
	</table>
	<div style="margin: 15px;"></div>
	</c:forEach>
</body>
</html>