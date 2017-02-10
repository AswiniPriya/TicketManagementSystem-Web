<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%
    ResultSet departmentname = null;
 	ResultSet priority = null;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Ticket</title>
</head>

<body>
<%
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/ticket_management_system?user=root&password=aswini");
        
            Statement statement = connection.createStatement();

            departmentname = statement.executeQuery("SELECT name FROM tbl_departments");
    %>
<h2>Create your new Ticket</h2>
	<form action="usersticket/newticket" method="GET">
		Email Id<input
			type="email" name="emailId" required autofocus /><br> <br>
		Password <input
			type="password" name="password" required /><br> <br>
		Subject<input
			type="text" name="subject" required /><br> <br>
		Description<input
			type="text" name="description" required /><br> <br>
		Department Name  <select name="departmentname">
        <%  while(departmentname.next()){ %>
            <option><%= departmentname.getString(1)%></option>
        <% } %>
        
        </select> <br> <br>
        <%
        } catch (Exception e) {
            out.println("wrong entry" + e);
        }
    %>
		<%
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/ticket_management_system?user=root&password=aswini");
        
            Statement statement = connection.createStatement();

            priority = statement.executeQuery("SELECT priority FROM tbl_priorities");
    %>
		Priority
		 <select name="priority">
        <%  while(priority.next()){ %>
            <option><%= priority.getString(1)%></option>
        <% } %>
        </select> <br> <br>
		<button type="submit">Submit</button>
	</form>
	 <%
        } catch (Exception e) {
            out.println("wrong entry" + e);
        }
		
    %>
</body>
</html>

 