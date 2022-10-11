package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList <>();
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			lista.add(leitura.nextLine());
		}
		
		for (String listaL : lista) {
			System.out.println(listaL);
		}
		
		System.out.println("Tamanho da lista = "+lista.size());
	}

}
