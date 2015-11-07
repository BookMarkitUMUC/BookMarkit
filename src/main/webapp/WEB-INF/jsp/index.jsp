<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Welcome</title>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/resources/style.css" />'>
</head>
<body>
	<h1>Welcome to BookMarkIt</h1>
	<a href='<c:url value="/login" />'>Login</a> |
	<a href='<c:url value="/register" />'>Register</a>
</body>
</html>