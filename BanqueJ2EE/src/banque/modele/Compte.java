package banque.modele;

import java.util.Random;

public class Compte {
	
	private int numeroCompte;
	private double solde;
	private Client proprietaire;
	
	private static Random numeroAuto = new Random();
	
	public Compte(Client proprietaire) {
		this.numeroCompte = (numeroAuto.nextInt(9999));
		this.proprietaire = proprietaire;
		this.solde = 0;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public Client getProprietaire() {
		return proprietaire;
	}
}
