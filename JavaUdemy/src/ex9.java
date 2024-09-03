import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite dois numeros inteiros");
		
		System.out.println("Digite o numero A:");
		a = sc.nextInt();
		
		System.out.println("Digite o numero B:");
		b = sc.nextInt();
		
		if ((a % b == 0) || (b % a == 0) ){
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
