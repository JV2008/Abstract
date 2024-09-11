package classeabstrata;

public class Leao extends AtividadeAnimal {

	public Leao (String nome, String sexo,String raca) {
		super (nome,sexo,raca);
	}
	@Override

	public void dormir() {
		System.out.println("O Leao esta dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("O Leao está caminhando");
	}
	@Override
	public void correr() {
		System.out.println("O Leao está correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Leao está rugindo");
	}

}
