import java.util.Scanner ;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159, raio, area;
		
		System.out.println("Digite o valor do raio:");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A area do circulo e: %.4f%n ", area);
		
		sc.close();
		
	}

}
