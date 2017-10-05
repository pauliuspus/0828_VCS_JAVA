package lt.vcs.laivumusis.piratai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Zaidimas;
import lt.vcs.laivumusis.common.ZaidimoLenta;

public class MockZaidimas implements Zaidimas {
	
	private static int zaidejuSkaicius;
	private String zaidejoId1;
	private String zaidejoId2;
	
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
		
		if (zaidejuSkaicius > 2) {
			System.out.println("Jau uzregistruoti 2 zaidejai");
			return null;
		}
		
		
		if (zaidejoId1 != null) {
			
			this.zaidejoId2 ="2";
			return this.zaidejoId2;
		} 
		return this.zaidejoId1 = "1";
	}
	
	
	
	public String getZaidejoId() {
		return zaidejoId;
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
		ZaidimoLenta zaidimoLentaKopija = new MockZaidimoLenta(10,10);
		return zaidimoLentaKopija;
	}

}
