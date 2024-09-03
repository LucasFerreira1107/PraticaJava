import java.util.Locale;
import java.util.Scanner;

public class ExNegativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		while(true){
			System.out.print("Digite um numero para o tamanho do vetor(1 a 10): ");
			n = sc.nextInt();
			if(n <= 10) {
				break;
			}
		}
		
		double[] vetor = new double[n];
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero real: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.printf("%.0f%n", vetor[i]);
			}
		}
		sc.close();
	}

}
