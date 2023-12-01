package abstractFactory;

public class Cliente {

	public static void main(String[] args) {
		AnimalFactory a = new AnimalFactory();
		ColorFactory c = new ColorFactory();
		
		c.criarCor();
		a.criarAnimal();
	}

}
