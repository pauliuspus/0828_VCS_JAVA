package lt.vcs.laivumusis.USSENTERPRISE.vaizdas;

import java.util.List;
import java.util.Map;
import java.util.List;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;

public class Vaizdas implements lt.vcs.laivumusis.common.Vaizdas {

	public Vaizdas(Map<String, List<lt.vcs.laivumusis.common.Langelis>> mapasKuriPiesim) {

	}

	@Override
	public void pieskVaizda() {
		ZaidimoLenta lenta = new ZaidimoLenta();
		System.out.print("  ");
		for (char kordinateX = 'A'; kordinateX <= 'J'; kordinateX++) {
			System.out.print(" " + kordinateX);

		}
		System.out.println();
		for (int kordinateY = 1; kordinateY <= 9; kordinateY++) {
			System.out.print(" " + kordinateY);
			for (int a = 1; a <= 10; a++)
				System.out.print(" #");
			System.out.println();

		}
		System.out.print(10);
		for (int a = 1; a <= 10; a++)
			System.out.print(" #");

	}

	@Override
	public void atnaujinkVaizda() {
		pieskVaizda();
	}

	@Override
	public void isvalyk() {

	}

	public static void main(String[] args) {
//		Vaizdas vaizdas = new Vaizdas();
//		vaizdas.pieskVaizda();
	}

}
