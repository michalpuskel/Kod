/**
 * Dokonale cisla
 * Èíslo voláme dokonalé, ak súèet jeho delite¾ov je rovný tomuto èíslu. 
 * Zistite, èi zadané èíslo N je dokonalé. 
 * Napríklad 6=1+2+3, 28=1+2+4+7+14 sú dokonalé. Nájdite a vypíšte dokonalé èísla (nie všetky :-). 
 * @author PB
 */
public class DokonaleCisla {
	public static void main(String[] args) {
		for(int n=1; n < 10000; n++) {
		  int sum = 0;
		  for(int del=1; del <= n/2; del++)
			  if (n % del == 0)
				  sum += del;
		  if (sum == n)
			  System.out.println("cislo "+n+" je dokonale");
		}
	}
}
