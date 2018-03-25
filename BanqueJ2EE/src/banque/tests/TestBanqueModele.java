package banque.tests;
import static org.junit.Assert.*;

import org.junit.Test;

import banque.modele.Banque;
import banque.modele.ClientDejaExistant;
import banque.modele.ClientNonExistant;

public class TestBanqueModele {

	@Test
	public void testCreationClientPositif() throws ClientDejaExistant {
		Banque.getInstance().creerClient("Smith", "Vannes");
	}
	
	@Test(expected = ClientDejaExistant.class)
	public void testCreationClientNegatif() throws ClientDejaExistant {
		Banque.getInstance().creerClient("Dupont", "Vannes");
		Banque.getInstance().creerClient("Dupont", "Montpellier");
	}
	
	@Test
	public void testRechercheClient() throws ClientNonExistant, ClientDejaExistant {
		Banque.getInstance().creerClient("Dupont", "Montpellier");
		Banque.getInstance().rechercherClient("Dupont");
	}
	
	@Test(expected = ClientNonExistant.class)
	public void testRechercheClientNonExistant() throws ClientNonExistant {
		Banque.getInstance().rechercherClient("Parmentier");
	}
	

}
