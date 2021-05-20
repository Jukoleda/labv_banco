<%@ page import="com.bank.util.RoutesController, com.bank.util.IndexVars" %>
<%@ include file="/static/header.jsp" %>

	<form action="<%= RoutesController.INDEX %>" method="post">
		
		<input type="text" class="form-control" name="<%= IndexVars.USERNAME %>" placeholder="Nombre de usuario">
		<input type="password" class="form-control" name="<%= IndexVars.PASSWORD %>" placeholder="Contraseña">
		<input type="submit" class="btn btn-primary" value="Iniciar sesion">
	
	</form>

<%@ include file="/static/footer.jsp" %>