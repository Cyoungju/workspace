<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome home page</h1>
	<hr>
	<div>
		<p>반갑습니다.</p>
	</div>
	<!-- 이름 나이 서버로 데이터 전송 -->
	<form action="result" method="get">
		이름 : <input type="text" name="name"><br>
		나이 : <input type="text" name="age"><br><br>
		<input type="submit" value="작성완료">
	</form>
</body>
</html>