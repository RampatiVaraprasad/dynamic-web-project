<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp page</title>
</head>
<body>
	<h1>
		<p>Welcome to jsp page</p>
	</h1>
	<table border=1>
		<tr>
			<th>i value</th>
			<th>i square</th>
			<th>i cube</th>
		</tr>
		<%
		for (int i = 1; i <= 10; i++) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=i * i%></td>
			<td><%=i * i * i%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>