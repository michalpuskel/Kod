/**
 * priklad na jednorozmerne pole
 * @author PB
 * @version 2009
 */
public class Jednoduche {

 public static void main(String[] args) {
 final int MAX = 20;				// kon�tanta � ve�kos� po�a

 // int[] poleInt; 					// defin�cia po�a 
 // poleInt = new int[MAX];			// vytvorenie po�a
 int[] poleInt = new int[MAX];			// defin�cia po�a s vytvoren�m
    for (int i = 0;  i < poleInt.length;  i++) {	// i < MAX
      poleInt[i] = i + 1;				// inicializ�cia po�a
      System.out.print(poleInt[i] + "  ");
    } // for
  }  // main
} // class}
