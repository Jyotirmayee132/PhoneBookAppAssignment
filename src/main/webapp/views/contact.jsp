<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Contact Info </h1>
<form:form action="/saveContact?contactId=${contact.contactId}" method="POST" modelAttribute="contact">
	${sucessMsg}
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="contactName"/>
			</tr>
			
			<tr>
				<td>Email:</td>
				<td><form:input path="contactemail"/>
			</tr>
			
			<tr>
				<td>phNo:</td>
				<td><form:input path="contactNo"/>
				
			</tr>
			<tr>
			<td></td>
				<td><input type="submit" value=Submit />
			</tr>
			</table>
			</form:form>
			<a href="view-Contacts">View All Contacts </a>

</body>
</html>