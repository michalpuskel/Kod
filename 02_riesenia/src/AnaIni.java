import java.util.Arrays;

/**
 * pokus o klasicke riesenie s polami, 
 * umyselne nepouzivajuce java collections (aj keby sa hodili :-)
 * @author PB
 */
public class AnaIni {
	static void pocetnostAna() {
		int[] pocetnost = new int[10000];
		int maxVyskyt = -1;
		Arrays.fill(pocetnost, 0);
		for(int znamka:Anastazia.ana) {			
			pocetnost[znamka]++;
			if (pocetnost[znamka] > maxVyskyt) 
				maxVyskyt = pocetnost[znamka];
		}
		for(int i=0; i<pocetnost.length; i++)
			if (pocetnost[i] == maxVyskyt) 
				System.out.println("maxZnamka: "+i + " vyskytuje sa "+ maxVyskyt + " krat");
	}
	static void bonita() {
		Arrays.sort(Anastazia.ana);
		int poslednaPostupnost = 1;
		int dlzkaPostupnosti = 1;
		int najdlhsiaPostupnost = 1;
		int zaciatokNajdlhsejPostupnosti = 0;
		for(int i=2; i<Anastazia.ana.length; i++)
			if (Anastazia.ana[i] == Anastazia.ana[i-1]) 
				continue;
			else if (Anastazia.ana[i] == 1+ Anastazia.ana[i-1]) {
				dlzkaPostupnosti++;
				if (dlzkaPostupnosti > najdlhsiaPostupnost) {
					najdlhsiaPostupnost = dlzkaPostupnosti;
					zaciatokNajdlhsejPostupnosti = poslednaPostupnost; 
				}
			} else {
				dlzkaPostupnosti = 1;
				poslednaPostupnost = i;
			}
		System.out.println("Najdlhsia postupnost Anastazie ma dlzku :"+najdlhsiaPostupnost+" a zacina "+Anastazia.ana[zaciatokNajdlhsejPostupnosti]);
	}
	static void chybajuce() {
		int[] pocetnost = new int[10000];
		Arrays.fill(pocetnost, 0);		
		int pocet = 0;
		System.out.println("Anastazia nema tieto Izidorove znamky:");
		for(int iziZnamka:Izidor.getIzi())
			if (Arrays.binarySearch(Anastazia.ana,iziZnamka) < 0) {
				System.out.print(iziZnamka + ",");
				pocetnost[iziZnamka]++;
				pocet++;
			}
		System.out.println("\nje ich: "+pocet);
		pocet = 0;
		System.out.println("z toho rozne su tieto:");
		for(int i=0; i<pocetnost.length; i++)
			if (pocetnost[i] > 0) {
				System.out.print(i + ",");
				pocet++;
			}
		System.out.println("\nje ich: "+pocet);
	}

	public static void main(String[] args) {
		pocetnostAna();
		bonita();
		chybajuce();
	}	
}
