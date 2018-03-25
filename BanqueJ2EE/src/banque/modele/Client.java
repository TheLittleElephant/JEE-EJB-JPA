package banque.modele;

import java.util.HashSet;
import java.util.Random;

public class Client {
	
	private int numero;
	private String nom;
	private String adresse;
	
	private HashSet<Compte> comptes = new HashSet<Compte>();
	
	private static int numeroAuto = 1;
	
	public Client(String nom, String adresse) {
		this.numero = numeroAuto++;
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public int getNumero() {
		return numero;
	}
	
	public HashSet<Compte> getComptes() {
		return comptes;
	}

	public Compte ajouterCompte() {
		Compte compte = new Compte(this);
		comptes.add(compte);
		return compte;
	}
	
}
