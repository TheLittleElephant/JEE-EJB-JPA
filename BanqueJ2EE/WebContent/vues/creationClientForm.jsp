<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
	Exception e = (Exception) request.getAttribute("erreur");
    String nomClient = request.getParameter("nomClient");
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Confirmation</h3>

<%= (e == null) ? "Le client " + nomClient + " a bien �t� cr��" : "Le client " + nomClient + " existe d�j� !" %> 


</body>
</html>