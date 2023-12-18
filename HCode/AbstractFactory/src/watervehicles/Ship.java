package watervehicles;

public class Ship implements IWaterTransport{

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando a navegação...");
		
	}

	@Override
	public void getCargo() {
		System.out.println("A carga foi carregada completamente no navio!");
		
	}

	@Override
	public void sea() {
		System.out.println("Mar calmo, podemos navegar!");
	}	
}
