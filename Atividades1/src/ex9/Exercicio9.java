package ex9;

public class Exercicio9 {

	public static void main(String[] args) {

	}

	public Double calculaAbastecimento(Double qtdLitro, Double precoLitro, Double precoTotal) {
		if (qtdLitro == null || precoLitro == null) {
			System.out.println("Valores nulos inseridos!");
		} else {
			precoTotal = qtdLitro * precoLitro;
		}
		return precoTotal;
	}

}
