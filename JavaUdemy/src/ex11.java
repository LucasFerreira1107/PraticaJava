import java.util.Scanner;

public class ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codigo;
		double total = 0,quantidade;
		
		System.out.println("Digite o codigo do produto: ");
		codigo = sc.nextInt();
		
		System.out.println("Digite a qunatidade do produto escolhido:");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4 ;
		}
		else if (codigo == 2){
			total = quantidade * 4.50;
			
		}else if (codigo == 3){
			total = quantidade * 5;
			
		}else if (codigo == 4){
			total = quantidade * 2;
			
		}else if (codigo == 5){
			total = quantidade * 1.5;
		
		}
		
		System.out.printf("TOTAL: R$ %.2f%n",total);
		
		sc.close();
	}
}
