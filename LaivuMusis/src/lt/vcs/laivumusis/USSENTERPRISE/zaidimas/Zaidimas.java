package lt.vcs.laivumusis.USSENTERPRISE.zaidimas;

import java.util.ArrayList;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import lt.vcs.laivumusis.USSENTERPRISE.zaidejas.Zaidejas;
import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.*;

public class Zaidimas implements lt.vcs.laivumusis.common.Zaidimas {

	private List<lt.vcs.laivumusis.common.Laivas> laivuListas = new ArrayList<lt.vcs.laivumusis.common.Laivas>();
	private List<lt.vcs.laivumusis.common.ZaidimoLenta> zaidejuLentos = new ArrayList<lt.vcs.laivumusis.common.ZaidimoLenta>();

	private String zaidejoId1;
	private String zaidejoId2;
	private int zaidejuSkaicius;
	private List<Laivas> laivai1;
	private List<Laivas> laivai2;
	private ZaidimoLenta lenta1 = new ZaidimoLenta();
	private ZaidimoLenta lenta2 = new ZaidimoLenta();
	Busena registracija = Busena.Registracija;
	Busena dalinamesLaivus = Busena.DalinemesLaivus;
	Busena dalinamesZemelapius = Busena.DalinamesZemelapius;
	Busena rikiuojamLaivus = Busena.RikiuojamLaivus;
	Busena tavoEile = Busena.TavoEile;
	Busena priesiEile = Busena.PriesininkoEile;
	Busena tuLaimejai = Busena.TuLaimejai;
	Busena priesasLaimejo = Busena.PriesasLaimejo;

	private Laivas laivasVienas = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(1, "laivasVienas");
	private Laivas laivasDu = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(2, "laivasDu");
	private Laivas laivasTrys = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(3, "laivasTrys");
	private Laivas LaivasKeturi = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(4, "LaivasKeturi");
	private Laivas LaivasPenki = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(5, "LaivasPenki");

	public Zaidimas() {
		laivuDejimasILista(laivai1);
		laivuDejimasILista(laivai2);
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

		return null;
	}

	@Override
	public String registruokZaideja() {// +
		if (zaidejuSkaicius >= 2) {
			System.out.println("zaidejau uzregistruoti");
			return null;
		}
		if (zaidejoId1 == null) {
			System.out.println("Pirmas zaidejas uzregistruotas");
			this.zaidejoId1 = "" + new Random().nextInt(99);
			return zaidejoId1;
		}
		if (zaidejoId2 == null) {
			this.zaidejoId2 = "" + new Random().nextInt(99);
			return zaidejoId2;
		}
		return null;

	}

	@Override
	public void pridekLaiva(Laivas laivas, String zaidejoId) {// +???
		// I mapa ideti laiva
		// langeliams priskirti laiva
		if (zaidejoId != zaidejoId1 & zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo");
		}
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
			return arPataike;
		} else {
			lenta2.sauk(x, y);
			boolean arPataike = lenta2.sauk(x, y);
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
			return laivukopija;
		} else
			laivukopija = laivai2;
		return laivukopija;
	}

	@Override
	public ZaidimoLenta duokZaidimoLenta(String zaidejoId) {// +
		ZaidimoLenta lentosKopija;
		if (zaidejoId != zaidejoId1 & zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo");
			return null;
		}
		if (zaidejoId == zaidejoId1) {
			lentosKopija = lenta1;
			return lentosKopija;
		} else
			lentosKopija = lenta2;
		return lentosKopija;
	}

}
