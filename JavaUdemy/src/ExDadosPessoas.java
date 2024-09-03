import java.util.Locale;
import java.util.Scanner;

public class ExDadosPessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		
		char[] genero = new char[n];
		double[] altura = new double[n];
		
		for(int i=0; i < n; i++) {
			System.out.print("Altura da "+ (i + 1) +"a pessoa: ");
			altura[i] = sc.nextDouble();
			
			System.out.print("Genero da "+ (i + 1) +"a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double maiorAltura = altura[0];
		double menorAltura = altura[0];
		double soma = 0.0;
		int quantidadeM = 0;
		int quantidadeF = 0;
		
		for(int i=0; i < altura.length; i++) {
			if(altura[i] > maiorAltura ) {
				maiorAltura = altura[i];
			}
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			
			if(genero[i] == 'F') {
				soma += altura[i];
				quantidadeF += 1;
			}else {
				quantidadeM += 1;
			}

			
		}
		
		double mediaAlturaF = soma /quantidadeF;
		
		System.out.println("Menor altura =  " + menorAltura);
		System.out.println("Maior altura =  " + maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaF);
		System.out.println("Numero de homens = " + quantidadeM);

		
		sc.close();
	}

}
