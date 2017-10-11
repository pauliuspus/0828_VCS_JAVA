package lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis;
import lt.vcs.laivumusis.common.*;
import sun.security.krb5.internal.util.KrbDataOutputStream;
import lt.vcs.laivumusis.USSENTERPRISE.Konstantos.Konstantos;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas;

import java.util.Set;

public class ZaidimoLenta implements lt.vcs.laivumusis.common.ZaidimoLenta {
	// mapas
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> zaidimoLentele = new HashMap<String, List<lt.vcs.laivumusis.common.Langelis>>();
	public List<lt.vcs.laivumusis.common.Langelis> langas = new ArrayList<lt.vcs.laivumusis.common.Langelis>();

	// konstruktorius
	public ZaidimoLenta() {
		lentosKurimas();
	}

	public void lentosKurimas() {
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			langas.add(new Langelis(kordinateY));
		}
		for (char kordinateX = 'A'; kordinateX <= 'J'; kordinateX++) {
			zaidimoLentele.put(String.valueOf(kordinateX), langas);
		}
	}

	@Override
	public List<lt.vcs.laivumusis.common.Laivas> getLaivai() { // reikia grazinti lista laivu kurie yra padeti jau mape
		return null;
	}

	@Override
	public boolean sauk(String x, int y) { // pasako ar pataike i laiva ir patikrina dar ar langelis turi savyje laiva
											// jei taip jis eina i ta laiva ir is jo jau sauna i savo langeli
		zaidimoLentele.get(x).get(y).sauk();

		return false;
	}

	@Override
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> getLangeliai() {
		return this.zaidimoLentele;
	}

	// sukelti ir sugalvoti kaip tai atrodys zemelapyje
	// bandom atkurti zemelapi

	public static void main(String[] args) {
		ZaidimoLenta lenta = new ZaidimoLenta();
		for (char kordinateX = 'A'; kordinateX <= 'J'; kordinateX++) {
			System.out.print(" " + kordinateX);

		}
		System.out.println("");
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			System.out.println(kordinateY);
			for (int a = 1; a <= 10; a++)
				System.out.print(" #");
		}
	}

}
