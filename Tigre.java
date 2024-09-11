package classeabstrata;

public class Tigre  extends AtividadeAnimal {

	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("O Lobo esta dormindo");

		
	}

	@Override
	public void caminhar() {
		// TODO Auto-generated method stub
		System.out.println("O Lobo está caminhando");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("O Lobo está correndo");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("O Lobo está rugindo");

	}

}
