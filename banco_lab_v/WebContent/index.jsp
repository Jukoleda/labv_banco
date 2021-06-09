<%@ page import="com.bank.util.RoutesController, com.bank.util.IndexVars, java.util.Map, java.util.HashMap" %>
<%@ include file="/static/header.jsp" %>

<%

	
	
	String email = (request.getAttribute(IndexVars.EMAIL) == null ? "" : (String) request.getAttribute(IndexVars.EMAIL))
	, contra = (request.getAttribute(IndexVars.PASSWORD) == null ? "" : (String) request.getAttribute(IndexVars.PASSWORD))
	, eEmail = (request.getAttribute(IndexVars.V_EMAIL) == null ? "" : (String) request.getAttribute(IndexVars.V_EMAIL))
	, eContra = (request.getAttribute(IndexVars.V_PASS) == null ? "" : (String) request.getAttribute(IndexVars.V_PASS))
	, e_nEmail = (request.getAttribute(IndexVars.V_NO_EMAIL) == null ? "" : (String) request.getAttribute(IndexVars.V_NO_EMAIL))
	, e_nContra = (request.getAttribute(IndexVars.V_NO_PASS) == null ? "" : (String) request.getAttribute(IndexVars.V_NO_PASS))
	, e_nfEmail = (request.getAttribute(IndexVars.V_NF_EMAIL) == null ? "" : (String) request.getAttribute(IndexVars.V_NF_EMAIL));



	
	
	
	
%>

	<form action="<%= RoutesController.INDEX %>" method="post">
		
		<input type="text" class="form-control" name="<%= IndexVars.EMAIL %>" placeholder="Correo electrónico" value="<%= email %>">
		<input type="password" class="form-control" name="<%= IndexVars.PASSWORD %>" placeholder="Contraseña" value="<%= contra %>">
		<input type="submit" class="btn btn-primary" value="Iniciar sesion">
	
	</form>
	<div>
		<br>
		<%= eEmail %>
		<br>
		<%= eContra %>
		<br>
		<%= e_nEmail %>
		<br>
		<%= e_nContra %>
		<br>
		<%= e_nfEmail %>
	</div>

<%@ include file="/static/footer.jsp" %>