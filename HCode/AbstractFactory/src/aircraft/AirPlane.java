package aircraft;

public class AirPlane implements IAirCraft{

	@Override
	public void startRoute() {
		wind();
		getCargo();
		System.out.println("Iniciando a decolagem!");
		
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiros a bordo, Voo autorizado!");
		
	}

	@Override
	public void wind() {
		System.out.println("Ventos a 25km.. tudo ok ");
		
	}

}
