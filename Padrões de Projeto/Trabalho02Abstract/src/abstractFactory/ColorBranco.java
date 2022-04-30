package abstractFactory;

public class ColorBranco implements Color{
	
	public ColorBranco() {
		System.out.println(getColor().toString());
	}

	@Override
	public String getColor() {
		
		return "A cor escolhida foi Branco";
	}
	
}
