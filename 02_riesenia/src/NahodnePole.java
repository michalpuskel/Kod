import java.util.*;

/**
 * nahodne pole
 * @author PB
 */
public class NahodnePole {
	public static void main(String[] args) throws Exception {
	   try {
	     int NN = Integer.parseInt(args[0]);	// prekonvertovanie argumentu
	     int[] pole = new int[NN];
	     Random rand = new Random();
	     for(int i=0; i<pole.length; i++)
		   pole[i] = rand.nextInt(NN);
	     System.out.print("Nahodne pole: ");
	     for (int p:pole)
		     System.out.print(p+", ");
	   } catch (Exception e) {
		     System.out.print("Musis zadat jeden cisleny argument !");
		     throw e;
	   }
	}
}
