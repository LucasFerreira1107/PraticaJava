
import java.util.Scanner;
import java.util.Locale;

public class ex25 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		double[] vetor1 = new double[n];
		
		for(int i=0; i < n; i++) {
			System.out.print("Digite o valor do "+ i + "˚ numero:");
			vetor1[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0; i < n; i++) {
			soma += vetor1[i];
		}
		double media = soma / n;
		
		System.out.printf("O valor da media: %.2f%n", media);
		
		sc.close();
	}

}
