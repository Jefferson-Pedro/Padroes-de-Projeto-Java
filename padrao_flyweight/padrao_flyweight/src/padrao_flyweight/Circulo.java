package padrao_flyweight;

public class Circulo implements Formas {
	private String cor;
	private int x;
	private int y;
	private int raio;
	
	public Circulo(String cor){
	      this.cor = cor;		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRaio() {
		return raio;
	}
	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	@Override
	   public void desenhar() {
	      System.out.println("Circulo: [Cor : " + cor + ", x : " + x + ", y :" + y + ", raio :" + raio);
	   }
	
}




