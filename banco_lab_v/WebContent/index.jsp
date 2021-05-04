<%@ page import="com.bank.util.RoutesController" %>
<%@ include file="/static/header.jsp" %>

	<form action="<%= RoutesController.INDEX %>" method="post">
		
		<input type="text" name="username" placeholder="Nombre de usuario">
		<input type="password" name="password" placeholder="Contraseña">
		<input type="submit" value="Iniciar sesion">
	
	</form>

<%@ include file="/static/footer.jsp" %>