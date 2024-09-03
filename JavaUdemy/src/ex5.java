import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalP1, totalP2;
		//int codigoP1, codigoP2;

		double valorUnitarioP1, valorUnitarioP2, valor;

		// Cadastro produto 1
		System.out.println("Digite o codigo do produto 1:");
		//codigoP1 = sc.nextInt();

		System.out.println("Digite o total de pecas do produto 1:");
		totalP1 = sc.nextInt();

		System.out.println("Digite o valor unitario do produto 1:");
		valorUnitarioP1 = sc.nextDouble();

		// Cadastro produto 2
		System.out.println("Digite o codigo do produto 2:");
		//codigoP2 = sc.nextInt();

		System.out.println("Digite o total de pecas do produto 2:");
		totalP2 = sc.nextInt();

		System.out.println("Digite o valor unitario do produto 2:");
		valorUnitarioP2 = sc.nextDouble();
		
		valor = (totalP1 * valorUnitarioP1) + (totalP2 * valorUnitarioP2);
		
		System.out.println("VALOR A PAGAr: R$ " + valor);
		sc.close();

	}

}
