<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
	<c:import url="logout-parcial.jsp"/>
	<c:if test="${not empty empresa}">
		<h3>Empresa "${empresa}" cadastrada com sucesso!</h3>
	</c:if>

	<c:if test="${empty empresa}">
		<h3>Nenhuma empresa cadastrada.</h3>
	</c:if>
</body>
</html>
