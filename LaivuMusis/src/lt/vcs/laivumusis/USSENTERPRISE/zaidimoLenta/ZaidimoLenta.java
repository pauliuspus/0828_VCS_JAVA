package lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis;
import lt.vcs.laivumusis.common.*;

public class ZaidimoLenta implements lt.vcs.laivumusis.common.ZaidimoLenta {

	public List<Laivas> laivuListas = new ArrayList<Laivas>();

	public Map<String, List<Langelis>> zaidimoLentele = new HashMap<String, List<Langelis>>();
	public List<Langelis> langas = new ArrayList<Langelis>();

	public void lentosKurimas() {
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			langas.add(new Langelis(kordinateY));
		}
		for (char kordinateY = 'A'; kordinateY <= 'J'; kordinateY++) {
			zaidimoLentele.put(String.valueOf(kordinateY), langas);
		}
	}

	@Override
	public List<Laivas> getLaivai() {
		return laivuListas;
	}

	@Override
	public void pridekLaiva(Laivas laivas) {
		laivuListas.add(laivas);
	}

	@Override
	public boolean sauk(String x, int y) {
		return false;
	}

	@Override
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> getLangeliai() {
		return null;
	}

}
