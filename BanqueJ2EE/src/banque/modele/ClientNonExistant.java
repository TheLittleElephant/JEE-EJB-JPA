package banque.modele;

public class ClientNonExistant extends Exception {
	
	private String nom;

	public ClientNonExistant(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Le client " + nom + " n'existe pas";
	}
	
	
}
