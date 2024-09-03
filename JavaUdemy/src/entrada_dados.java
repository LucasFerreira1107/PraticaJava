import java.util.Scanner;

public class entrada_dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String texto1, texto2, texto3;
			
		x = sc.nextInt();
		sc.nextLine();
		texto1 = sc.nextLine();
		texto2 = sc.nextLine();
		texto3 = sc.nextLine();
		
		System.out.println(x);
		System.out.println(texto1);
		System.out.println(texto2);
		System.out.println(texto3);
		
		
		sc.close();
	}

}
