<%@ page 
    import="banque.modele.Client, banque.modele.Compte"
    language="java" 
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>

<% 
	Exception e = (Exception) request.getAttribute("erreur");
    String clientRecherche = request.getParameter("clientRecherche");
    Client client = (Client) request.getAttribute("client");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Résultats pour la recherche '<%= clientRecherche %>'</h3>

<% if(e == null) { %>

	Le client suivant a été trouvé : <br>
	
	<b>Nom : </b> <%= client.getNom() %> <br>
	<b>Adresse : </b> <%= client.getAdresse() %> <br>
	
	<b>Comptes enregistrés : </b><br>
	<ul>
		<% for(Compte c : client.getComptes()) { %>
			<li>Compte n°<%= c.getNumeroCompte() %>
	    <% } %>
	</ul>
	
<% } else { %>

	Le client '<%= clientRecherche %>' n'a pas été trouvé

<% } %>
</body>
</html>