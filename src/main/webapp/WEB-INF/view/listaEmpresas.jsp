<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.bb.gerenciador.modelo.Empresa"%>

<!-- Taglib importa a biblioteca jlst que está na pasta lib e
atribui a ela um alias que será utilizado na tag foreach mais abaixo -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Stantard Taglib</title>
</head>
<body>
	
	<c:import url="logout-parcial.jsp"/>
	
	Usuario logado: ${usuarioLogado.login }

	<c:if test="${not empty empresa}">
		<h3>Empresa "${empresa}" cadastrada com sucesso!</h3>
		<br />
	</c:if>

	<h3>Lista de empresas:</h3>
	<ul>
		<!-- Expressão para fazer um for no JSP -->
		<c:forEach items="${empresas}" var="empresa">

			<!-- A linha abaixo com a variável empresa.nome, equivale a sintaxe java empresa.getNome
		A sintaxe é simplificada bastando apenas colocar o nome e ainda em minúsculo -->
			<li>${empresa.nome}-<fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> <a
				style="margin-left: 10px"
				href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">Edita</a> <a
				style="margin-left: 10px"
				href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">Remove</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>