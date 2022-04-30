package abstractFactory;

import java.util.Scanner;

public class ColorFactory implements AbstractFactory {
	
	private String cor;
	Scanner ler = new Scanner(System.in);
	

	@Override
	public Color criarCor() {
		System.out.println("Qual a cor escolhida? ");
		cor = ler.nextLine().toLowerCase();
			switch(cor) {
			case "branco":
				return new ColorBranco();
			case "azul":
				return new ColorAzul();
			case "preto":
				return new ColorPreto();
			default:
				System.out.println("Escolha invalida");
				return null;
			}
		}

	@Override
	public Animal criarAnimal() {
		// TODO Auto-generated method stub
		return null;
		}
}

	


