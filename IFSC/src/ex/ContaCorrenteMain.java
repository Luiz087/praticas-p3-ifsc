package ex;

import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ContaCorrente pessoa = new ContaCorrente();

		System.out.println("Digite seu nome: ");
		pessoa.nome = scanner.nextLine();
		System.out.println("Digite seu CPF: ");
		pessoa.cpf = scanner.nextLong();
		System.out.println("Digite o número da sua conta: ");
		pessoa.numconta = scanner.nextLong();
		System.out.println("Informe seu saldo: ");
		pessoa.saldo = scanner.nextFloat();

		System.out.println("Você deseja realizar qual ação:");
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Visualizar dados");
		int i = scanner.nextInt();
		int j;
		
		do {
			if (i == 1) {
				System.out.println("Digite o quanto você deseja sacar: ");
				Float quant = scanner.nextFloat();
				pessoa.sacar(quant);
				System.out.println(pessoa.saldo);
			}
			
			if (i == 2) {
				System.out.println("Digite o quanto você deseja depositar: ");
				Float quant = scanner.nextFloat();
				pessoa.depositar(quant);
				System.out.println(pessoa.saldo);
			}
			
			if (i == 3) {
				pessoa.mostrarDados();
			}
			
			System.out.println("Deseja mais alguma informação/alteração?");
			System.out.println("Se sim, digite 1, senão, digite 2: ");
			j = scanner.nextInt();
			if(j == 1) {
				System.out.println("Você deseja realizar qual ação:");
				System.out.println("1 - Sacar");
				System.out.println("2 - Depositar");
				System.out.println("3 - Visualizar dados");
				i = scanner.nextInt();
			}
		}
		while(j == 1);
		System.out.println("Sessão finalizada!");
		
	}

}
