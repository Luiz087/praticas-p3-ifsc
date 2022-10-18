package ifsc;

public class MainPessoa {

	public static void main(String[] args) {

		Professor prof1 = new Professor();
		Aluno aluno1 = new Aluno();

		aluno1.setMatricula(123456789);
		aluno1.setCpf("85724728564");
		aluno1.setNome("Luiz");
		prof1.setCpf("75824592384");
		prof1.setNome("Bruna");
		prof1.setSiape(238547823);

		System.out.println("Nome aluno(a): " + aluno1.getNome());
		System.out.println("CPF aluno(a): " + aluno1.getCpf());
		System.out.println("Matrícula aluno(a): " + aluno1.getMatricula());
		System.out.println("\n");
		System.out.println("Nome professor(a): " + prof1.getNome());
		System.out.println("CPF professor(a): " + prof1.getCpf());
		System.out.println("Siape professor(a): " + prof1.getSiape());
	}

}
