import java.util.Locale;
import java.util.Scanner;

public class ExNumerosPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		int contadorPar = 0;
		
		for(int i =0; i < vetor.length; i++) {
			System.out.print("Digite um numero:");
			vetor[i] = sc.nextInt();
			
			if(vetor[i] %2 == 0) {
				contadorPar += 1;
			}
		}
		
		System.out.println("Numeros Pares: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] %2 == 0) {
				System.out.print(vetor[i] + " ");
			}
			
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + contadorPar);

		 
		sc.close();
	}

}
