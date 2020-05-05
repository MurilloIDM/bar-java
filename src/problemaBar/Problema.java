package problemaBar;

import java.util.Locale;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		char sexo;
		int cerveja, refrigerante, espetinho;
		
		System.out.print("Informe seu sexo (M ou F): ");
		sexo = input.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		
		System.out.print("Quantidade de cervejas: ");
		cerveja = input.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refrigerante = input.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espetinho = input.nextInt();

		input.close();
	}

}
