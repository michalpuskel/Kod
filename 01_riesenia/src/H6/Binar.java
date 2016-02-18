
public class Binar {

	public static long pocet(long binarnecislo) {
		long vysledok=0;
		while(binarnecislo!=0){
			if(binarnecislo%2==1){
				vysledok++;
			}
			binarnecislo=binarnecislo/2;
		}
		return vysledok;
	}
	public static void main(String[] args) {
		System.out.println(pocet(10));
		System.out.println(pocet(15));
		System.out.println(pocet(20));
		// TODO Auto-generated method stub

	}

}
