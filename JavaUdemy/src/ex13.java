import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		
		System.out.println("Digite o valor de x:");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor de y:");
		y = sc.nextDouble();
		
		if (x > 0 && y >0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0 ) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x == 0 && y != 0) {
			System.out.println("EIXO X");
		}
		else if (y == 0 && x != 0) {
			System.out.println("EIXO Y");

		}
		else if (x == 0 && y == 0) {
			System.out.println("ORIGEM");

		}
		sc.close();
	}

}
