<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>메뉴 검색 </h1>
		<form method="post" action="/lesson02/quiz07_1.jsp">
			<div class="d-flex align-items-center">
				<input type="text" class="form-control col-3 mr-3" name="keyword">
				<label class="m-0">
				<input type="checkbox" name="starPointFilter" value="true"> 4점 이하 제외 
				</label>
			</div>
			
			<input type="submit" class="btn btn-success mt-3" value="검색">
			
			
			
		</form>
	
	
	</div>

</body>
</html>