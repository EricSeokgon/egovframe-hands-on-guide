<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Employee</title>
	</head>

	<body>
		<div>NAME: <c:out value="${pinfo.name}" /></div>
		<div>COMPANY: <c:out value="${pinfo.company}" /></div>
		<div>PHONE: <c:out value="${pinfo.phone}" /></div>
		<div>EMAIL: <c:out value="${pinfo.email}" /></div>
	</body>

</html>