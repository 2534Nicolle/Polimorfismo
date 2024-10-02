package Heranca;

public class principalAnimal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo ("Lobo mal", "M", "Qualquer");
		lobo.emitirSom();
		
		Leao leao = new Leao ("Mufasa", "M", "Qualquer");
		leao.emitirSom();
		
		Tigre tigre = new Tigre ("Tigrinho", "M", "Qualquer");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro ("Pateta", "M", "Qualquer");
		cachorro.emitirSom();
		
		Gato gato = new Gato ("Mingau", "M", "Qualquer");
		gato.emitirSom();

	}

}
