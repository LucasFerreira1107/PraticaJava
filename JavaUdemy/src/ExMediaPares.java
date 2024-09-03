import java.util.Locale;
import java.util.Scanner;

public class ExMediaPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		double soma = 0.0;
		int contador = 0;
		for(int i=0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i]= sc.nextInt();
			
			if(vetor[i] %2 == 0) {
				soma += vetor[i];
				contador +=1;
			}
		}
		double mediaPares = soma / contador;
		
		if(soma == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		}
		
		sc.close();
	}

}
