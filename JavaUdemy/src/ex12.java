import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um numero aleatorio:");
		num = sc.nextDouble();
		
		if ( num <= 25 ) {
			System.out.println("Intervalo: [0,25]");
		}
		else if (num <= 50) {
			System.out.println("Intervalo: (25,50]");
		}
		else if (num <= 75) {
			System.out.println("Intervalo: (50,75]");

		}
		else if (num <= 100) {
			System.out.println("Intervalo: (75,100]");
			
		}
		else if (0 < num || num > 100) {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}
