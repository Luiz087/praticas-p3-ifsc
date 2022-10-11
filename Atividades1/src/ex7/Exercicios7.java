package ex7;

import java.util.Iterator;

public class Exercicios7 {

	public static void main(String[] args) {

		String[] vet = new String[10];
		vet[0] = "maçã";
		vet[1] = "banana";
		vet[2] = "uva";
		vet[3] = "melão";
		vet[4] = "abacate";
		vet[5] = "melancia";
		vet[6] = "pera";
		vet[7] = "jaca no palito";
		vet[8] = "avião";
		vet[9] = "castelo";

		for (int i = 0; i < 9; i++) {
			System.out.println("Vetor " + (i + 1) + " = " + vet[i]);
		}
		System.out.println("Vetor 10 = " + vet[9]);
	}

}
