import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, horasTrabalhadas;
		
		double ganhoHora, salario;
		
		System.out.println("Digite o Numero do funcionario:");
		numFuncionario = sc.nextInt();
		
		System.out.println("Digite o numero de horas tralhadas:");
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Digite o ganho por hora");
		ganhoHora = sc.nextDouble();
		
		salario = horasTrabalhadas * ganhoHora;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.println("SALARY = U$ " + salario);
		
		sc.close();
	}

}
