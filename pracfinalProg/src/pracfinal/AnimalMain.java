package pracfinal;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		
		ArrayList<Gato> gatos = new ArrayList<>();
		ArrayList<Cachorro> cachorros = new ArrayList<>();

		Gato gato1 = new Gato();
		gato1.setNome("Rogério");
		gato1.setPatas(4);
		gato1.setRaca("Gato de Rua");
		gato1.setEcossistema("Rua");
		gato1.setCor("Cor do Garfield, quando está limpo");
		gato1.setComprimento(25.0f);
		gatos.add(gato1);
		
		Gato gato2 = new Gato();
		gato2.setNome("Borges");
		gato2.setPatas(4);
		gato2.setRaca("Gato Siamês");
		gato2.setEcossistema("Casa");
		gato2.setCor("Preto e creme");
		gato2.setComprimento(20.0f);
		gatos.add(gato2);
		
		Gato gato3 = new Gato();
		gato3.setNome("Robert");
		gato3.setPatas(4);
		gato3.setRaca("Gato Don Sphynx");
		gato3.setEcossistema("Apartamento");
		gato3.setCor("Cor da pele dele, ué");
		gato3.setComprimento(15.0f);
		gatos.add(gato3);
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("André");
		cachorro1.setPatas(4);
		cachorro1.setRaca("vira-lata");
		cachorro1.setEcossistema("O mais perigoso possível");
		cachorro1.setCor("Depende da cor da sujeira no pelo dele");
		cachorro1.setComprimento(50.0f);
		cachorros.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Fabiano");
		cachorro2.setPatas(2);
		cachorro2.setRaca("Grupo Hound");
		cachorro2.setEcossistema("Conforto de sua casa (só tem 2 patas porque usa cadeira de rodas!)");
		cachorro2.setCor("Meio preto, meio marrom");
		cachorro2.setComprimento(15.0f);
		cachorros.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Otávio");
		cachorro3.setPatas(4);
		cachorro3.setRaca("Pastor alemão");
		cachorro3.setEcossistema("Quintal da casa de um velho");
		cachorro3.setCor("Preto");
		cachorro3.setComprimento(40.0f);
		cachorros.add(cachorro3);
		
		for (Gato gato : gatos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getPatas());
			System.out.println(gato.getRaca());
			System.out.println(gato.getEcossistema());
			System.out.println(gato.getCor());
			System.out.println(gato.getComprimento());
			gato.mia();
			System.out.println("\n");
		}
		
		for (Cachorro cachorro : cachorros) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getPatas());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getEcossistema());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getComprimento());
			cachorro.late();
			System.out.println("\n");
		}
		
	}

}
