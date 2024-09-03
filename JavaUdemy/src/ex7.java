import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		sc.close();
	}

}
