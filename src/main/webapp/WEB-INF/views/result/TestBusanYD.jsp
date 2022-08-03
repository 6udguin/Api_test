<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   * {  box-sizing: border-box; 
      padding:0; margin:0;
   }
   table, th, td {
      border:1px solid black;
      border-collapse: collapse;
   }
   table { width:1000px; margin : 30px; }
   td    { padding:10px; }
   
   td:nth-of-type(1) {  width:100px; text-align :center; }
   td:nth-of-type(2) {  width:400px; }
   td:nth-of-type(3) {  width:100px; text-align :center; }
   td:nth-of-type(4) {  width:400px; }
   
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>

 
    function displayObj( xmlDoc ){
    	let html = '';
    	
    	var itemlist = xmlDoc.querySelectorAll('item');
    	Array.from( itemlist ).forEach( function( item, index ) {
    		   var  name      = item.querySelector('name').innerHTML;
    		
    		   var  idx       = $(item).find('idx').html();
    		   var  address   = $(item).find('address').html();
    		   var  homepage  = $(item).find('homepage').html();
    		   var  content   = $(item).find('content').html(); 
    		   var  map       = $(item).find('map').html();
    		   var  usehour   = $(item).find('usehour').html();
    		   var  fee       = $(item).find('fee').html();
    		   var  xposition = $(item).find('xposition').html();
    		 
    		   var  yposition = $(item).find('yposition').html();
    		 
    		   
    		   
    		   html += '<table>';
			 
			   html += '<tr>';
			   html += '<td>이름</td>';
			  // html += `<td>${ name }</td>`;
			   html += '<td>'+ name +'</td>'
			   html += '<td>번호</td>';
			   html += '<td>'+ idx + '</td>';
			   html += '</tr>';
			   
			   html += '<tr>';
			   html += '<td>주소</td>';
			   html += '<td colspan="3">' + address + '</td>';
			   html += '</tr>';
			   
			   html += '<tr>';
			   html += '<td>homepage</td>';
			   html += '<td colspan="3"><a href=' + homepage + '>${ homepage }<a/></td>';
			   html += '</tr>';
			   
			   html += '<tr>';
			   html += '<td>content</td>';
			   html += '<td colspan="3">' +  content + '</td>';
			   html += '</tr>';
			   
			   html += '<tr>';
			   html += '<td>map</td>';
			   html += '<td colspan="3">' +  map + '</td>';
			   html += '</tr>';
			   
			   html += '<tr>';
			   html += '<td>usehour</td>';
			   html += '<td colspan="3">' +  usehour + '</td>';
			   html += '</tr>';
			   
			   html += '<tr>';
			   html += '<td>fee</td>';
			   html += '<td colspan="3">' +  fee + '</td>';
			   html += '</tr>';
			   
			   html += '<tr>';
			   html += '<td>xposition</td>';
			   html += '<td>' + xposition + '</td>';
			   html += '<td>yposition</td>';
			   html += '<td>' + yposition + '</td>';
			   html += '</tr>';
			 
			   html += '</table>';
    	});
    	alert('err test1');	
    	console.log(html);
    	return html;
    	alert('err test2');	
    }
   
     window.onload = function() {
    	
    	 var btnGet = document.querySelector('#btnGet');
    	 btnGet.addEventListener('click', function() {
    		 alert('click');
    		 var    parms  = {
			   numOfRows :  $('#numOfRows>option:selected').val(),
			   pageNo    :  $('#pageNo').val(),
			   addr      : '',
			   title     : ''
			 };
    		 var url = 'http://localhost:9092/tourlist';
    		 fetch(url, {
    			 method  : 'POST',
    			 headers : {
    				 'content-type':'application/x-www-form-urlencode;charset=UTF-8'
    			 } ,
    			 body :  new URLSearchParams( parms )   			 
    		 })
    		  .then(response => response.text() )  
    		  .then(result   => new DOMParser().parseFromString(result, "text/xml") )
    		  .then(xmlDoc   => {
    			  console.log(xmlDoc);
    			  let html           = displayObj( xmlDoc );
    			  var tourlist       = document.getElementById('tourlist');
    			  tourlist.innerHTML = html;
    		  } )
    		  
    	 });
     }


</script>
</head>
<body>페이지<input type="number" id="pageNo" value="1" min="1" />
   <button id="btnGet">영도구 관광 정보</button>   
   <select id="numOfRows">
     <option value="10">10</option>
     <option value="10">20</option>
     <option value="30">30</option>
     <option value="40">40</option>
     <option value="50">50</option>
   </select>
   <hr>
   <div id="tourlist"></div>
</body>
</html>