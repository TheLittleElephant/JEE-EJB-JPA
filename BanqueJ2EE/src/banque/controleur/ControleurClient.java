package banque.controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banque.modele.Banque;
import banque.modele.Client;
import banque.modele.ClientDejaExistant;
import banque.modele.ClientNonExistant;

public class ControleurClient {

	private static final long serialVersionUID = 1L;

	public static void creationClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nomClient");
		String adresse = request.getParameter("adresseClient");
		try {
			Banque.getInstance().creerClient(nom, adresse);
		} catch (ClientDejaExistant e) {
			request.setAttribute("erreur", e);
		}
		request.getRequestDispatcher("/vues/creationClientForm.jsp").forward(request, response);
	}
	
	public static void rechercheClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rechercheNom = request.getParameter("clientRecherche");
		
		Client clientTrouve = null;
		try {
			clientTrouve = Banque.getInstance().rechercherClient(rechercheNom);
			request.setAttribute("client", clientTrouve);
		} catch (ClientNonExistant e) {
			request.setAttribute("erreur", e);
		}
		request.getRequestDispatcher("/vues/rechercheClientResultat.jsp").forward(request, response);
		
	}
	
	
	
	

}
