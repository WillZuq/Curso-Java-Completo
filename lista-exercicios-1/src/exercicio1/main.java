package exercicio1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int n1, n2 , SOMA;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo nome: ");
		n2 = sc.nextInt();
		sc.close();
		SOMA = n1 + n2;
		System.out.println("SOMA = " + SOMA);
		
		
	}

}
