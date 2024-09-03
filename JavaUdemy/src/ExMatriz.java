import java.util.Scanner;

public class ExMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		int contadorNegativo = 0;
		
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j< matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
				
				if(matrix[i][j] < 0) {
					contadorNegativo++;
				}
			}
		}
		
		System.out.println("Diagonal principal:");
		for(int i=0; i < matrix.length;i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		System.out.println();
		System.out.print("Quantidade de numeros negativos: " + contadorNegativo);
		
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i=m; i == m; i++) {
			for(int j = c; j==c; j++) {
				System.out.print(matrix[i][j]);
			}
		}
		sc.close();
	}

}
