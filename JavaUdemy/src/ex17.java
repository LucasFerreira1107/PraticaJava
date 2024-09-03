import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int gasolina = 0, diesel = 0, alcool = 0, abastecimento = 0;
		
		while (abastecimento != 4) {
			
			System.out.println("Digite o qual combustivel o cliente abasteceu:");
			System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
			abastecimento = sc.nextInt();
			
			if (abastecimento == 1) {
				alcool += 1; 
			}
			else if (abastecimento == 2) {
				gasolina += 1;
			}
			else if (abastecimento == 3) {
				diesel += 1;
			}
			else if (abastecimento > 4) {
				System.out.println("Digite um numero valido!!!");
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		
		sc.close();

	}

}
