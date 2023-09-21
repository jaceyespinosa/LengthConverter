<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Convert Meters</title>
</head>
<body>
	<h1>Meters to Centimeters</h1>
	<form action="metersToCentimetersServlet" method="post">
		Enter the length in meters: <input type="text" name="userMeters">
		<input type="submit" value="Convert">
	</form>
	<a href="kilometers.jsp">Convert kilometers to meters</a>
</body>
</html>