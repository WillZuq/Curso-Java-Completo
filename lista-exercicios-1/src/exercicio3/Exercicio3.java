package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		System.out.println("Digite o primeiro numero(A): ");
		A = sc.nextInt();
		System.out.println("Digite o segundo numero(B): ");
		B = sc.nextInt();
		System.out.println("Digite o terceiro numero(C): ");
		C = sc.nextInt();	
		System.out.println("Digite o quarto numero(D): ");
		D = sc.nextInt();
		sc.close();
		DIFERENCA = A*B-C*D;
		System.out.println("DIFERENCA = " + DIFERENCA);
		
	}

}
