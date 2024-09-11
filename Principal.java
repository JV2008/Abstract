package classeabstrata;


public class Principal {
	public static void main(String[] args) {

		Carro ferrari  = new Carro ("DER-3214", "La Ferrari","Preto",2024);
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		ferrari.ligar();
		System.out.println("-------------------------------------------------");
		Carro fiat  = new Carro ("ZUK-1230", "Uno com escada","Branco com a logo da Zuknet",2010);
		fiat.acelerar();
		fiat.virar();
		fiat.frear();
		fiat.ligar();
		System.out.println("-------------------------------------------------");
		Onibus marcopolo  = new Onibus ("GRQ-5640", "XB1","Prata",2012);
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		marcopolo.ligar();
		System.out.println("-------------------------------------------------");
		Moto kawasaki  = new Moto ("FGR-620", "Ninja","Verde",2016);
		kawasaki.acelerar();
		kawasaki.virar();
		kawasaki.frear();
		kawasaki.ligar();
	}

}
