import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			if(i % 2 != 0) {
				System.out.println("O valor de x: " +i);
			}
		sc.close();	
		
		}
		
	}

}
