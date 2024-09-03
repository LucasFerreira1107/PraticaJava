import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), in = 0,out =0;
		
		for (int i = 0; i < n; i ++) {
			
			System.out.println("Digite um valor para x: ");
			int x = sc.nextInt();
			
			if (x >= 10.0 && x <= 20.0) {
				in += 1;
				
			}
			else {
				out += 1;
			}
		}

		System.out.println( in +" in");	
		System.out.println(out + " out");	
		sc.close();
	}

}
