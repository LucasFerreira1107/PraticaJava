import java.util.Locale;
import java.util.Scanner;


public class ExSomaVetor {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Quantos numeros voce vai digitar? ");
		 int n = sc.nextInt();
		 
		double[] vetor = new double[n];
		 
		for(int i=0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores: ");
		for(int i=0; i < vetor.length; i++) {
			System.out.print( vetor[i] + " ");
		}
		
		double soma = 0.0;
		for(int i=0; i< vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println();
		System.out.printf("Soma: %.2f%n ", soma);
		
		double media = soma / vetor.length;
		System.out.printf("Media: %.2f%n ", media);
		
		 
		 sc.close();
		 
	}

}
