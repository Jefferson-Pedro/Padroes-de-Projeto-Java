package abstractFactory;

public class CarroBasicoFactory extends CarroFactory{
	private String model;
	
	public Radio montarSom() {
		return new RadioBasico();
		
	}

	@Override
	public Climatizador montarClimatizador() {
		return new ClimatizadorBasico();
	}

	
	public void status() {
		System.out.println("Modelo do carro: " + model);
	}
	
}