package lt.vcs.laivumusis.USSENTERPRISE.zaidimas;

import java.lang.reflect.Array;
import java.nio.channels.Pipe.SinkChannel;
import java.util.ArrayList;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import lt.vcs.laivumusis.USSENTERPRISE.zaidejas.Zaidejas;
import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.LaivuPridejimoKlaida;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.*;
import lt.vcs.laivumusis.USSENTERPRISE.vaizdas.Vaizdas;

public class Zaidimas implements lt.vcs.laivumusis.common.Zaidimas {

	private List<lt.vcs.laivumusis.common.Laivas> laivuListas = new ArrayList<lt.vcs.laivumusis.common.Laivas>();
	private List<lt.vcs.laivumusis.common.ZaidimoLenta> zaidejuLentos = new ArrayList<lt.vcs.laivumusis.common.ZaidimoLenta>();
	String[] abecele = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

	private String zaidejoId1;
	private String zaidejoId2;
	static private int zaidejuSkaicius;
	private List<Laivas> laivai1 = new ArrayList<Laivas>();
	private List<Laivas> laivai2 = new ArrayList<Laivas>();
	private ZaidimoLenta lenta1 = new ZaidimoLenta();
	private ZaidimoLenta lenta2 = new ZaidimoLenta();
	Vaizdas pirmoZaidejoVaizdas = new Vaizdas(lenta1.zaidimoLentele);
	Vaizdas antrojoZaidejoVaizdas = new Vaizdas(lenta2.zaidimoLentele);
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

		Busena busenacia = registracijaZaidejas1;
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
		if (zaidejoId1 == null) {
			System.out.println("Pirmas zaidejas uzregistruotas");
			zaidejoId1 = zaidejoId;
			zaidejuSkaicius++;
			pirmoZaidejoVaizdas.pieskVaizda();
			return true;
		}
		if (zaidejoId2 == null && zaidejoId != zaidejoId1) {
			System.out.println("Antras zaidejas uzregistruotas");
			zaidejoId2 = zaidejoId;
			zaidejuSkaicius++;
			antrojoZaidejoVaizdas.pieskVaizda();
			return true;
		}
		return false;

	}
	// po kiekvieno zaidejo ejimo pieseme nauja vaizda

	@Override
	public synchronized void pridekLaiva(Laivas laivas, String zaidejoId) throws LaivuPridejimoKlaida { // truksta vieno
																										// patirkinimo
		if (zaidejoId != zaidejoId1 & zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo");

		}
		// tikrinam ar laivai dedami gerai
		if (laivas.getLaivoKoordinates() == null) {
			new LaivuPridejimoKlaida("Laivui nepriskirtos kordinates!");
		}
		boolean arLaivasGaliButPridetas;
		arLaivasGaliButPridetas = tikrinaArGalimaIdetiLaiva(laivas, zaidejoId);
		if (arLaivasGaliButPridetas == false) {
			throw new LaivuPridejimoKlaida("Laivo su siomis kordinatemis negalima peideti, bandykite is naujo");

		}

		// jau dedame laivus
		Laivas laivelis;

		int laivoIlgis = laivas.getLaivoIlgis();
		// 1 zaidejas
		if (zaidejoId1 == zaidejoId) {
			laivelis = laivai1.get(laivoIlgis - 1);
			List<Langelis> laivoLangeliukopija = laivas.getLaivoKoordinates();
			for (int a = 0; a < laivoLangeliukopija.size(); a++) {
				String x = laivoLangeliukopija.get(a).getX();
				int y = laivoLangeliukopija.get(a).getY();
				((lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis) lenta1.zaidimoLentele.get(x).get(y - 1))
						.setLaivaLangeliui(laivelis);
				einanciojiBusenaZaidejo1 = tavoEileZaidejas1;
				pirmoZaidejoVaizdas.atnaujinkVaizda();
				System.out.println("laivas pridetas");

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
				antrojoZaidejoVaizdas.atnaujinkVaizda();
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
			pirmoZaidejoVaizdas.atnaujinkVaizda();
			if (arPataike = true) {
				if (lenta1.getLentosGyvybes() == 0) {
					einanciojiBusenaZaidejo1 = tuLaimejaiZaidejas1;
					einanciojiBusenaZaidejo2 = priesasLaimejoZaidejas2;
					System.out.println("tu laimejai");
				}
			}
			return arPataike;
		} else {
			lenta2.sauk(x, y);
			boolean arPataike = lenta2.sauk(x, y);
			einanciojiBusenaZaidejo1 = tavoEileZaidejas1;
			einanciojiBusenaZaidejo2 = priesiEileZaidejas2;
			antrojoZaidejoVaizdas.atnaujinkVaizda();
			if (arPataike = true) {
				if (lenta2.getLentosGyvybes() == 0) {
					einanciojiBusenaZaidejo1 = priesasLaimejoZaidejas1;
					einanciojiBusenaZaidejo2 = tuLaimejaiZaidejas2;
					System.out.println("tu laimejai");
				}
			}
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
		if (zaidejoId != zaidejoId1 || zaidejoId != zaidejoId2) {
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

	private boolean tikrinaArGalimaIdetiLaiva(Laivas laivas, String zaidejoId) {

		// 1 zaidejas
		if (zaidejoId == zaidejoId1) {
			List<Langelis> tikrinamosKordinates = laivas.getLaivoKoordinates();
			// begam per zaidejo mapa patikrindami ar galima toje vietoje deti laiva, o tai
			// reiskia patikrinam tuo paciu ar nera
			// aplinkui tas vietas kitu laivu
			for (int i = 0; i < tikrinamosKordinates.size(); i++) {
				String x = tikrinamosKordinates.get(i).getX();
				int y = tikrinamosKordinates.get(i).getY();
				int raidesVieta = 0;
				// ieskojau raides vietos masyve
				for (int j = 0; j < abecele.length; j++) {
					if (abecele[i].equals(x)) {
						raidesVieta = i;
					}
				}
				// pradedu tikrinti langelius if sakiniai patikrina ar langeliai nera prie
				// krastu
				if (raidesVieta > 0 && raidesVieta < 9) {
					// raide ne prie krasto
					for (int k = raidesVieta - 1; k <= raidesVieta + 1; k++) {
						String raide = abecele[k];
						// skaicius ne prie krasto
						if (y > 1 && y < 10) {
							for (int o = y - 1; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raide).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raide).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; y <= y; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raide).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
					}
				}
				// raide prie kairio krasto
				if (raidesVieta == 0) {
					for (int n = raidesVieta; n <= raidesVieta + 1; n++) {
						String raidelis = abecele[n];
						// skaicius ne prie krasto
						if (y > 1 && y < 10) {
							for (int o = y - 1; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raidelis).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raidelis).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; y <= y; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raidelis).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
					}
				}
				// raide prie desinio krasto
				if (raidesVieta == 9) {
					for (int m = raidesVieta - 1; m <= raidesVieta; m++) {
						String raideliukas = abecele[m];
						// skaicius ne prie krasto
						if (y > 1 && y < 10) {
							for (int o = y - 1; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raideliukas).get(y - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raideliukas).get(y - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; y <= y; y++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raideliukas).get(y - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}

						}
					}
				}

			}
			return true;
		}
		// 2 zaidejas
		if (zaidejoId == zaidejoId2) {
			List<Langelis> tikrinamosKordinates = laivas.getLaivoKoordinates();
			// begam per zaidejo mapa patikrindami ar galima toje vietoje deti laiva, o tai
			// reiskia patikrinam tuo paciu ar nera
			// aplinkui tas vietas kitu laivu
			for (int i = 0; i < tikrinamosKordinates.size(); i++) {
				String x = tikrinamosKordinates.get(i).getX();
				int y = tikrinamosKordinates.get(i).getY();
				int raidesVieta = 0;
				// ieskojau raides vietos masyve
				for (int j = 0; j < abecele.length; j++) {
					if (abecele[i].equals(x)) {
						raidesVieta = i;
					}
				}
				// pradedu tikrinti langelius if sakiniai patikrina ar langeliai nera prie
				// krastu
				if (raidesVieta > 0 && raidesVieta < 9) {
					// raide ne prie krasto
					for (int k = raidesVieta - 1; k <= raidesVieta + 1; k++) {
						String raide = abecele[k];
						// skaicius ne prie krasto
						if (y > 1 && y < 10) {
							for (int o = y - 1; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raide).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raide).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; y <= y; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raide).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
					}
				}
				// raide prie kairio krasto
				if (raidesVieta == 0) {
					for (int n = raidesVieta; n <= raidesVieta + 1; n++) {
						String raidelis = abecele[n];
						// skaicius ne prie krasto
						if (y > 1 && y < 10) {
							for (int o = y - 1; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raidelis).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raidelis).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; y <= y; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raidelis).get(y - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
					}
				}
				// raide prie desinio krasto
				if (raidesVieta == 9) {
					for (int m = raidesVieta - 1; m <= raidesVieta; m++) {
						String raideliukas = abecele[m];
						// skaicius ne prie krasto
						if (y > 1 && y < 10) {
							for (int o = y - 1; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raideliukas).get(y - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; y <= y + 1; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raideliukas).get(y - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; y <= y; y++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raideliukas).get(y - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}

						}
					}
				}

			}
			return true;
		} else
			return false;
	}
}
