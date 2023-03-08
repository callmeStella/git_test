<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장보기 목록</title>
</head>
<body>

	<div class="container">
		<h1 class="text-center">장보기 목록 </h1>
		<table class="table text-center">
			<thead>
				<tr>
					<th>번호</th>
					<th>품목</th>
				</tr>
			</thead>
			<tbody>
			<%
				List<String> goodsList = Arrays.asList(new String[]{ 
					    "저지방 우유", "요플레 4개", "딸기 1팩", "삼겹살 300g", "생수 6개", "주방 세제"
				});
			
				for (int i = 0; i < goodsList.size(); i++) {
			%>
				<tr>
					<td><%= i+1 %></td>
					<td><%= goodsList.get(i) %></td>
				</tr>
			<%
				}
			%>
			
			</tbody>

		
		</table>
	
	
	
	
	
	</div>

%>

	
	
				

</body>
</html>