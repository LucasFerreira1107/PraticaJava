import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double salario, imposto = 0.0;
		
		System.out.println("Digite o salario:");
		salario = sc.nextDouble();
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}
		else if (salario <= 3000) {
			imposto = (salario - 1000) * 8 / 100;
			System.out.printf("Imposto: %.2f ", imposto);
		}
		
		sc.close();
	}

}
