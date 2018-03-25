package client.convertisseur;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import banque.modele.ejb.service.IBanque;

public class ClientEJBConvertisseurDevises {

	public static void main(String[] args) throws NamingException {
		Context contexte = new InitialContext();
		IBanque convertisseur = (IBanque) contexte.lookup("ejb/maBanqueBean_v1");
		double euro = convertisseur.convertirDollarVersEuro(1000);
		System.out.println("Le résultat de la conversion est : " + Math.round(euro) + " €");
	}

}
