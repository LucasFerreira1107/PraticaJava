import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double caso1 = sc.nextDouble();
			double caso2 = sc.nextDouble();
			double caso3 = sc. nextDouble();
			
			double media = (caso1 * 2 + caso2 * 3 + caso3 * 5) / 10.0;
			
			System.out.printf("Valor da media ponderada e: %.2f%n", media);

		}
		
		sc.close();
	}

}
