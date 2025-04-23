<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile.jsp</title>
</head>
<body>
	<%@ page import="com.ucode.model.User" %>

	<%
		User user = (User) session.getAttribute("session");
	%>
	
	<h2> Welcome </h2>
	
	<h3> Name : <%= user.getName() %></h3>
	<h3> Eamil : <%= user.getEmail() %></h3>
	<h3> City : <%= user.getCity() %></h3>
	
	<a href="Logout"> Logout </a>
	
</body>
</html>