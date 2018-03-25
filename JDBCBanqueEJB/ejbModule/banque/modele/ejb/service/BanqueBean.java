package banque.modele.ejb.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(mappedName="ejb/maBanqueBean_v2")
public class BanqueBean implements IBanque {
	
	@PersistenceContext(unitName="BanqueConfig")
	private EntityManager entityManager;

	@Override
	public void ouvrirCompte(String nomClient) {
		Compte compte = new Compte(nomClient);
		entityManager.persist(compte);
	}
	
	@Override
	public Compte consulterCompteParNumero(int numero) {
		return entityManager.find(Compte.class, numero);
	}

}
