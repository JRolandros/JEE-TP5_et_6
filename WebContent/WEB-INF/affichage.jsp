<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<p>
	<label>firstname :</label> ${ coyote.prenom } <br>
	<label>Name :</label> ${ coyote.nom }<br>
	</p>
	
	 <h2>Please fill this table values</h2>
	 <p>
	 <form action="<%=request.getContextPath()%>/BonusServlet" method="post">
		 <table>
		    <tr>
		        <th>SSN</th>
		        <th>Bonus</th>
		    </tr>
		     <tr>
	            <td><input type="text" name="ssn1"></td>
	            <td><input type="text" name="bonus1"></td>
		      </tr>
		      <tr>
	            <td><input type="text" name="ssn2"></td>
	            <td><input type="text" name="bonus2"></td>
		      </tr>
	     </table>
     	<input type="submit" value="Send Form">
	 </form>
	</p>
</body>
</html>