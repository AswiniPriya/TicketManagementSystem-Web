<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Update Ticket</title>
</head>
<body>
	<h2>Update the Ticket Assigned to u</h2>
	<form action="employee/updateticket" method="GET">
		Email Id<input
			type="email" name="emailId" required autofocus /><br> <br>
		Password<input
			type="password" name="password" required /><br> <br> Ticket
		Id<input type="number"
			name="ticketId" required /><br> <br>
		Status<input type="text" name="status"
			required /><br> <br>

		<button type="submit">Submit</button>
	</form>

</body>
</html>

