package lt.vcs.laivumusis.piratai;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Zaidimas;
import lt.vcs.laivumusis.common.ZaidimoLenta;

public class MockZaidimas implements Zaidimas {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ZaidimoLenta> getLentos() {
		List <ZaidimoLenta> lenta = new ArrayList<ZaidimoLenta>();
		return lenta;
	}

	@Override
	public void skaiciuokStatistika() {
		System.out.println("Rodau statistika");
		
	}

	@Override
	public Busena tikrinkBusena(String zaidejoId) {
		Busena busena = Busena.DalinamesZemelapius;
		return busena;
	}

	@Override
	public String registruokZaideja() {
		
		return "zaidejas registruotas";
	}

	@Override
	public boolean sauk(String x, int y, String zaidejoId) {
		
		return true;
	}

	@Override
	public List<Laivas> duokLaivus(String zaidejoId) {
		List<Laivas> laivai = new ArrayList<Laivas>();
		return laivai;
	}

	@Override
	public ZaidimoLenta duokZaidimoLenta(String zaidejoId) {
		ZaidimoLenta zaidimoLenta = new MockZaidimoLenta();
		return zaidimoLenta;
	}

}
