<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Document Upload</title>
</head>
<body>

	<!-- enctype="multipart/form-data" - this tells the server that along with the form data
	there are also attachments or files that are coming in -->
	
	<form action="/upload" method="POST" enctype="multipart/form-data">
		Id: <input type="text" name="id" />
		File: <input type="file" name="document" />
		<input type="submit" name="submit" value="Upload" />
	</form>
</body>
</html>