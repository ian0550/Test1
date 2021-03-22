<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세션 결과</h1>
	세션ID : <%=session.getId() %><br>
	ID : <%=session.getAttribute("id") %><br>
	<h2>세션 종료</h2>
	<% session.invalidate(); %>
	<a href="sessionForm.jsp">로그아웃</a>
</body>
</html>