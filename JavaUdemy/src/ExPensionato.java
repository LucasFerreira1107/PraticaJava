import java.util.Locale;
import java.util.Scanner;

public class ExPensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] quartos = new String[10];
		
		System.out.print("Quantos quartos serao utilizados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		String[] email = new String[n];
		
		for(int i=0; i < n; i++ ) {
			System.out.printf("Rent #%d: %n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Email: ");
			email[i] = sc.nextLine();
			
			System.out.print("Quarto: ");
			int numQuarto = sc.nextInt();
			
			quartos[numQuarto] = nome[i] + ", " + email[i];
			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i=0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.printf("%d: %s\n",i,quartos[i]);
			}
		}
		sc.close();
	}

}