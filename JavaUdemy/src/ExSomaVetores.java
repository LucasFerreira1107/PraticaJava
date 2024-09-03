import java.util.Locale;
import java.util.Scanner;

public class ExSomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.print("Digite os valores do vetor A: ");
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int i=0; i < vetorB.length; i++) {
			System.out.print("Digite os valores do vetor B: ");
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i=0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			
			System.out.println(vetorC[i]);
		}
		
		
		sc.close();
	}

}
