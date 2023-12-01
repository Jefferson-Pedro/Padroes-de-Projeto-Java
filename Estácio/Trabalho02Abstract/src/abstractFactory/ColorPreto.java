package abstractFactory;

public class ColorPreto implements Color {
	
	public ColorPreto() {
		
		System.out.println(getColor().toString());
	}

	@Override
	public String getColor() {
		return "A cor escolhida foi Preto";
	}

}
