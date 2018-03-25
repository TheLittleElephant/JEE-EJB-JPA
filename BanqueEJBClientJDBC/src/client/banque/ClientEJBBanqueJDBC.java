package client.banque;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import banque.modele.ejb.service.IBanque;

public class ClientEJBBanqueJDBC {

	public static void main(String[] args) throws NamingException {
		Context contexte = new InitialContext();
		IBanque banque = (IBanque) contexte.lookup("ejb/maBanqueBean_v2");
		banque.ouvrirCompte("Gamaliny");
		banque.ouvrirCompte("Illmmin");
		banque.ouvrirCompte("Kévin");
	}

}
