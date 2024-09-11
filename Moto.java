package classeabstrata;

public class Moto extends Veiculos {
	
	public Moto (String placa, String modelo,String cor, int ano) {
		super (placa,modelo,cor,ano);
	}
	@Override
	
	public void acelerar() {
		System.out.println("O Onibus está acelerando");
	}
	@Override
	public void virar() {
		System.out.println("O Onibus está virando");
	}
	@Override
	public void frear() {
		System.out.println("O Onibus está freando");
	}
	@Override
	public void ligar() {
		System.out.println("O Onibus está ligado");
	}
	
}
