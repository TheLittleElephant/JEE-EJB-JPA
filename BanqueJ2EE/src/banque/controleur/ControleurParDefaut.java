package banque.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controleur")
public class ControleurParDefaut extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public ControleurParDefaut() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		   case "creationClient": {
			   ControleurClient.creationClient(request, response);
			   break;
		   }
		   case "rechercheClient": {
			   ControleurClient.rechercheClient(request, response);
			   break;
		   }
		   case "creationCompte": {
			   ControleurCompte.creationCompte(request, response);
			   break;
		   }
		}
	}

}
