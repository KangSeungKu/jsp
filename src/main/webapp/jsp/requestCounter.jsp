<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>uri 통계자료</h2>
	<table>
		<thead>
			<tr>
				<th>uri</th>
				<th>method</th>
				<th>횟수</th>
			</tr>
		</thead>
		<%-- application scope 저장된 속성명 : requestCountMap --%>
		<tbody>
			<c:forEach items="${requestCountMap }" var="item">
				<tr>
					<td>${item.key }</td>
					<td>${item.value.method }</td>
					<td>${item.value.uriCount }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>