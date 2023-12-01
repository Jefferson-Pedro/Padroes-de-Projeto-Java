package abstractFactory;

import java.util.Scanner;

public class AnimalFactory implements AbstractFactory{
	
	private String tipo;
	Scanner ler = new Scanner(System.in);
	
	
	@Override
	public Animal criarAnimal() {
		System.out.println("Qual o tipo de animal: ");
		tipo = ler.nextLine().toLowerCase();
		switch(tipo) {
		case "cachorro":
		    return new AnimalCachorro();
		    
		case "urso":
			return new AnimalUrso();
			
		case "pato":
			return new AnimalPato();
		default:
			System.out.println("Escolha invalida");
			return null;
		}

	}

	@Override
	public Color criarCor() {
		// TODO Auto-generated method stub
		return null;
	}
}


