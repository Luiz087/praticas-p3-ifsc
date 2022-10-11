package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Integer[] vetnum = new Integer[10];
		Scanner leitura = new Scanner(System.in);
		Integer menornum = 9999999, maiornum = -999999;

		for (int i = 0; i < 10; i++) {
			Integer num = Integer.valueOf(leitura.nextLine());
			vetnum[i] = num;
			if (num > maiornum) {
				maiornum = num;
			}
			if (num < menornum) {
				menornum = num;
			}
		}
		
		System.out.println("Maior número = "+maiornum);
		System.out.println("Menor número = "+menornum);

	}

}
