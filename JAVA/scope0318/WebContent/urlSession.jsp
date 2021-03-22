<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
if(id.equals("")){
	out.println("<script>alert('ID를 입력하세요')</script>");
	response.sendRedirect("sessionForm.jsp");
}
session.setAttribute("id", id);
String url = response.encodeUrl("sessionRes.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	세션ID : <%=session.getId() %><br>
	ID : <%=session.getAttribute("id") %>
	<a href="<%=url %>">Test1</a><br>
	<a href="sessionRes.jsp">Test2</a>
</body>
</html>