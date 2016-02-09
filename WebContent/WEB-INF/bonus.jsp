<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bonus</title>
</head>
<body>
	<h2>Calculated Bonus</h2>
	<c:forEach items="${bonus}" var="bonus">	
		<div class="SSN">		
			      <c:out value="${bonus.ssn}" /><br>
			<label>Bonus earned: </label>					
			  <c:choose>
				<c:when test="${not empty bonus.bonus}">${bonus.result}</c:when>
				<c:otherwise>bonus empty!</c:otherwise>
			  </c:choose>	
		  </div>
	</c:forEach>
	
</body>
</html>