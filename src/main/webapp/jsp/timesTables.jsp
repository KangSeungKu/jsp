<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 스크립틀릿, 표현식 --> jstl, el --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse: collapse;
	}
	
	td {
		padding: 10px;
	}
</style>
</head>
<body>
	<table border=1>
		<c:forEach begin="2" end="9" var="i">
			<tr>
				<c:forEach begin="1" end="9" var="j">
					<td>${i } X ${j } = ${i*j }</td>
				</c:forEach>
			</tr>
		</c:forEach>
		<%-- <%for(int i = 2; i <= 9; i++){%>
			<tr>
				<%for(int j = 1; j <= 9; j++){%>
					<td><%=i%> X <%=j%> = <%=i*j%></td>
				<%}%>
			</tr>
			<%}%> --%>
	</table>
</body>
</html>