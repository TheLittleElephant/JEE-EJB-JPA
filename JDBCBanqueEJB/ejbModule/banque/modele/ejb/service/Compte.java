package banque.modele.ejb.service;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compte implements Serializable {
	
	@Id
	@GeneratedValue
	private int numero;
	private double solde;
	private String nomClient;
	
	public Compte() {
		
	}

	public Compte(String nomClient) {
		this.nomClient = nomClient;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
}
