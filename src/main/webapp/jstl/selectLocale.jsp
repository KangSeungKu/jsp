<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${cp }/js/jquery-3.4.1.min.js"></script>
<script>
	$(document).ready(function(){
		$("#locale").val("${lang }");
		
		$("#locale").change(function(){
			$("#frm").submit();
			//console.log($(this).val());
		});
	})
</script>
</head>
<body>
	<form id="frm" action="${cp }/selectLocale" method="get">
		<select id="locale" name="locale">
			<option value="ko">한국어</option>
			<option value="en">English</option>
			<option value="zh">中国语</option>
		</select>
		<!-- <input type="submit" value="전송"/> -->
	</form>
	
	<fmt:setLocale value="${lang }"/>
	<fmt:setBundle basename="kr.or.ddit.msg.message" var="msg"/>
	<fmt:message key="GREETING" bundle="${msg }"/>
</body>
</html>