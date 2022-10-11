package ex10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3;
		Scanner leitura = new Scanner(System.in);
		
		String nota11 = leitura.nextLine();
		String nota22 = leitura.nextLine();
		String nota33 = leitura.nextLine();
		
		nota1 = Double.valueOf(nota11);
		nota2 = Double.valueOf(nota22);
		nota3 = Double.valueOf(nota33);
		
		calculoMedia(nota1,nota2,nota3);
		
	}
	
	public static void calculoMedia(double n1, double n2, double n3) {
		double mediafinal = (n1+n2+n3)/3;
		System.out.println("Média final: "+mediafinal);
		if(mediafinal>=6) {
			System.out.println("Aprovado!");
		}
		if(mediafinal>=4 && mediafinal<6) {
			System.out.println("Recuperação!");
		}
		if(mediafinal<4) {
			System.out.println("Reprovado!");
		}
	}

}
