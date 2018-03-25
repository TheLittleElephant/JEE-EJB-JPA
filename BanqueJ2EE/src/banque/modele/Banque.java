package banque.modele;

import java.util.HashMap;
import java.util.Map;

public class Banque {
	
	private Map<String, Client> clients = new HashMap<String, Client>();
	private static Banque instance = new Banque();
	
	private Banque() {
		
	}
	
	public static Banque getInstance() {
		return instance;
	}
	
	public Client creerClient(String nom, String adresse) throws ClientDejaExistant {
		Client client = clients.get(nom);
		if(client != null) {
			throw new ClientDejaExistant(nom);
		}
		client = new Client(nom, adresse);
		clients.put(nom, client);
		return client;
	}
	
	public Compte creerCompte(String nomClient) throws ClientNonExistant {
		Client clientTrouve = rechercherClient(nomClient);
		if(clientTrouve != null) {
			return clientTrouve.ajouterCompte();
		} else {
			throw new ClientNonExistant(nomClient);
		}
		
	}
	
	public Client rechercherClient(String nom) throws ClientNonExistant {
		for(Client client : clients.values()) {
			if(client.getNom().equals(nom)) {
				return client;
			}
		}
		throw new ClientNonExistant(nom);
	}

}
