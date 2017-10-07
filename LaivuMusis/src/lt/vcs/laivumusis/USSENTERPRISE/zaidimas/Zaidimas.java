package lt.vcs.laivumusis.USSENTERPRISE.zaidimas;

import java.util.List;

import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.ZaidimoLenta;

public class Zaidimas implements lt.vcs.laivumusis.common.Zaidimas {
	// mainas
	public static final char[] ZAIDIMO_LENTOS_RAIDES = {'A', 'B', 'C', 'D', 'E',
			'F', 'G', 'H', 'I', 'J'};
	public static final int LENTOS_DYDIS = 10;



	@Override
	public void run() {

	}

	@Override
	public List<ZaidimoLenta> getLentos() {

		return null;
	}

	@Override
	public void skaiciuokStatistika() {
		// TODO Auto-generated method stub
		// nafik sito reikia

	}

	@Override
	public Busena tikrinkBusena(String zaidejoId) {

		return null;
	}

	@Override
	public String registruokZaideja() {
		// prideda nauja zaideja  pagal jo
		return null;
	}

    @Override
    public void pridekLaiva(Laivas laivas, String zaidejoId) {
        // ideti laiva i zaidimo laiva , zaidejo lenteles kopijoje
    }

    @Override
	public boolean sauk(String x, int y, String zaidejoId) {
			// turi kviest metoda sauk kuris yra zaidimo lentoje
		return false;
	}

	@Override
	public List<Laivas> duokLaivus(String zaidejoId) {
		// duoda laivu lista zaidejui
		return null;
	}

	@Override
	public ZaidimoLenta duokZaidimoLenta(String zaidejoId) {
		return null;
	}

}
