package servlet.client.ejb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banque.modele.ejb.service.IBanque;

@WebServlet("/convertisseur")
public class ConversionDevisesClientServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@EJB(mappedName="ejb/maBanqueBean_v1")
	private IBanque banque;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double resultat = 0;
		String deviseCible = "";
		double somme = Double.parseDouble(request.getParameter("somme"));
		String deviseSource = request.getParameter("devise");
		if(deviseSource.equals("euro")) {
			resultat = banque.convertirEuroVersDollar(somme);
			deviseCible = (resultat > 1 ? "euros" : "euros");
		} 
		if(deviseSource.equals("dollar")) {
			resultat = banque.convertirDollarVersEuro(somme);
			deviseCible = (resultat > 1 ? "dollars" : "dollar");
		}
		PrintWriter printWriter = response.getWriter();
		printWriter.println(somme + " " + (somme > 1 ? deviseSource += "s" : deviseSource) + " vaut " + Math.round(resultat) + " " + deviseCible);
	}

}
