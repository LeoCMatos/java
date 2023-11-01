package projeto;

import java.util.Scanner;

public class projeto4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		System.out.print("Digite um nome: ");
		x = sc.next();
		System.out.println("Nome digitado: " + x);
		
		int z;
		System.out.print("Digite uma idade: ");
		z = sc.nextInt();
		System.out.println("Idade digitada: " + z);
		
		
		double y;
		System.out.print("Digite um salário: ");
		y = sc.nextDouble();
		System.out.printf("Salário digitado: %.2f%n", y);
		
		char g;
		System.out.print("Digite seu sexo: ");

		g = sc.next().charAt(0);
		
		System.out.println("Sexo digitado: " + g);
		
		System.out.println("A pessoa tem o nome de " + x + " e tem idade de " + z + " anos e recebe " + z  + " de salário e é do sexo " + g);
		
		sc.close();
	}

}
