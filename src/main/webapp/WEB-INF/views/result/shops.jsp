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
결과:[ShopVo [title=<b>스파이더</b> <b>스파이더</b> 유니섹스 테이핑 라인 반팔 티,
 link=https://search.shopping.naver.com/gate.nhn?id=32593354101,
  image=https://shopping-phinf.pstatic.net/main_3259335/32593354101.20220526095620.jpg,
   lprice=54500, hprice=0, mallName=네이버, productId=32593354101, productType=1,
    maker=, brand=스파이더, category1=패션의류, category2=남성의류, category3=티셔츠, category4=]
 -->
<h2>쇼핑 검색 결과</h2>
<div style="margin: 15px;"></div>
	<c:forEach var ="shopList" items ="${shopList}" >
	<table>
	<tr>
	<td>이름</td>
	<td>${ shopList.title }</td>
	</tr>
	<tr>
	<td>링크</td>
	<td><a href="${ shopList.link }">${ shopList.link }</a></td>
	</tr>
	<tr>
	<td>이미지</td>
	<td><img src="${ shopList.image }"></td>
	</tr>
	<tr>
	<td>최저가</td>
	<td>${ shopList.lprice }</td>
	</tr>
	<tr>
	<td>최대가</td>
	<td>${ shopList.hprice }</td>
	</tr>
	<tr>
	<td>판매처</td>
	<td>${ shopList.mallName }</td>
	</tr>
	<tr>
	<td>브랜드</td>
	<td>${shopList.brand }</td> 
	</tr>
	<tr>
	<td>분류</td>
	<td>${shopList.category1 } > ${shopList.category2 } > ${ shopList.category3 } > ${ shopList.category4 }</td>
	</tr>
	</table>
	<div style="margin: 15px;"></div>
	</c:forEach>
</body>
</html>