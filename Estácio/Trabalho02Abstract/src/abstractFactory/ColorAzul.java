package abstractFactory;

public class ColorAzul implements Color{
	
	
	public ColorAzul() {
		System.out.println(getColor().toString());
	}

	@Override
	public String getColor() {
		return "A cor escolhida foi Azul";
	}

}
