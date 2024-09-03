package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Bank(number, initialDeposit, holder);
		}
		else {
			account = new Bank(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.depositAccount(sc.nextDouble());
		
		System.out.println();
		System.out.println("Update data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.saqueAccount(sc.nextDouble());

		System.out.println();
		System.out.println("Update data:");
		System.out.println(account.toString());
		
		sc.close();
	}

}
