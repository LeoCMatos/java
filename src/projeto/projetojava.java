package projeto;

import java.util.Locale;

public class projetojava {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(x);
		System.out.printf("%.3f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);

		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado =  %.2f metros%n", x);
		

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
