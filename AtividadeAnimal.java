package classeabstrata;

public abstract class AtividadeAnimal {
	private String nome;
	private String sexo;
	private String raca;

public AtividadeAnimal(String nome,String sexo,String raca) {
	
	this.nome = nome;
	this.sexo = sexo;
	this.raca = raca;
}
//gerar setters e getters
public abstract void dormir();
public abstract void caminhar();
public abstract void correr();
public abstract void emitirSom();
}
