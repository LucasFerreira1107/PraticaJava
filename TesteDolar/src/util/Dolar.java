package util;

public class Dolar {
	
	public static final double IOF = 0.06;
	
	public static double priceDolar(double price, double quantity) {
		return price * quantity + ((price * quantity) * IOF);
	}

}
