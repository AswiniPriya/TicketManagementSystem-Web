<html>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Ticket</title>
</head>
<body>
<h2>View your Ticket</h2>
	<form action="usersticket/viewticket" method="GET">
		Email Id<input
			type="email" name="emailId" required autofocus /><br> <br>
		Password <input
			type="password" name="password" required /><br> <br>
				<button type="submit">Submit</button>
		
	</form>
	
<h3>User Details</h3>
	<%-- 	To Test Values : ${User_Details} --%>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>subject</th>
				<th>description</th>
				<th>status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${TICKET_LIST}" varStatus="i">
				<tr>
					<td>${c.id}</td>
					<td>${c.subject}</td>
					<td>${c.description}</td>
					<td>${c.status}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>

	

</html>

