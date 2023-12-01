package abstractFactory;

public class AnimalPato implements Animal {

	public AnimalPato() {
		System.out.println(getType().toString());
		System.out.println(makeSound().toString());
	}

	@Override
	public String getType() {
		
		return "ave";
	}

	@Override
	public String makeSound() {
		
		return "qua-qua";
	}
	
}
