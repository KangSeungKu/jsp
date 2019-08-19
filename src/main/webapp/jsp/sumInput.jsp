<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>start값 ~ end값까지 더하기</h2>
<form action="${cp }/sumCalculation" method="post">
start : <input type="text" name="startParam" value="1" required/><br>
end : <input type="text" name="endParam" value="10" required/><br>
<input type="submit" value="결과">
</form>
</body>
</html>