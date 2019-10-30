<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Detail Page</title>
</head>
<body>
	<h3>Detail Page</h3>

	<p>Session id: ${sessionScope.sid}</p>
	<table cellpadding="2" cellspacing="2" border="0">
		<tr>
			<td>${product.id }</td>
			<td>${product.name }</td>
			<td>${product.price }</td>
			<td>${quantity }</td>
		</tr>
	</table>

	<td align="center"><a
		href="${pageContext.request.contextPath }/cart/buy/${product.id}">Add
			to Cart</a></td>
	<br>
	<br>
	<div></div>
	<p>
		<a href="${pageContext.request.contextPath }/product">Continue
			shopping</a>
	</p>
	</div>
</body>
</html>