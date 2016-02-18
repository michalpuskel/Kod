
public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cislo(0));
	}
	
	public static long cislo(int n) {
		long nc = 0;
		int k = n/2; 
		long a = Faktorial.factorial(n);
		long b = Faktorial.factorial(n-k);
		long c = Faktorial.factorial(k);
		
		nc = a/(b*c);
		
		return nc;
	}
}
