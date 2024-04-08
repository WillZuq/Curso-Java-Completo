package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		pi = 3.14159;
		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		sc.close();
		area = pi * Math.pow(raio, 2);
		System.out.printf("A = %.4f%n", area);

	}

}
