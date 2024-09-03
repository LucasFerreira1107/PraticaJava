import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,d, diferenca; 
		
		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		
		System.out.println("Digite o valor de D:");
		d = sc.nextDouble();
		
		diferenca = (a * b) - (c * d);
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
		
	}
	
}
