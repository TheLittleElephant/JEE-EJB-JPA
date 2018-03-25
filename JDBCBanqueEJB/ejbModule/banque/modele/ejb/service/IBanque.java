package banque.modele.ejb.service;

import javax.ejb.Remote;

@Remote
public interface IBanque {
	public void ouvrirCompte(String nomClient);
	public Compte consulterCompteParNumero(int numero);
	/*public void crediterCompte();*/

	
}
