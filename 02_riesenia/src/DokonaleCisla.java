/**
 * Dokonale cisla
 * ��slo vol�me dokonal�, ak s��et jeho delite�ov je rovn� tomuto ��slu. 
 * Zistite, �i zadan� ��slo N je dokonal�. 
 * Napr�klad 6=1+2+3, 28=1+2+4+7+14 s� dokonal�. N�jdite a vyp�te dokonal� ��sla (nie v�etky :-). 
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
