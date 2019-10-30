<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Pay Page</title>
</head>
<body>
	<h3>Pay Page</h3>

	<p>Session id: ${sessionScope.sid}</p>
	<table cellpadding="2" cellspacing="2" border="0">
		<tr>
			
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>SubTotal</th>
		</tr>
		<c:set var="total" value="0"></c:set>
		<c:forEach var="item" items="${sessionScope.cart }">
			<c:set var="total"
				value="${total + item.product.price * item.quantity }"></c:set>
			<tr>
				<td>${item.product.id }</td>
				<td>${item.product.name }</td>
				<td>${item.product.price }</td>
				<td>${item.quantity }</td>
				<td>${item.product.price * item.quantity }</td>
			</tr>
		</c:forEach>
		<tr>
			<c:if test="${total > 0}">
				<td colspan="6" align="right">Sum</td>
				<td>${total }</td>
			</c:if>
			<c:if test="${total == 0}">
				<td></td>
				<td colspan="6" align="right">No items in your cart</td>

			</c:if>
		</tr>
	</table>


	<br>
	<br>
	<a href="${pageContext.request.contextPath }/card/show">Enter Card
		number</a>
	<br>
	<br>
	<div></div>
	<p>
		<a href="${pageContext.request.contextPath }/product">Continue
			shopping, don't want to pay yet</a>
	</p>
	</div>

</body>
</html>