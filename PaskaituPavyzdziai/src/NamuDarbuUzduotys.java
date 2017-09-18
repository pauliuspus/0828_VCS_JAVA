import java.util.Scanner;

public class NamuDarbuUzduotys {

	public static void skaiciuokIvedamusVienazenklius() {
		int[] masyvas = new int[11];

		Scanner s = new Scanner(System.in);

		while (true) {
			int nuskaitytasSk = s.nextInt();
			if (nuskaitytasSk > 10 || nuskaitytasSk < -1) {
				System.out.println("Ivestas neteisingas skaicius");
				continue;
			}

			if (nuskaitytasSk == -1) {
				System.out.println("Baigiame darba");
				break;
			}

			masyvas[nuskaitytasSk]++;
		}
		for (int i = 0; i < masyvas.length; i++) {
			System.out.println(i + "->" + masyvas[i]);
		}

	}

	public static int ieskokSkaiciaus(int[] masyvas, int ieskomasSk) {
		for (int i = 0; i < masyvas.length; i++) {
			if (masyvas[i] == ieskomasSk) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] argv) {

		int[] masyvas = { 1, 5, 8 };
		ieskokSkaiciaus(masyvas, 6);
	}
}
