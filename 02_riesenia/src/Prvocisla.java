/**
 * prvocisla
 * Rozklad na prvoèísla
 * Napíšte program, ktorý zadané èíslo rozloží na prvoèísla, napríklad 28 = 2*2*7.
 * 
 * Generuj prvoèísla
 * Napíšte program, ktorý do po¾a vygeneruje a vypíše prvoèísla menšie ako konštanta MAX, napr. MAX = 2007. 
 * @author PB
 */
public class Prvocisla {
final static int MAX = 100;	
	public static void main(String[] args) {
		// *** rozklad na prvocisla
		for(int n=1; n<1000; n++) {
			int m = n;
			System.out.print(m + " = ");
			for(int del=2; del <= m; del++)
				if (m % del == 0) {
					System.out.print(del + "*");
					m /= del;
				}
			System.out.println();			
		}
		// *** prvych MAX prvocisiel [pozor, nie je to presne podla zadania ulohy]
		  int cisla[] = new int[MAX];
		    int pocet = 1;
		    cisla[0] = 2;
			int i = 3;
			dalsi:
		    while (pocet < MAX) {
		      for (int j = 1;  j < pocet;  j++)
		        if (i % cisla[j] == 0)
		          continue dalsi;
		      cisla[pocet] = i;
		      pocet++;
		      i += 2;
		    }
		   for (int p:cisla)
			   System.out.print(p+", ");
		   System.out.println();
	}
}
