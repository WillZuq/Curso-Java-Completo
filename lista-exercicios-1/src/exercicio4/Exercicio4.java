package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int id;
		double horaTrabalhada, valorPorHoraTrabalhada, salario;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ID do funcionario: ");
		id = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		horaTrabalhada = sc.nextDouble();
		System.out.println("Digite o valor por hora trabalhada: ");
		valorPorHoraTrabalhada = sc.nextDouble();
		sc.close();
		salario = horaTrabalhada * valorPorHoraTrabalhada;
		System.out.println("ID = " + id);
		System.out.printf("Salario = U$ %.2f%n", salario);

	}

}
