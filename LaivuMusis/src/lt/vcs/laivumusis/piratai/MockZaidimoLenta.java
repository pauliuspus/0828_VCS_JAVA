package lt.vcs.laivumusis.piratai;

import java.util.List;
import java.util.Map;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.common.ZaidimoLenta;

public class MockZaidimoLenta implements ZaidimoLenta{

	@Override
	public Map<String, List<Langelis>> getLangeliai() {
		System.out.println("Grazinu langelius");
		return null;
	}

	@Override
	public List<Laivas> getLaivai() {
		System.out.println("Grazinu laivus");
		return null;
	}

	@Override
	public void pridekLaiva(Laivas laivas) {
		System.out.println("Laivas pridetas: " + laivas);
		
	}

	@Override
	public boolean sauk(String x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

}
