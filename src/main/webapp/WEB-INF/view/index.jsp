<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@page import="com.biswajeet.websessiondemo.service.UserInfo"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	UserInfo userInfo = (UserInfo)session.getAttribute("userInfo");

%>
<body>
<h1>Hello World</h1>
<p><%= userInfo %> </p>
</body>
</html>