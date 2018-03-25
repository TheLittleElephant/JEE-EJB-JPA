package banque.modele.ejb.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class TestBanqueConversionDevises {

	@Test
	public void testDollarVersEuro() {
		BanqueBean banque = new BanqueBean();
		double euro = banque.convertirDollarVersEuro(120);
		Assert.assertEquals(120/1.20, euro, 0.00001);
	}
	
	@Test
	public void testEuroVersDollar() {
		BanqueBean banque = new BanqueBean();
		double euro = banque.convertirEuroVersDollar(120);
		Assert.assertEquals(120*1.20, euro, 0.00001);
	}

}

