package banque.modele.ejb.service;

import javax.ejb.Stateless;

@Stateless(mappedName="ejb/maBanqueBean_v1")
public class BanqueBean implements IBanque {
	
	private double tauxChangeEuroDollar = 1.20;

	@Override
	public double convertirEuroVersDollar(double euro) {
		return euro * tauxChangeEuroDollar;
	}

	@Override
	public double convertirDollarVersEuro(double dollar) {
		return dollar / tauxChangeEuroDollar;
	}

}
