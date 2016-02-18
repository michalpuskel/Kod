
public class Fibonacci {
	/**
	 * @author slama
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 31; i++) {
			System.out.println("Fibonacci("+i+") = "+ fib(i));
		}
	}
	/**
	 * Pocita fibonacciho
	 * @param n "Argument"
	 * @return "Vrati fib cislo"
	 */
	 public static long fib(int n){
		 long a = 0;
		 long b = 1;
		 long res = 0;
		 for (int i = 0; i < n; i++) {
			 res = a +b ;
			 a = b;
			 b = res;
		}
		 return a;
	 }
}
