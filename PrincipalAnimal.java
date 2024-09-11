package classeabstrata;

public class PrincipalAnimal {
	public static void main(String[] args) {

		Lobo lobo  = new Lobo ("Mogli", "Macho","Malamute do Alaska");
	
		lobo.emitirSom();
		System.out.println("-------------------------------------------------");
		
		Leao leao  = new Leao ("Scar", "Macho","Tio do Simba");
		leao.emitirSom();
		System.out.println("-------------------------------------------------");
	
		Tigre tigre  = new Tigre ("Tigresa", "Fêmea","Kung fu panda");
		tigre.emitirSom();
		System.out.println("-------------------------------------------------");

		Cachorro Cachorro  = new Cachorro ("Maximus", "Macho","pit-bull com salsicha");
		Cachorro.emitirSom();
		System.out.println("-------------------------------------------------");
		
		Gato gato  = new Gato ("Garfild", "Macho","Gato de Botas");
		gato.emitirSom();
		System.out.println("-------------------------------------------------");
	
		
		
	}

}



