package abstractFactory;

public class AnimalUrso implements Animal {
	
	public AnimalUrso() {
		System.out.println(getType().toString());
		System.out.println(makeSound().toString());
	}

	@Override
	public String getType() {
		
		return "Mam�fero";
	}

	@Override
	public String makeSound() {
	
		return "ruuu";
	}
	
}
