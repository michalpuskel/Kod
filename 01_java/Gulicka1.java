/**
 * nestrukturovany priklad
 * @author PB
 * @version  2009
 */
public class Gulicka1 {
	/** 
	 * definicia hlavneho programu musi zacinat <code>public static void main(String[] args)</code>
	 */
	public static void main(String[] args) {
		double x=0.0, y=5.0, fi=0.56; // definicia troch realnych premennych s inicializaciou hodnot
		int t;						  // definicia celociselnej premennej cyklu
		for (t=0; t<10; t++) {			// cyklus <code>for t=0 to 9 do</code>
			x += Math.cos(fi);			// priradenie <code>x = x+cos(fi)</code>
			y += Math.sin(fi);			// priradenie <code>y = y+sin(fi)</code>
		}
		System.out.println("done");
	}
}
