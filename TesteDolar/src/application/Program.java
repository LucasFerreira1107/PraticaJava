package application;

import java.util.Locale;
import util.Dolar;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("Hoy many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.println();
		System.out.println("Amount to be paid in reais = R$ " + Dolar.priceDolar(price, quantity));
		
		
		sc.close();
	}
}
