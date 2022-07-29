<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
		
		$(document).ready(function(){
			var keywordEl = document.getElementById('keyword');
			
			var submit = document.getElementById('form1');
			
			$(submit).submit(function(){
				
				var keyword = keywordEl.value.trim();
				
				if( keyword == "" ){
					alert('한 글자 이상 입력');
					return false;
				}
				
			})
			
		})
		
</script>
</head>
<body>
<form action="/Search/SearchMovie" id="form1" method="POST">
<select id="displayOption" name="display">
<option value="10">10</option>
<option value="20">20</option>
<option value="30">30</option>
</select>
<select id="genreOption" name="genre">
<option value="all">전체</option>
<option value="1">드라마</option>
<option value="2">판타지</option>
<option value="3">서부</option>
<option value="4">공포</option>
<option value="5">로맨스</option>
<option value="6">모험</option>
<option value="7">스릴러</option>
<option value="8">느와르</option>
<option value="9">컬트</option>
<option value="10">다큐멘터리</option>
<option value="11">코미디</option>
<option value="12">가족</option>
<option value="13">미스터리</option>
<option value="14">전쟁</option>
<option value="15">애니메이션</option>
<option value="16">범죄</option>
<option value="17">뮤지컬</option>
<option value="18">SF</option>
<option value="19">액션</option>
<option value="20">무협</option>
<option value="21">에로</option>
<option value="22">서스펜스</option>
<option value="23">서사</option>
<option value="24">블랙코미디</option>
<option value="25">실험</option>
<option value="26">영화카툰</option>
<option value="27">영화음악</option>
<option value="28">영화패러디포스터</option>
</select>
<select id="countryOption" name="country">
<option value="all">전체</option>
<option value="KR">한국</option>
<option value="JP">일본</option>
<option value="US">미국</option>
<option value="HK">홍콩</option>
<option value="GB">영국</option>
<option value="FR">프랑스</option>
<option value="ETC">기타</option>
</select>
<input type="text" maxlength="4" id="yearfrom" name="yearfrom">~
<input type="text" maxlength="4" id="yearto" name="yearto">
<input type="text" id="keyword" name="keyword">

<input type="submit" value="검색">
</form>
</body>
</html>