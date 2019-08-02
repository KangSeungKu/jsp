<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>두 개의 숫자를 입력받아 곱 구하기</h2>
	<form action="<%=request.getContextPath() %>/jsp/mul.jsp" method="get">
		첫 번째 숫자 : <input type="text" name="number" value="5"/><br>
		두 번째 숫자 : <input type="text" name="number2" value="10"/><br>
		<br>
		<input type="submit" value="결과"/>
	</form>
</body>
</html>