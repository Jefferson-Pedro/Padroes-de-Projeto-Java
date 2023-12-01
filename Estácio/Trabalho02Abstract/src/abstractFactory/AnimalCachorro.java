package abstractFactory;

public class AnimalCachorro implements Animal {

	public AnimalCachorro() {
		System.out.println(getType().toString());
		System.out.println(makeSound().toString());
	}

	@Override
	public String getType() {
		
		return "Mamifero";
	}

	@Override
	public String makeSound() {
		
		return "au-au";
	}
	
}
