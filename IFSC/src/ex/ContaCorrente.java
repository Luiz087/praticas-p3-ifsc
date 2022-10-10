package ex;

public class ContaCorrente {

	public String nome;
	public Long cpf;
	public Long numconta;
	public Float saldo;

	public Float sacar(Float valor) {
		if(valor>saldo) {
			System.out.println("Saldo insuficiente!");
		} else {
			saldo -= valor;
		}
		return saldo;
	}

	public Float depositar(Float valor) {
		saldo += valor;
		return saldo;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Número da conta: " + numconta);
		System.out.println("Saldo atual: " + saldo);
	}

}
