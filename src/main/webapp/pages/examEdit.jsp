<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Exam</title>
</head>
<body>
	<form action="examupdate" method="post">
		<h2>
			Updating Exam Information of Id "<%=request.getParameter("id")%>"
		</h2>
		<table>
			<tr>
				<td>ExamId</td>
				<td><input type="text" name="id" value="<%=request.getParameter("id")%>" readonly="readonly">
				<td>
			</tr>
			<tr>
				<td>ExamName</td>
				<td><input type="text" name="name">
				<td>
			</tr>
		</table>
		<input type="submit" value="submit"> <input type="reset"
			value="Cancel">
	</form>

</body>
</html>