<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
	<h1 style="colour: black" text-align="center">aha login
		successeful
		
		<%
		Object currUser = session.getAttribute("validUser");
		%>
		<h2>UserName=<%=currUser%></h2> </h1>

</body>
</html>