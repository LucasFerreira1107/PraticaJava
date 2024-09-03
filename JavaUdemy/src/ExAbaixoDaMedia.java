import java.util.Locale;
import java.util.Scanner;

public class ExAbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i]= sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i=0; i < vetor.length; i++) {
			soma += vetor[i];
			
		}
		
		System.out.println();
		double mediaAritmetica = soma / vetor.length;
		System.out.printf("MEDIA DO VETOR = %.3f\n", mediaAritmetica);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i=0; i < vetor.length; i++) {
			if( vetor[i] < mediaAritmetica) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
