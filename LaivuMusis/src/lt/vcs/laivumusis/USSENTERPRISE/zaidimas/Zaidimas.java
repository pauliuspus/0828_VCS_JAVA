package lt.vcs.laivumusis.USSENTERPRISE.zaidimas;

import java.nio.channels.Pipe.SinkChannel;
import java.util.ArrayList;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import lt.vcs.laivumusis.USSENTERPRISE.zaidejas.Zaidejas;
import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.LaivuPridejimoKlaida;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.*;

public class Zaidimas implements lt.vcs.laivumusis.common.Zaidimas {

	private List<lt.vcs.laivumusis.common.Laivas> laivuListas = new ArrayList<lt.vcs.laivumusis.common.Laivas>();
	private List<lt.vcs.laivumusis.common.ZaidimoLenta> zaidejuLentos = new ArrayList<lt.vcs.laivumusis.common.ZaidimoLenta>();

	private String zaidejoId1;
	private String zaidejoId2;
	static private int zaidejuSkaicius;
	private List<Laivas> laivai1 = new ArrayList<Laivas>();
	private List<Laivas> laivai2 = new ArrayList<Laivas>();
	private ZaidimoLenta lenta1 = new ZaidimoLenta();
	private ZaidimoLenta lenta2 = new ZaidimoLenta();
	// zaidejas 1
	Busena registracijaZaidejas1 = Busena.Registracija;
	Busena dalinamesLaivusZaidejas1 = Busena.DalinemesLaivus;
	Busena dalinamesZemelapiusZaidejas1 = Busena.DalinamesZemelapius;
	Busena rikiuojamLaivusZaidejas1 = Busena.RikiuojamLaivus;
	Busena tavoEileZaidejas1 = Busena.TavoEile;
	Busena priesiEileZaidejas1 = Busena.PriesininkoEile;
	Busena tuLaimejaiZaidejas1 = Busena.TuLaimejai;
	Busena priesasLaimejoZaidejas1 = Busena.PriesasLaimejo;
	// zaidejas 2
	Busena registracijaZaidejas2 = Busena.Registracija;
	Busena dalinamesLaivusZaidejas2 = Busena.DalinemesLaivus;
	Busena dalinamesZemelapiusZaidejas2 = Busena.DalinamesZemelapius;
	Busena rikiuojamLaivusZaidejas2 = Busena.RikiuojamLaivus;
	Busena tavoEileZaidejas2 = Busena.TavoEile;
	Busena priesiEileZaidejas2 = Busena.PriesininkoEile;
	Busena tuLaimejaiZaidejas2 = Busena.TuLaimejai;
	Busena priesasLaimejoZaidejas2 = Busena.PriesasLaimejo;
	// einancioji
	Busena einanciojiBusenaZaidejo1;
	Busena einanciojiBusenaZaidejo2;

	private Laivas laivasVienas = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(1, "laivasVienas");
	private Laivas laivasDu = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(2, "laivasDu");
	private Laivas laivasTrys = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(3, "laivasTrys");
	private Laivas LaivasKeturi = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(4, "LaivasKeturi");
	private Laivas LaivasPenki = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(5, "LaivasPenki");

	public Zaidimas() {
		laivuDejimasILista(laivai1);
		laivuDejimasILista(laivai2);
		einanciojiBusenaZaidejo1 = registracijaZaidejas1;
		einanciojiBusenaZaidejo2 = registracijaZaidejas2;
	}

	public void laivuDejimasILista(List<Laivas> a) { // ?
		a.add(laivasVienas);
		a.add(laivasDu);
		a.add(laivasTrys);
		a.add(LaivasKeturi);
		a.add(LaivasPenki);
	}

	@Override
	public void run() {
	}

	@Override
	public List<lt.vcs.laivumusis.common.ZaidimoLenta> getLentos() {// +
		zaidejuLentos.add(lenta1);
		zaidejuLentos.add(lenta2);
		return zaidejuLentos;
	}

	@Override
	public void skaiciuokStatistika() {
		// TODO Auto-generated method stub
		// nafik sito reikia

	}

	@Override
	public Busena tikrinkBusena(String zaidejoId) {

		Busena busenacia = null;
		if (zaidejoId == zaidejoId1)
			busenacia = einanciojiBusenaZaidejo1;
		if (zaidejoId == zaidejoId2)
			busenacia = einanciojiBusenaZaidejo2;
		return busenacia;

	}

	@Override
	public synchronized boolean registruokZaideja(String zaidejoId) {// +

		if (zaidejuSkaicius >= 2) {
			System.out.println("zaidejai uzregistruoti");
			return false;
		}
		if (zaidejoId1 == "") {
			System.out.println("Pirmas zaidejas uzregistruotas");
			zaidejoId1 = zaidejoId;
			zaidejuSkaicius++;
			return true;
		}
		if (zaidejoId2 == "" && zaidejoId != zaidejoId1) {
			System.out.println("Antras zaidejas uzregistruotas");
			zaidejoId2 = zaidejoId;
			zaidejuSkaicius++;
			return true;
		}
		return false;

	}
	// po kiekvieno zaidejo ejimo pieseme nauja vaizda

	@Override
	public void pridekLaiva(Laivas laivas, String zaidejoId) throws LaivuPridejimoKlaida {
		if (zaidejoId != zaidejoId1 & zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo");
		}

		if (laivas.getLaivoKoordinates() == null) {
			new LaivuPridejimoKlaida("Laivui nepriskirtos kordinates!");
		}
		// reikia dar paziureti ar laivas nera iskreiptos formos
		if (zaidejoId == zaidejoId1) {
			List<Langelis> tikrinamosKordinates = laivas.getLaivoKoordinates();
			// begam per zaidejo mapa patikrindami ar galima toje vietoje deti laiva, o tai
			// reiskia patikrinam tuo paciu ar nera
			// aplinkui tas vietas kitu laivu

		}

		// jau dedame laivus
		Laivas laivelis;
		// 1 zaidejas
		int laivoIlgis = laivas.getLaivoIlgis();
		if (zaidejoId1 == zaidejoId) {
			laivelis = laivai1.get(laivoIlgis - 1);
			List<Langelis> laivoLangeliukopija = laivas.getLaivoKoordinates();
			for (int a = 0; a < laivoLangeliukopija.size(); a++) {
				String x = laivoLangeliukopija.get(a).getX();
				int y = laivoLangeliukopija.get(a).getY();
				((lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis) lenta1.zaidimoLentele.get(x).get(y - 1))
						.setLaivaLangeliui(laivelis);
				einanciojiBusenaZaidejo1 = tavoEileZaidejas1;
			}
			laivai1.get(laivoIlgis - 1).setKordinates(laivoLangeliukopija);
		}

		// 2 zaidejas
		if (zaidejoId2 == zaidejoId) {
			laivelis = laivai2.get(laivoIlgis - 1);
			List<Langelis> laivoLangeliukopija = laivas.getLaivoKoordinates();
			for (int a = 0; a < laivoLangeliukopija.size(); a++) {
				String x = laivoLangeliukopija.get(a).getX();
				int y = laivoLangeliukopija.get(a).getY();
				((lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis) lenta2.zaidimoLentele.get(x).get(y - 1))
						.setLaivaLangeliui(laivelis);
				einanciojiBusenaZaidejo2 = tavoEileZaidejas2;
			}
			laivai2.get(laivoIlgis - 1).setKordinates(laivoLangeliukopija);
		}
	}

	@Override
	public boolean sauk(String x, int y, String zaidejoId) {// +
		if (zaidejoId != zaidejoId1 & zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo");
			return false;
		}
		if (zaidejoId == zaidejoId1) {
			lenta1.sauk(x, y);
			boolean arPataike = lenta1.sauk(x, y);
			einanciojiBusenaZaidejo1 = priesiEileZaidejas1;
			einanciojiBusenaZaidejo2 = tavoEileZaidejas2;
			return arPataike;
		} else {
			lenta2.sauk(x, y);
			boolean arPataike = lenta2.sauk(x, y);
			einanciojiBusenaZaidejo1 = tavoEileZaidejas1;
			einanciojiBusenaZaidejo2 = priesiEileZaidejas2;
			return arPataike;
		}
	}

	public List<Laivas> duokLaivus(String zaidejoId) {// +

		List<Laivas> laivukopija;
		if (zaidejoId != zaidejoId1 & zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo");
			return null;
		} else if (zaidejoId == zaidejoId1) {
			laivukopija = laivai1;
			einanciojiBusenaZaidejo1 = dalinamesLaivusZaidejas1;
			return laivukopija;
		} else {
			laivukopija = laivai2;
			einanciojiBusenaZaidejo2 = dalinamesLaivusZaidejas2;
		}
		return laivukopija;
	}

	@Override
	public ZaidimoLenta duokZaidimoLenta(String zaidejoId) {// +

		ZaidimoLenta lentosKopija;
		if (zaidejoId != zaidejoId1 & zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo");
			return new ZaidimoLenta();
		}
		if (zaidejoId == zaidejoId1) {
			lentosKopija = lenta1;
			einanciojiBusenaZaidejo1 = rikiuojamLaivusZaidejas1;
			return lentosKopija;
		} else {
			lentosKopija = lenta2;
			einanciojiBusenaZaidejo2 = rikiuojamLaivusZaidejas2;
		}

		return lentosKopija;
	}

}
