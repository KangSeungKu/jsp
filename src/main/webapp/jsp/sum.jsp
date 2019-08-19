<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>두 숫자 사이의 모든 숫자의 합을 구하는 JSP</h2>
	<h3>- 두개의 숫자를 입력하시오.</h3>
	<form action="${cp }/jsp/sumResult.jsp" method="get">
		첫번째 숫자 : <input type="text" name="num1" value="1"><br>
		두번째 숫자 : <input type="text" name="num2" value="10"><br>
		<br>
		<input type="submit" value="결과"/>
	</form>
</body>
</html>