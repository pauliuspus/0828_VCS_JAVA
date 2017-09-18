import java.util.Arrays;

public class MasyvuPavyzdys {

	public static void spausdinkMasyva(int[] masyvas) {
		for (int sk : masyvas) {
			System.out.println(sk);
		}
	}

	public static boolean palyginkMasyvus(int[] m1, int[] m2) {
		
		if(m1 == null || m2 == null){
			return false;
		}
		if(m1 == m2){
			return true;
		}
		
		if (m1.length == m2.length) {
			for (int i = 0; i < m1.length; i++) {
				if(m1[i] != m2[i]){
					return false;
				}
			}
			return true;
		} 
		return false;

	}

	public static void main(String[] args) {

		int[] intMasyvas2 = { 4, 9, 8 };

		int[] intMasyvas = new int[3];
		intMasyvas[0] = 4;
		intMasyvas[1] = 9;
		intMasyvas[2] = 8;

		intMasyvas2 = intMasyvas;
		
		intMasyvas.equals(null);

		if (intMasyvas == intMasyvas2) {
			System.out.println("Lygus");
		} else {
			System.out.println("Nelygus");
		}

		// spausdinkMasyva(intMasyvas);
		// spausdinkMasyva(intMasyvas2);

		/*
		 * for(int i = 0;i<intMasyvas.length;i++){
		 * System.out.println(intMasyvas[i]); intMasyvas[i] = intMasyvas[i] * 2;
		 * } System.out.println("----"); for(int i = 0;i<intMasyvas.length;i++){
		 * System.out.println(intMasyvas[i]); }
		 */

	}

}
