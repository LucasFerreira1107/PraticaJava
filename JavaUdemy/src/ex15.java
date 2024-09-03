import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		
		while (senha != 2002) {
			
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
			
			if (senha != 2002) {
				System.out.println("Senha Invalida");
			}
			
		} 
		System.out.print("Acesso permitido");
		sc.close();

	}

}
