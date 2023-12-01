package abstractFactory;

public class CarroLuxoFactory extends CarroFactory{
	
	
	public Radio montarSom() {
		return new RadioPremium();		
	}

	
	public Climatizador montarClimatizador() {
		return new ClimatizadorPremium();
		
	}


}