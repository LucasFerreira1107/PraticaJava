import java.util.Locale;
import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		for (int i = 1; i <= n; i++) {
			double quadrado, cubo;
			
			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i,3);
			
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();
	}

}
