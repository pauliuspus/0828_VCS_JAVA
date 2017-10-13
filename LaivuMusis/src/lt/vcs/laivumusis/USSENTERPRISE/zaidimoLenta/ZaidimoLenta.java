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
	// public List<lt.vcs.laivumusis.common.Langelis> langas = new
	// ArrayList<lt.vcs.laivumusis.common.Langelis>();

	// konstruktorius
	public ZaidimoLenta() {
		lentosKurimas();
	}

	private List<lt.vcs.laivumusis.common.Langelis> kopijosAtidavimas() {
		List<lt.vcs.laivumusis.common.Langelis> langas = new ArrayList<lt.vcs.laivumusis.common.Langelis>();
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			langas.add(new Langelis(kordinateY));
		}
		return langas;
	}

	public void lentosKurimas() {
		// for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
		// langas.add(new Langelis(kordinateY));
		// }
		for (char kordinateX = 'A'; kordinateX <= 'J'; kordinateX++) {
			for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
				zaidimoLentele.put(String.valueOf(kordinateX), kopijosAtidavimas());
				// zaidimoLentele.put(String.valueOf(kordinateX),
				// kopijosAtidavimas().get(kordinateY).); // kopija
			}
		}
	}

	@Override
	public List<lt.vcs.laivumusis.common.Laivas> getLaivai() {
		return null;
	}

	@Override
	public boolean sauk(String x, int y) {
		zaidimoLentele.get(x).get(y).sauk();

		return false;
	}

	@Override
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> getLangeliai() {
		return this.zaidimoLentele;
	}

}
