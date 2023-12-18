package watervehicles;

public class Ferry implements IWaterTransport{

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando navegação...");
	}

	@Override
	public void getCargo() {
		System.out.println("Pegamos os passageiros da balsa, estamos prontos!");
	}

	@Override
	public void sea() {
		System.out.println("Mar calmo, podemos navegar!");
	}

}
