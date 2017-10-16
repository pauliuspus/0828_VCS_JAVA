package lt.vcs.laivumusis.USSENTERPRISE.vaizdas;

import java.util.List;
import java.util.Map;
import java.util.List;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;

public class Vaizdas implements lt.vcs.laivumusis.common.Vaizdas {
	String[] abecele = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
	Map<String, List<lt.vcs.laivumusis.common.Langelis>> mapasKuriPiesim;

	public Vaizdas(Map<String, List<lt.vcs.laivumusis.common.Langelis>> mapasKuriPiesim) {
		this.mapasKuriPiesim = mapasKuriPiesim;
	}

	@Override
	public void pieskVaizda() {
		System.out.print("  ");
		for (char kordinateX = 'A'; kordinateX <= 'J'; kordinateX++) {
			System.out.print(" " + kordinateX);
		}
		System.out.println();
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			System.out.print(" " + kordinateY);
			for (String kordinateX : abecele) {
				System.out.print(((lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis) mapasKuriPiesim.get(kordinateX)
						.get(kordinateY - 1)).getlangelioVaizdaviamasZemelapyje());
			}
			System.out.println();
		}
	}

	@Override
	public void atnaujinkVaizda() {
		pieskVaizda();
	}

	@Override
	public void isvalyk() {

	}

	public static void main(String[] args) {

	}

}
