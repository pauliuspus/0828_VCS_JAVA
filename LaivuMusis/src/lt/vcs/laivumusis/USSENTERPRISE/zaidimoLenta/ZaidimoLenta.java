package lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;

public class ZaidimoLenta implements lt.vcs.laivumusis.common.ZaidimoLenta {
	public ZaidimoLenta() {
		Map<String, List<Integer>> lenta = new HashMap<String, List<Integer>>();
		List<Integer> listas = new ArrayList<Integer>();
		for (int a = 1; a <= 10; a++) {
			listas.add(a);
		}
		for (int i = 65; i <= 74; i++) {
			lenta.put((char) i, listas);
		}

	}

	@Override
	public Map<String, List<Langelis>> getLangeliai() {
		return null;
	}

	@Override
	public List<Laivas> getLaivai() {
		return null;
	}

	@Override
	public void pridekLaiva(Laivas laivas) {
	}

	@Override
	public boolean sauk(String x, int y) {
		return false;
	}

}
