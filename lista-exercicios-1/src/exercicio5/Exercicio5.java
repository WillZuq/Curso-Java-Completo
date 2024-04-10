package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
		double valorUnitario1, valorUnitario2, valorPago;
		
		System.out.println("Digite o Codigo, quantidade e valor unitario da primeira peca: ");
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		System.out.println("Digite o Codigo, quantidade e valor unitario da segunda peca: ");
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		sc.close();
		valorPago = quantidadePeca1 * valorUnitario1 + quantidadePeca2 * valorUnitario2;
		System.out.printf("Valor a Pagar = R$ %.2f%n", valorPago);
	}
}
