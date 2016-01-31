/**
 * velkost dvojrozmerneho pola,
 * Definujte statick� met�du int pocet(int[][] a), ktor� vr�ti po�et prvkov dvojrozmern�ho po�a, 
 * nie nutne obd�nikov�ch rozmerov AxB. Hint: pole nemus� by� ob�nikov�, ale zubat�, tzv. jagged.
 * 
 * vytvor trojuholnikove pole
 * Definujte statick� met�du int[][] triangle(int N), ktor� pre vstupn� parameter N vyrob� a vr�ti trojuholn�kov� pole T tak�:
 * 
 * T[0][0] = 0,
 * T[1][0] = 1, T[1][1] = 2,
 * T[2][0] = 2, T[2][1] = 3, T[2][2] = 4,
 * a vo v�eobecnosti T[i][j] = i+j, pre 0 <= j <= i <= N.
 * @author PB
 */
public class VelkostPola {
static int counter = 0;		// pomocne pocitadlo pre kontrolu

	/**
	 * spocita velkost dvojrozmerneho pola
	 */
    public static int velkostPola(int[][] a) {
        int s = 0;	
        for(int i=0; i<a.length; i++)
      	  s+=a[i].length;
        return s;
      }
      /**
       * vytvori trojuholnikove pole
       */
      public static int[][] triangle(int N) {
        int[][] t = new int[N+1][];
        for(int i=0; i < t.length; i++) {
      	 t[i] = new int[i+1];
      	 for(int j=0; j < t[i].length; j++) {
      		 t[i][j] = i+j;
      		 counter++;	// kontrolny hack ;-)
      	 }
        }
        return t;
      }	
  public static void main(String[] args) {
	   // triangle
	   int[][] T = triangle(10);
	   // vypis pole
	   for(int[] riadok:T) {
		   for(int prvok:riadok)
			   System.out.print(prvok+", ");
		   System.out.println();
	   }
	   // velkost pola
	   System.out.println("Velkost pola T="+velkostPola(T) + "=" + counter);    
  }
}
