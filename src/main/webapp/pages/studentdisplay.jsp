<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Students</title>
</head>
<body>
	<h2>Student Database</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Dob</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		<c:forEach var="student" items="${stud}">
			<tr>
				<fmt:formatDate var="date" value="${student.dob}" pattern="dd-MM-yyyy" />
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${date}</td>
				<td>${student.email}</td>
				<td>${student.mobile}</td>
				<td><a href='studentEdit?id=${student.id}'>Edit</a>/<a href='studentdelete?id=${student.id}'>delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="addStudent">Add New Student</a><br>
	<a href="home">Go Back</a>

</body>
</html>