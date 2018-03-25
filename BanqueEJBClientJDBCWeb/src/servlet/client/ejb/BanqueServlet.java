package servlet.client.ejb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banque.modele.ejb.service.Compte;
import banque.modele.ejb.service.IBanque;

@WebServlet("/compte")
public class BanqueServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@EJB(mappedName="ejb/maBanqueBean_v2")
	private IBanque banque;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		PrintWriter printWriter = response.getWriter();
		
		if(action.equals("ouvrir")) {
			String client = request.getParameter("client");
			try {
				banque.ouvrirCompte(client);
				printWriter.println("Le compte pour " + client + " a bien été créé");
			} catch (Exception e) {
				printWriter.println("Le compte pour " + client + " n'a pas pu être créé");
			}
		} 
		if(action.equals("consulter")) {
			String numero = request.getParameter("numero");
			Compte compte = banque.consulterCompteParNumero(Integer.parseInt(numero));
			printWriter.println("Compte n°" + compte.getNumero() + " de " + compte.getNomClient() + " a un solde de " + compte.getSolde());
		}
		
	}

}
