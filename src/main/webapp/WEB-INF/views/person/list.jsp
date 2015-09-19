<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="container">
		<tr>
			<th>Name</th>
			<th>Postcode</th>
			<th>Address</th>
		</tr>
		<c:forEach var="person" items="${people}">
		<tr>
			<td>${person.name}</td>
			<td>${person.postcode}</td>
			<td>${person.address}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>