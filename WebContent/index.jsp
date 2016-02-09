<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jboss</title>
</head>
<body>
	<h3>Welcome !!!</h3>
	<form action="<%=request.getContextPath()%>/servlet" method="post">
	<label>Name:</label> <input type="text"  name="name">
	<label>Firstname:</label> <input type="text" name="firstname">	
	<input type="submit" value="Send">
	</form>
</body>
</html>