import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero inteiro:");
		num = sc.nextInt();
		
		if (num %2 == 0) {
			System.out.print("Par");
		}
		else {
			System.out.print("Impar");
		}

		sc.close();
	}

}
