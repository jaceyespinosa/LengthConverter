<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Conversion Result</title>
</head>
<body>
	<p>${convertedLength.getValue()} meters is equal to
		${convertedLength.getResult()} centimeters.</p>
	<a href="meters.jsp">Convert another length</a>
</body>
</html>