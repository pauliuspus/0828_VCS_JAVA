package lt.vcs.andrius.namudarbai;

public class KetvirtosPaskaitosNamuDarbai {

	public static int keliazenklisSkaicius(int sk) {

		int keliazenklis = 0;
		while (sk > 0) {
			System.out.println(sk);
			sk = sk / 10;
			keliazenklis++;
		}

		return keliazenklis;
	}

	public static void spausdinkKartotinius(int sk, int n) {
		/*
		 * for(int i =1; i <= n; i++){ System.out.println(sk*i); }
		 */

		for (int i = 1; n > 0; i++) {
			if (i % sk == 0) {
				System.out.println(i);
				n--;
			}
		}
	}

	public static void spausdinkGroteles(int x, int y) {
		for (int i = 0; i < y; i++) {
			if (i % 2 == 1) {
				System.out.print(" ");
			}
			for (int k = 0; k < x; k++) {
				System.out.print("# ");
			}
			System.out.println("");
		}
	}

	public static int[][] pagaminkDaugybesLentele(int n) {
		int[][] lentele = new int[n][n];
		for (int i = 0; i < lentele.length; i++) {
			for (int k = 0; k < lentele[i].length; k++) {
				lentele[i][k] = (i + 1) * (k + 1);
			}
		}

		return lentele;
	}

	public static void spausdinkDvimati(int[][] m) {
		for (int[] masyvas : m) {
			for (int sk : masyvas) {
				System.out.print(sk + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int sk = 1234567;
		// System.out.println(keliazenklisSkaicius(sk));

		// spausdinkKartotinius(3, 5);

		// spausdinkGroteles(3,5);

		int[][] masyvas = pagaminkDaugybesLentele(99);

		spausdinkDvimati(masyvas);

	}

}
