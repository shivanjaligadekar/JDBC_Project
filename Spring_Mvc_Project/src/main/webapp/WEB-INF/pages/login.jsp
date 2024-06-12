<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="yellow">
	<h2>Please sign in:</h2>
	<form action="doValidate" method="post">
		<pre>
             User Name:
             <input type="text" name="user_name" />
             Password:
             <input type="password" name="user_password" />
             <input type="submit" value="Sign In" />            
          </pre>
	</form>
</body>
</html>