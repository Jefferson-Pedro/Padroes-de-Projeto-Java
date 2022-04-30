package padrao_flyweight;

public class Flyweight {
   
	private static final String cor[] = { "Vermelho", "Verde", "Azul", "Branco", "Preto" };
	public static void main(String[] args) {

      for(int i=0; i < 20; ++i) {
         Circulo circulo = (Circulo)GeradorForma.getCirculo(getRandomCor());
         circulo.setX(getRandomX());
         circulo.setY(getRandomY());
         circulo.setRaio(100);
         circulo.desenhar();
      }
   }
   private static String getRandomCor() {
      return cor[(int)(Math.random()*cor.length)];
   }
   private static int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
}
