<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Contacts</title>

<script type="text/javascript">
  function confirmDelete(){
  return confirm("Are u sure to Delete?")
  }
</script>
</head>
<body>
	<h4>View Contacts</h4>
	<a href="load-Form">+Add NEW Contact</a>
	<table border="1">
		<thead>
			<tr>
				<th>Contact ID</th>
				<th>Contact Name</th>
				<th>Contact Email</th>
				<th>Contact Number</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${contacts}" var="contact">
				<tr>
					<td><c:out value="${contact.contactId}"/></td>
					<td><c:out value="${contact.contactName}"/></td>
					<td><c:out value="${contact.contactemail}"/></td>
					<td><c:out value="${contact.contactNo}"/></td>
					<td><a href="edit?cid=${contact.contactId}">EDIT</a> <a href="delete?cid=${contact.contactId}"onclick="return confirmDelete()">DELETE</a></td>
				</tr>
			</c:forEach>
		</thead>
		<tbody>
		</tbody>

	</table>
</body>
