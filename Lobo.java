package classeabstrata;

public class Lobo extends AtividadeAnimal {

	public Lobo (String nome, String sexo,String raca) {
		super (nome,sexo,raca);
	}
	@Override
	
	public void dormir() {
		System.out.println("O Lobo esta dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("O Lobo está caminhando");
	}
	@Override
	public void correr() {
		System.out.println("O Lobo está correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Lobo está uivando");
	}

}
