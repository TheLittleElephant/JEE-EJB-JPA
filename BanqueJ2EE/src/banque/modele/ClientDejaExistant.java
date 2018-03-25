package banque.modele;

public class ClientDejaExistant extends Exception {
	
	private String nom;

	public ClientDejaExistant(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Le client " + nom + " a déjà été créé";
	}
	
	

}
