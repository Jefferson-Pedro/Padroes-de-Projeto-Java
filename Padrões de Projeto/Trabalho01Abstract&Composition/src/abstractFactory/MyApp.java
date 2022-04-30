package abstractFactory;

public class MyApp {
	
	private static Carro montarCarro(String tipo) {
		CarroFactory cf = null;
		switch(tipo) {
		case "luxo":
			cf = new CarroLuxoFactory();
			break;
		case "popular":
			cf = new CarroBasicoFactory();
		}
		Carro carro = new Carro();
		carro.setClima(cf.montarClimatizador());
		carro.setSom(cf.montarSom());
		return carro;
	}


	public static void main(String[] args) {
	
		Carro c1 = montarCarro("luxo");
		Carro c2 = montarCarro("popular");
		
	}
}