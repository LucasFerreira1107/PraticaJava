import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite o valor de x: ");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor de y: ");
		y = sc.nextDouble();
		
		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0){
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		sc.close();
	}

}
