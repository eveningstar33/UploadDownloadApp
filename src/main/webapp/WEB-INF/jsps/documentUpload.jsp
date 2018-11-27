<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Document Upload</title>
</head>
<body>

	<!-- enctype="multipart/form-data" - this tells the server that along with the form data
	there are also attachments or files that are coming in -->
	
	<form action="upload" method="POST" enctype="multipart/form-data">
		<pre>
		Id: <input type="text" name="id" />
		File: <input type="file" name="document" />
		<input type="submit" name="submit" value="Upload" />
		</pre>
	</form>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>link</th>
		</tr>
		<c:forEach items="${documents}" var="document">
			<tr>
				<td>${document.id}</td>
				<td>${document.name}</td>
				<td><a href="download?id=${document.id}">download</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>