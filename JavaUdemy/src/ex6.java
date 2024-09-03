import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, pi = 3.14159;
		double areaTriangulo, areaTrapezio, areaCirculo, areaQuadrado, areaRetangulo;
		
		// Atribuindo valor a variaveis
		System.out.print("Digite o valor de A: ");
		a = sc.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		c = sc.nextDouble();
		
		//Area do triangulo
		areaTriangulo = (a * c)/2;
		
		//Area do trapezio
		areaTrapezio = (a + b) * c / 2; 		
		
		//Area do quadrado
		areaQuadrado = Math.pow(b, 2);
		
		//Area do retangulo
		areaRetangulo = a * b;
		
		//area do circulo
		areaCirculo = pi * Math.pow(c,2);
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		
		sc.close();
	}
}
