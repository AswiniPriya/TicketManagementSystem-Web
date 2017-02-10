<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Ticket</title>
</head>
<body>
	<h2>View your Assigned Ticket</h2>
	<form action="employee/showemployeeticket" method="GET">
		Email Id<input
			type="email" name="emailId" required autofocus /><br> <br>
		Password <input
			type="password" name="password" required /><br> <br>
		<button type="submit">Submit</button>

	</form>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>user Id</th>
				<th>department Id</th>
				<th>subject</th>
				<th>description</th>
				<th>priority</th>
				<th>Created Date</th>
				<th>Employee Id</th>
				<th>status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${EMPLOYEE_TICKET_LIST}" varStatus="list">
				<tr>
					<td>${c.id}</td>
					<td>${c.userId.userId}</td>
										<td>${c.departmentId.departmentId}</td>
										<td>${c.subject}</td>
					<td>${c.description}</td>
					<td>${c.priority.id}</td>
					<td>${c.createdDate}</td>
					<td>${c.employeeId.employeeId}</td>
					<td>${c.status}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>

