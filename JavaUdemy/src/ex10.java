import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int horarioInicial, horarioFinal, resultado;
		
		System.out.println("Digite o horario inicial do jogo:");
		horarioInicial = sc.nextInt();
		
		System.out.println("Digite o horario final do jogo:");
		horarioFinal = sc.nextInt();
		
		if (horarioInicial < horarioFinal) {
			resultado = horarioFinal - horarioInicial;
		}
		else {
			resultado = 24 - horarioInicial + horarioFinal;
		}
		sc.close();
		
		System.out.print("  O JOGO DUROU " + resultado + " HORA(S)");
	}

}
