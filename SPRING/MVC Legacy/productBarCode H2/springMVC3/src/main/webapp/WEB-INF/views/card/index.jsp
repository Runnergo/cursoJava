<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Card Page</title>
</head>
<body>
	<h3>Card Page</h3>

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
			<td colspan="6" align="right">Sum</td>
			<td>${total }</td>
		</tr>
	</table>
	<div></div>
	<p>
		<a href="${pageContext.request.contextPath }/product">Continue
			shopping, don't want to pay yet</a>
	</p>
	<br>
	<br>
	</div>

	<form:form name="submitForm" method="POST">
		<h3>Type your card number</h3>
		<table>
			<tr>
				<td><label></label></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="Name" /></td>
			</tr>
			<tr>
				<td><label>Card Number</label></td>
				<td><input type="text" name="cardNumber" /></td>
			</tr>
		</table>
		<div style="color: red">${message}</div>
	</form:form>
	<br>
	<br>
	<div></div>
	<p>
		<a href="${pageContext.request.contextPath }/cart/deleteCart">Continue
			shopping, new Cart (same Session)</a>
	</p>
	</div>
	<div></div>
	<p>
		<a href="${pageContext.request.contextPath }/cart/deleteSession">End
			session (logout)</a>
	</p>
	</div>
</body>
</html>