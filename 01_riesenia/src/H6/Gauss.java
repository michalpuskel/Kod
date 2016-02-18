
public class Gauss {

	public static void main(String[] args) {
		System.out.print(sucet(1,100));
	}
	public static long sucet(long from, long to) {
	    	return ((from+to)*(to-from+1))/2;
	}
}
