package ex3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Integer numero = Integer.valueOf(leitura.nextLine());
		if (numero % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}
	}

}
