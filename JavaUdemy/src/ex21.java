import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double x = sc.nextDouble();
			double y = sc.nextDouble();

			double divisao = x / y;

			if (y == 0) {
				System.out.println("divisao impossivel!!!");
			} else {
				System.out.printf("valor da divisao: %.2f%n", divisao);
			}
			
		}
		sc.close();
	}

}
