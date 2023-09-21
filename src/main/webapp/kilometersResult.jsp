<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Conversion Result</title>
</head>
<body>
	<p>${convertedLength.getValue()} kilometers is equal to
		${convertedLength.getResult()} meters.</p>
	<a href="kilometers.jsp">Convert another length</a>
</body>
</html>