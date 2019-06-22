<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
</head>

<script type="text/javascript">
var  url="/list?";



</script>

<body>



<div  class="container">
  <div>
   按规模: <a href="/list?minMoney=10000&maxMoney=2000000&tid=${tid}">小型企业</a> &nbsp; 
    <a href="/list?minMoney=2000001&maxMoney=10000000&tid=${tid}">中小型企业</a>&nbsp; 
       <a href="/list?minMoney=10000001&maxMoney=2000000000&tid=${tid}">大型企业</a>&nbsp;
        <a href="/list?tid=${tid}">全部企业</a>
    <br>
  按类型:   <a href="/list?minMoney=${minMoney }&maxMoney=${maxMoney}&tid=1">有限公司</a> &nbsp;  <a href="/list?minMoney=${minMoney }&maxMoney=${maxMoney}&tid=2">股份公司</a>&nbsp;
   <a href="/list?minMoney=${minMoney }&maxMoney=${maxMoney}&tid=4">国企</a>&nbsp;
   <a href="/list?minMoney=${minMoney }&maxMoney=${maxMoney}&tid=99">其它</a>&nbsp; 
   <a href="/list?minMoney=${minMoney }&maxMoney=${maxMoney}">全部</a>
    <br>
  
  </div>


	<table class="table table-bordered">
		<thead>
			<tr>
				<th>序号</th>
				<th>公司名称</th>
				<th>注册资金</th>
				<th>法人</th>
				<th>注册日期</th>
				<th>公司类型</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${list }" var="c" varStatus="i">
				<tr>
					<td>${i.index+1 }</td>
					<td>${c.cname }</td>
					<td>${c.money }</td>
					<td>${c.person }</td>
					<td>${c.created}</td>
					<td>${c.tname }</td>
				</tr>
			</c:forEach>
			
			<tr>
			<td colspan="8">${info }</td>
			</tr>
		</tbody>
	</table>
	</div>
 <script type="text/javascript">
 $(function(){
	 $(".page-link").click(function(){
		 
		 var url =$(this).attr("data");
		 
		 location.href=url;
		 
		 
	 })
	 
	 
 })
 
 
 </script>
</body>
</html>