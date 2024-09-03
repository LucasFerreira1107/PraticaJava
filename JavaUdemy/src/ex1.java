import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Variavel para o Scanner
		Scanner sc = new Scanner(System.in);
		
		// Criacao de variavel double para soma
		double x, y, soma;
		
	
		System.out.println("Digite o valor de X:");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor de Y:");
		y = sc.nextDouble();
		
		// Soma dos resultados
		soma = x + y;
		
		System.out.printf("SOMA = " + soma);
		
		sc.close();
	}

}
