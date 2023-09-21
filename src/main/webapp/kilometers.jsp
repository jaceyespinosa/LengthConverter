<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Convert Kilometers</title>
</head>
<body>
	<h1>Kilometers to Meters</h1>
	<form action="kilometersToMetersServlet" method="post">
		Enter the length in kilometers: <input type="text"
			name="userKilometers"> <input type="submit" value="Convert">
	</form>
	<a href="meters.jsp">Convert meters to centimeters</a>
</body>
</html>