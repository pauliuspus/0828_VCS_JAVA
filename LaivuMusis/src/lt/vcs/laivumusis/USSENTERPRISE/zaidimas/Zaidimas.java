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
	Busena einanciojiBusenaZaidejo = Busena.Registracija;

	private Laivas laivasVienas = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(1, "laivasVienas");
	private Laivas laivasDu = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(2, "laivasDu");
	private Laivas laivasTrys = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(3, "laivasTrys");
	private Laivas LaivasKeturi = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(4, "LaivasKeturi");
	private Laivas LaivasPenki = new lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas(5, "LaivasPenki");

	public Zaidimas() {
		laivai1.add(laivasVienas);
		laivai1.add(laivasDu);
		laivai1.add(laivasTrys);
		laivai1.add(LaivasKeturi);
		laivai1.add(LaivasPenki);

		laivai2.add(laivasVienas);
		laivai2.add(laivasDu);
		laivai2.add(laivasTrys);
		laivai2.add(LaivasKeturi);
		laivai2.add(LaivasPenki);

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
	public Busena tikrinkBusena(String zaidejoId) {// patikrink kieno eile

		return null;

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
			System.out.println("pirmas zaidejas");
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
		// tikrinam ar laivai dedami gerai
		if (laivas.getLaivoKoordinates() == null) {// +
			System.out.println("kaka");
			throw new LaivuPridejimoKlaida("Laivui nepriskirtos kordinates!");
		}
		boolean arLaivasGaliButPridetas = true;
		Laivas Laivukas = laivas;
		arLaivasGaliButPridetas = tikrinaArGalimaIdetiLaiva(Laivukas, zaidejoId);

		if (arLaivasGaliButPridetas == false) {
			System.out.println("Klaida");
			throw new LaivuPridejimoKlaida("Laivo su siomis kordinatemis negalima prideti, bandykite is naujo");

		}

		// jau dedame laivus
		Laivas laivelis;
		System.out.println("dedam laivus");
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

			boolean arPataike = lenta2.sauk(x, y);

			pirmoZaidejoVaizdas.atnaujinkVaizda();
			if (arPataike = true) {
				if (lenta1.getLentosGyvybes() == 0) {

					System.out.println("tu laimejai");
				}
			}
			return arPataike;
		} else {

			boolean arPataike = lenta1.sauk(x, y);

			antrojoZaidejoVaizdas.atnaujinkVaizda();
			if (arPataike = true) {
				if (lenta2.getLentosGyvybes() == 0) {

					System.out.println("tu laimejai");
				}
			}
			return arPataike;
		}
	}

	public List<Laivas> duokLaivus(String zaidejoId) {// +

		List<Laivas> laivukopija;
		if (zaidejoId != zaidejoId1 && zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo liavas");
			return null;
		} else if (zaidejoId == zaidejoId1) {
			laivukopija = laivai1;

			return laivukopija;
		} else {
			laivukopija = laivai2;

		}
		return laivukopija;
	}

	@Override
	public ZaidimoLenta duokZaidimoLenta(String zaidejoId) {// +

		ZaidimoLenta lentosKopija;
		if (zaidejoId != zaidejoId1 && zaidejoId != zaidejoId2) {
			System.out.println("Nera tokio zaidejo lenta");
			return new ZaidimoLenta();
		}
		if (zaidejoId == zaidejoId1) {
			lentosKopija = lenta1;

			return lentosKopija;
		} else {
			lentosKopija = lenta2;

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
				// ieskojau raides vietos masyve stringo
				for (int j = 0; j < abecele.length; j++) {
					if (abecele[j].equals(x)) {
						raidesVieta = j;
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
							for (int o = y - 1; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raide).get(o - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raide).get(o - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; o <= y; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raide).get(o - 1).getLaivas();// nepamirsi
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
							for (int o = y - 1; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raidelis).get(o - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raidelis).get(o - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; o <= y; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raidelis).get(o - 1).getLaivas();// nepamirsi
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
							for (int o = y - 1; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raideliukas).get(o - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raideliukas).get(o - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; o <= y; o++) {
								Laivas arLangelisTuriLaiva = lenta1.zaidimoLentele.get(raideliukas).get(o - 1)
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
					if (abecele[j].equals(x)) {
						raidesVieta = j;
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
							for (int o = y - 1; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raide).get(o - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raide).get(o - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; o <= y; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raide).get(o - 1).getLaivas();// nepamirsi
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
							for (int o = y - 1; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raidelis).get(o - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raidelis).get(o - 1).getLaivas();// nepamirsi
																														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; o <= y; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raidelis).get(o - 1).getLaivas();// nepamirsi
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
							for (int o = y - 1; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raideliukas).get(o - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;

								}
							}
						}
						// skaicius prie kairio krasto
						if (y == 1) {
							for (int o = y; o <= y + 1; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raideliukas).get(o - 1)
										.getLaivas();// nepamirsi
														// -1
								if (arLangelisTuriLaiva != null) {
									return false;
								}
							}
						}
						// skaicius prie desinio krasto
						if (y == 10) {
							for (int o = y - 1; o <= y; o++) {
								Laivas arLangelisTuriLaiva = lenta2.zaidimoLentele.get(raideliukas).get(o - 1)
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
