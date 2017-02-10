<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ticket Assign</title>
</head>
<body>
	<h2>Assign or Reassign your ticket</h2>
	<form action="employee/ticketassign" method="GET">
		Email Id<input type="email" name="emailId"
			required autofocus /><br> <br> Password
		<input
			type="password" name="password" required /><br> <br>
		Ticket Id<input
			type="number" name="ticketId" required /><br> <br>
		Employee Id<input
			type="number" name="employeeId" required /><br> <br>

		<button type="submit">Submit</button>
	</form>

</body>
</html>

