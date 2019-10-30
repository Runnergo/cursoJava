<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>



<head>
<title>Product Page</title>
</head>
<body>

	<h3>Products Page</h3>
	<p>Session id: ${sessionScope.sid}</p>



	<table cellpadding="2" cellspacing="2" border="0">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Details</th>
			<th>Option</th>
			<th>BarCode</th>
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td>${product.price }</td>
				<td align="center"><a
					href="${pageContext.request.contextPath }/product/detail/${product.id}">Details</a>
				</td>
				<td align="center"><a
					href="${pageContext.request.contextPath }/cart/buy/${product.id}">Add
						to Cart</a></td>
				<td><img
					src="${pageContext.request.contextPath }/product/barcode/${product.id}"
					width="200" height="50"></td>
			</tr>
		</c:forEach>
	</table>



	<br>
	<br>
	<a href="${pageContext.request.contextPath }/">Home</a>
</body>
</html>