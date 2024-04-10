package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		pi = 3.14159;
		System.out.println("Digite o valor do lado A, B e C: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
		triangulo = (a * c)/2;
		circulo = pi * Math.pow(c, 2);
		trapezio = ((a+b)/2)*c;
		quadrado = b * b;
		retangulo = a * b;
		System.out.printf("TRIANGULO = %.3f%n", triangulo);
		System.out.printf("CIRCULO = %.3f%n", circulo);
		System.out.printf("TRAPEZIO = %.3f%n", trapezio);
		System.out.printf("QUADRADO = %.3f%n", quadrado);
		System.out.printf("RETANGULO = %.3f%n", retangulo);
	}

}
