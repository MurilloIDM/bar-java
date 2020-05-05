package problemaBar;

import java.util.Locale;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		char sexo;
		double  valorTotal;
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

valorTotal = (cerveja * 5.0) + (refrigerante * 3.0) + (espetinho * 7.0);
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", valorTotal);
		
		if (valorTotal > 30.0) {
			System.out.println("Isento de Couvert");
		} else {
			System.out.println("Couvert = R$ 4.00");
			valorTotal += 4;
		}
		
		if (sexo == 'F') {
			valorTotal += 8.0;
			System.out.printf("Ingresso = R$ 8.00");
		} else  {
			valorTotal+= 10.0;
			System.out.println("Ingresso = R$ 10.00");
		}
		
		System.out.println();
		System.out.printf("%nValor a pagar = R$ %.2f%n", valorTotal);
		
		input.close();
	}

}
