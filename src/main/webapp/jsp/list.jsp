<%@page import="kr.or.ddit.user.service.UserService"%>
<%@page import="kr.or.ddit.user.service.IUserService"%>
<%@page import="kr.or.ddit.user.repository.IUserDao"%>
<%@page import="kr.or.ddit.user.model.User"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.repository.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!IUserService userService = new UserService();
	List<User> userList = userService.getUserList();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	@import url('https://fonts.googleapis.com/css?family=Gugi&display=swap');
	
	table{
		font-family: 'Gugi', cursive;
		margin: 160px auto;
	}
	
	th {
		background: #3e3e3e;
		color: white;
		padding: 10px;
		font-size: 1.2em;
	}
	
	td {
		text-align: center;
		padding: 20px 40px;
		border: 1px solid #3e3e3e;
		border-width: 0px 0px 1px 0px; 
	}
	
	td:hover {
		color: white;
		background: #3e3e3e;
	}
</style>
</head>
<body>
	<%-- 1. userdao 선언
		 2. getUserList() 호출
		 3. 호출 결과(List<UserVo>)를 for loop를 통해 tr태그를 반복 생성
	 --%>
	<table>
		<tr>
			<th>이름</th>
		</tr>
		<%
			for(User item : userList) {
		%>
			<tr>
				<td><%=item.getUserNm() %></td>
			</tr>
		<%} %>
	</table>
</body>
</html>