package banque.modele.ejb.service;

import javax.ejb.Remote;

@Remote
public interface IBanque {
	public void ouvrirCompte(String nomClient);
	public void consulterCompteParNumero();
	/*public void crediterCompte();*/
}
