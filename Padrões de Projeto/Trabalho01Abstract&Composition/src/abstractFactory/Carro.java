package abstractFactory;

public class Carro {
	Radio som;
	Climatizador clima;
	
	public Radio getSom() {
		return som;
	}
	public void setSom(Radio som) {
		this.som = som;
	}
	public Climatizador getClima() {
		return clima;
	}
	public void setClima(Climatizador clima) {
		this.clima = clima;
	}
}
