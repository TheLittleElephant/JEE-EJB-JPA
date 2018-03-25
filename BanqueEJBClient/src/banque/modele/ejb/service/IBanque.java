package banque.modele.ejb.service;


import javax.ejb.Remote;

@Remote
public interface IBanque {
	public double convertirEuroVersDollar(double euro);
	public double convertirDollarVersEuro(double dollar);
}
