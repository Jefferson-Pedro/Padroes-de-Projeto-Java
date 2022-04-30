package padrao_flyweight;
import java.util.HashMap;

public class GeradorForma {


	   @SuppressWarnings("unchecked")
	   private static final HashMap circuloMap = new HashMap();

	   public static Formas getCirculo(String cor) {
	      Circulo circulo = (Circulo)circuloMap.get(cor);

	      if(circulo == null) {
	    	  
	         circulo = new Circulo(cor);
	         
	         circuloMap.put(cor, circulo);
	         System.out.println("Próximo circulo será criado na cor : " + cor);
	      }
	      return circulo;
	   }
		
}


		

