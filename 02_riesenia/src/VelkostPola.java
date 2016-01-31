/**
 * velkost dvojrozmerneho pola,
 * Definujte statickú metódu int pocet(int[][] a), ktorá vráti poèet prvkov dvojrozmerného po¾a, 
 * nie nutne obdånikovıch rozmerov AxB. Hint: pole nemusí by obånikové, ale zubaté, tzv. jagged.
 * 
 * vytvor trojuholnikove pole
 * Definujte statickú metódu int[][] triangle(int N), ktorá pre vstupnı parameter N vyrobí a vráti trojuholníkové pole T také:
 * 
 * T[0][0] = 0,
 * T[1][0] = 1, T[1][1] = 2,
 * T[2][0] = 2, T[2][1] = 3, T[2][2] = 4,
 * a vo všeobecnosti T[i][j] = i+j, pre 0 <= j <= i <= N.
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
