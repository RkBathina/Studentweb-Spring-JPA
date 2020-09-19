<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Exams</title>
</head>
<body>
	<h2>Exams DataBase</h2>
	<table>
		<tr>
			<th>ExamId</th>
			<th>ExamName</th>
		</tr>
		<c:forEach var="exams" items="${exam}" >
			<tr>
				<td>${exams.id}</td>
				<td>${exams.name}</td>
				<td><a href='examEdit?id=${exams.id}'>Edit</a>/<a href='examdelete?id=${exams.id}'>Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br><a href="addExam">Add New Exam</a><br><br>
	<a href="home">Go back</a>

</body>
</html>