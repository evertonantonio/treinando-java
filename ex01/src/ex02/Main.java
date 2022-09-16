package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
		String nome = sc.nextLine();
		System.out.print("Digite a salário bruto do funcionário: R$");
		double salarioBruto = sc.nextDouble();
		System.out.print("Digite o valor do imposto: R$");
		double imposto = sc.nextDouble();
		
		Salario s = new Salario(nome, salarioBruto, imposto);
		
		System.out.println(s.getSalarioBruto());
		System.out.println(s.salarioLiquido());
		s.aumentaSalario(5);
		System.out.println(s.getSalarioBruto());
		System.out.println(s.salarioLiquido());
	}
}
