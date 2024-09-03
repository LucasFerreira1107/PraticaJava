import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da linha: ");
		int m = sc.nextInt();
		System.out.print("Digite o valor da coluna: ");
		int n = sc.nextInt();
		
		int[][] matrix = new int[m][n];
		
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Escolha um numero da matiz: ");
		int num = sc.nextInt();
		
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j < matrix[i].length; j++) {
				if(matrix[i][j] == num) {
					System.out.println();
					System.out.printf("Position: %d,%d", i,j);
					System.out.println();
					
					if(i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if(j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if( i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
					if(j < matrix[i].length -1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
				}
				
			}
		}
		
		sc.close();
	}

}
