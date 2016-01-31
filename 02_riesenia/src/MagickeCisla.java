/**
 * Magicke cisla
 * Èíslo nazývame magické, ak každá cifra v jeho desiatkovom zápise je aritmetickým priemerom 
 * susedných dvoch cifier. Napríklad, 12345 a 741 sú magické. Zistite, èi zadané èíslo N je magické.
 * @author PB
 */
public class MagickeCisla {
    public static void main(String[] args) {
	  //for(int n=100; n < 100000000; n++) {
    	for(int n=100; n < 100000; n++) {
    		int m = n;
    		int a = m%10;
    		int b = (m/10)%10;
    		do {
    			m /= 10;
    			if (m < 10) {
    				System.out.println("cislo "+n+" je magicke");
    				break;
    			}
    		} while( (m%10) - (m/10)%10 == a-b );
    	}
    }
}
