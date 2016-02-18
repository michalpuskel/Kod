
public class Trujuholnik {

	public static void main(String[] args) {
		trojuholnik(20);
	}
	public static void trojuholnik(int n){
		for (int i = 0; i < n + 1; i++){
			for (int j = 0; j < n - i; j++){
				System.out.print(' ');
			}
			for (int j = 0; j < 1 + 2 * i; j++){
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}

}
