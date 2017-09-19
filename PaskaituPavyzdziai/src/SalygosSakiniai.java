
public class SalygosSakiniai {

	public static boolean tikrinkArTeigiamas(int sk) {
		return sk > 0;
	}

	public static boolean tikrinkArReziuose(int sk, int r1, int r2) {
		if (r1 > r2) {
			System.out.println("Klaidingi reziai");
			return false;
		}

		if (sk > r1 && sk < r2) {
			System.out.println("Skaicius patenka i rezi");
			return true;
		}
		System.out.println("Skaicius nepatenka");
		return false;

	}

	public static void main(String[] args) {

		// if(2 < 1) System.out.println("Tiesa");

		/*
		 * if(false){ System.out.println("Tiesa"); System.out.println("Tiesa2");
		 * }
		 */

		/*
		 * int skaicius = -1; if (skaicius >= 0) {
		 * System.out.println("Neigiamas"); if (skaicius == 100) {
		 * System.out.println("Simtas"); } } else if(skaicius > 0){
		 * System.out.println("Teigiamas"); }
		 */

		/*
		 * if (sk > 0 && sk == 5) { System.out.println("penki"); }
		 */
		/*int sk = 2 * (2 + 2);

		if (tikrinkArTeigiamas(sk) || tikrinkArTeigiamas(sk)) {
			System.out.println("Teigiamas sk");
		}*/
		
		int a = 1;
		int b = 2;
		int c = 3;
	
		int i = a > b ? a : b;
		
	
		
		
		//System.out.println(tikrinkArReziuose(5,0,9));

	}

}
