<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="banque.modele.Compte" %>
<% 
    String nomClient = request.getParameter("nomClient");
    Compte compte = (Compte) request.getAttribute("compte");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Confirmation de cr�ation de compte</h3>

<%= (compte != null) ? "Le compte " + String.format("%04d\n", compte.getNumeroCompte()) + " a �t� cr�e pour " + compte.getProprietaire().getNom() : "Vous ne pouvez pas cr�er un compte si vous n'�tes pas client de la banque" %>
</body>
</html>