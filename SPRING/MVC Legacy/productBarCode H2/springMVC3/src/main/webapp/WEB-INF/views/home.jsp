
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>
	<p align="center">Session id: ${sessionScope.sid}</p>
	<p align="center">The time on the server is ${serverTime}.</p>
	<Br>
	<Br>
	<Br>
	<Br>
	<div align="center" style="color: blue">${msg}</div>

	<table align="center">
		<tr>
			<td><a href="product">List of products</a></td>
			<td><a href="cart/index">My cart</a></td>
			<td><a href="pay/show">My Pay</a></td>
		</tr>
	</table>
	</div>
</body>
</html>

