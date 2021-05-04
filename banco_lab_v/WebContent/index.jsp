<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.bank.util.RoutesController" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mi Banco</title>
</head>
<body>

	<form action="<%= RoutesController.INDEX %>" method="post">
		
		<input type="text" name="username" placeholder="Nombre de usuario">
		<input type="password" name="password" placeholder="Contraseña">
		<input type="submit" value="Iniciar sesion">
	
	</form>

</body>
</html>