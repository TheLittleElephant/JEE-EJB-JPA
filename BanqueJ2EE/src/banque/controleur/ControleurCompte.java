package banque.controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banque.modele.Banque;
import banque.modele.Client;
import banque.modele.ClientDejaExistant;
import banque.modele.ClientNonExistant;
import banque.modele.Compte;

public class ControleurCompte {
	
	public static void creationCompte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomClient = request.getParameter("nomClient");
	    try {
			Compte compte = Banque.getInstance().creerCompte(nomClient);
			request.setAttribute("compte", compte);
		} catch (ClientNonExistant e) {
			
		}
		request.getRequestDispatcher("/vues/creationCompteResultat.jsp").forward(request, response);
	}
	

}
