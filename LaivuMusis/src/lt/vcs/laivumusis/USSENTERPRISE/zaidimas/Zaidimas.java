package lt.vcs.laivumusis.USSENTERPRISE.zaidimas;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.ZaidimoLenta;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.*;

public class Zaidimas implements lt.vcs.laivumusis.common.Zaidimas {
	// mainas
	public static final char[] ZAIDIMO_LENTOS_RAIDES = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
	public static final int LENTOS_DYDIS = 10;

	List<lt.vcs.laivumusis.common.Laivas> laivuListas = new ArrayList<lt.vcs.laivumusis.common.Laivas>();

	Laivas laivasVienas = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(1, "laivasVienas");
	Laivas laivasDu = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(2, "krovininis");
	Laivas laivasTrys = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(3, "kruizeris");
	Laivas LaivasKeturi = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(4, "povandeninis");
	Laivas LaivasPenki = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(5, "naikintojas");
	public void laivuDejimasILista() {
		laivuListas.add(laivasVienas);
		laivuListas.add(laivasDu);
		laivuListas.add(laivasTrys);
		laivuListas.add(LaivasKeturi);
		laivuListas.add(LaivasPenki);
		}

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
		// prideda nauja zaideja pagal jo
		return null;
	}
// ideti laiva i zaidimo laiva , zaidejo lenteles kopijoje
	@Override
	public void pridekLaiva(Laivas laivas, String zaidejoId) {
		// I mapa ideti laiva
		// Laivui duoti jo langelius
		// langeliams priskirti laiva
		
		
		
		
		
		
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
