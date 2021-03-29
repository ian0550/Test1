<%@page import="com.ian.web.dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="productDAO" class="com.ian.web.dao.ProductRepo" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>제품 목록</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">제품 리스트</h1>
		</div>
	</div>
	<%
	ArrayList<Product> list = productDAO.getAllProduct();
	%>
	<div class="container">
		<div class="row" align="center">
			<%
			for (int i=0; i<list.size(); i++){
				Product product = list.get(i);
			%>
			<div class="col-md-4">
				<h3><%=product.getPname() %></h3>
				<h3><%=product.getDescription() %></h3>
				<h3><%=product.getUnitPrice() %></h3>
				<p><a href="product.jsp?id=<%=product.getProductId() %>"
				class="btn btn-secondary" role="button">상세 정보 &raquo;</a>
			</div>
			<% } %>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>