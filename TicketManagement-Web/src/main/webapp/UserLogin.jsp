<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<h2>Sign Up</h2>
	<form action="users/signup" method="GET">
		UserName:<input type="text"
			name="name" required autofocus /><br> <br> 
		Email Id:<input
			type="email" name="emailId" required autofocus /><br> <br>
		Password : <input
			type="password" name="password" required /><br> <br>
		PhoneNumber: <input type="text" name="phonenumber" required autofocus /><br>
		<br>
		<button type="submit">Submit</button>
	</form>
	<h2>Login</h2>
	<form action="users/login" method="GET">
		Email Id: <input
			type="email" name="emailId" required autofocus /> <br> <br>
		Password :  <input type="password"
			name="password" required /> <br> <br>

		<button type="submit">Submit</button>
	</form>
</body>
</html>