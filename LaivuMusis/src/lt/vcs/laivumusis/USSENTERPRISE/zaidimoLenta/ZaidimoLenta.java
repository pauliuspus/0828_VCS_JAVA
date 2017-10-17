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
import java.util.TreeMap;

public class ZaidimoLenta implements lt.vcs.laivumusis.common.ZaidimoLenta {
	// mapas
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> zaidimoLentele = new TreeMap<String, List<lt.vcs.laivumusis.common.Langelis>>();
	private List<lt.vcs.laivumusis.common.Laivas> laivuListas = new ArrayList<lt.vcs.laivumusis.common.Laivas>();// sukurti
																													// idejimo
																													// metoda
	String[] abecele = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

	// konstruktorius
	public ZaidimoLenta() {
		lentosKurimas();
	}

	private List<lt.vcs.laivumusis.common.Langelis> kopijosAtidavimas() {
		List<lt.vcs.laivumusis.common.Langelis> langas = new ArrayList<lt.vcs.laivumusis.common.Langelis>();
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			for (String a : abecele) {
				langas.add(new Langelis(a, kordinateY));
			}

		}
		return langas;
	}

	public void lentosKurimas() {
		for (String a : abecele) {
			zaidimoLentele.put(a, kopijosAtidavimas());
		}

	}

	@Override
	public List<lt.vcs.laivumusis.common.Laivas> getLaivai() {
		return null;
	}

	@Override
	public boolean sauk(String x, int y) {
		zaidimoLentele.get(x).get(y).sauk();
		return ((lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis) zaidimoLentele.get(x).get(y)).arLaivoDalisPasauta();
	}

	@Override
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> getLangeliai() {
		return this.zaidimoLentele;
	}

}
