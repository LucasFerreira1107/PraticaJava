import java.util.Locale;
import java.util.Scanner;

public class ExMaisVelho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		String nomeMaisVelho = "";
		int contador = 0;
		
		for(int i=0; i < nome.length; i++) {
			System.out.println("Dados da "+ ( i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		
			if(idade[i] > contador) {
				contador = idade[i];
				nomeMaisVelho = nome[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nomeMaisVelho);
		sc.close();
	}

}
