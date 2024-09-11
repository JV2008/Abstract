package classeabstrata;

public class Cachorro extends AtividadeAnimal{

	public Cachorro (String nome, String sexo,String raca) {
		super (nome,sexo,raca);
	}
	@Override
	
	public void dormir() {
		System.out.println("O Cachorro esta dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("O Cachorro está caminhando");
	}
	@Override
	public void correr() {
		System.out.println("O Cachorro está correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Cachorro está latindo");
	}

}
