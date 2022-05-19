<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
 <h2>Customers</h2>
	<table style="border: solid 1px red" class="table">
		<thead style="border: solid 1px red">
			<tr style="border: solid 1px red">
				<th>CustId</th>
				<th>Name</th>
				<th>Mobile</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="cus">
				<tr style="border: solid 1px red">
					<td>${cus.custID}</td>
					<td>${cus.name}</td>
					<td>${cus.mobile}</td>
					<td>${cus.email}</td>
					<td><a href="/customer/delete/${cus.custID}">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/customer/add">Add Customer</a>
	</body>
</html>