/**
 * priklad na realokaciu pola, 
 * na kopirovanie pola pouzijeme z triedy 
 * System metodu arraycopy
 * @author PB
 * @version 2009
 */

public class Reallocate1 {
  static int[] pole = new int[10];				// staticke pole inicializovane na dlzku 10
  static int pocet = 0;							// pocet zapisanych prvkov v poli

  static void pridajDoPola(int x) {
	if (!(pocet < pole.length)) {				// ak uz je pole plne
		int[] novePole = new int[2*pole.length];// realouj pole, t.j.	
			System.arraycopy(pole, 0, novePole, 0, pole.length);// prekopiruj do neho hodnoty stareho pola
		pole = novePole;						// zahod stare pole
	}
	pole[pocet++] = x;							// pridaj prvok
  }

  public static void main(String[] args) {
    for(int i=0; i<100; i++) {
    	pridajDoPola(i%10);
    	for(int elem:pole) System.out.print(elem);
    	System.out.println();
    }
   }
}
