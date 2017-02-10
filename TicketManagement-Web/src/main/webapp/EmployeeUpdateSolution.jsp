<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Ticket Solution</title>
</head>
<body>
<h2>Update Solution to the Ticket Assigned</h2>
	<form action="employee/updatesolution" method="GET">
		Email Id<input
			type="email" name="emailId" required autofocus /><br> <br>
		Password <input
			type="password" name="password" required /><br> <br>
		
		Ticket Id<input
			type="number" name="ticketId" required  /><br> <br>
		Solution Text<input
			type="text" name="solutionText" required /><br> <br>
		
			<button type="submit">Submit</button>
	</form>
	
</body>
</html>

