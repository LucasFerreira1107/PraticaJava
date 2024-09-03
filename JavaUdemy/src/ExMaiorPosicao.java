import java.util.Locale;
import java.util.Scanner;

public class ExMaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		double maiorNum = 0.0;
		int posicaoVetor = 0;
		for(int i =0; i < vetor.length; i++) {
			System.out.print("Digite um numero:");
			vetor[i] = sc.nextInt();
			
			if(vetor[i] > maiorNum) {
				maiorNum = vetor[i];
				posicaoVetor = i;
			}
		}
		
		System.out.println("MAIOR VALOR: " + maiorNum);
		System.out.println("POSICAO DO MAIOR VALOR: " + posicaoVetor);
		
		
		
		
		sc.close();
	}

}
