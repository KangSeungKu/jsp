<%@page import="kr.or.ddit.user.service.UserService"%>
<%@page import="kr.or.ddit.user.service.IUserService"%>
<%@page import="kr.or.ddit.user.model.User"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.repository.UserDao"%>
<%@page import="kr.or.ddit.user.repository.IUserDao"%>
<%@ page language="java" contentType="application/vnd.ms-excel; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Content-Disposition", "attachment; filename=line.xls");
	IUserService userService = new UserService();
	List<User> userList = userService.getUserList();
%>
<table>
	<tr>
		<th>이름</th>
		<th>나이</th>
	</tr>
	<%
		for(User item : userList){
	%>
		<tr>
			<td><%=item.getUserNm() %></td>			<td>00세</td>
		</tr>
	<%} %>
</table>

</body>
</html>