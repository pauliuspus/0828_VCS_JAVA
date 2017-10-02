package lt.vcs.kavosaparatas.manvydas.aparatai;

import java.util.HashMap;
import java.util.Scanner;
import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.common.Products;
import lt.vcs.kavosaparatas.common.exceptions.NesvarusAparatas;
import lt.vcs.kavosaparatas.common.exceptions.TrukstaProduktu;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.DvigubaEspresso;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.Espresso;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.JuodaKava;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.KavaSuPienu;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.manvydas.resursai.Produktai;

public class KavosAparatas implements CoffeeMashine {

	// Testas cia

	// Konstanta, kuri galioja visiems aparatams
	private static final int PANAUDOJIMU_SK_PRIES_PLOVIMA = 2;

	// Kintamasis panaudojimu skaicius
	public int panaudojimuSkaicius;

	private Produktai produktai;

	private static int aparatuSkaitliukas;

	HashMap<String, KavosPuodelis> puodeliai = new HashMap<String, KavosPuodelis>();

	// Kavos aparato konstruktoriai
	public KavosAparatas(int cukrusAparateGramais, int kavaAparateGramais, int pienasAparateMililitrais) {
		produktai = new Produktai(cukrusAparateGramais, kavaAparateGramais, pienasAparateMililitrais);
		aparatuSkaitliukas++;
	}

	public KavosAparatas() {
		this(0, 0, 0);
	}

	public KavosAparatas(int kavaAparateGramais) {
		this(kavaAparateGramais, 0, 0);
	}

	public void pridekPuodeli(String kavosPavadinimas, int cukrus, int kava, int pienas) {
		puodeliai.put(kavosPavadinimas.toLowerCase(),
				new KavosPuodelis(kavosPavadinimas.toLowerCase(), cukrus, kava, pienas));
	}

	public void pasalinkPuodeli(String kavosPavadinimas) {
		puodeliai.remove(kavosPavadinimas.toLowerCase());
	}

	public void gaminkKavaJeiYra(String kavosPavadinimas) {
		if (puodeliai.containsKey(kavosPavadinimas.toLowerCase())) {
			gaminkKava(puodeliai.get(kavosPavadinimas.toLowerCase()));
		} else
			System.out.println("Tokios kavos nera");
	}

	// Produktu set metodas
	public void setProduktai(Produktai produktai) {
		this.produktai = produktai;
	}

	// pasako, kiek aparatu buvo sukurta
	public static int sukurtuAparatuSkaicius() {
		System.out.println("Sukurta aparatu: " + aparatuSkaitliukas);
		return aparatuSkaitliukas;
	}

	@Override
	public KavosPuodelis gaminkKava(String kavosTipas) throws TrukstaProduktu, NesvarusAparatas {

		if (PANAUDOJIMU_SK_PRIES_PLOVIMA - this.panaudojimuSkaicius <= 0) {
			throw new NesvarusAparatas("Aparata reikia plauti");
		}

		KavosPuodelis kavosPuodelis = null;
		Scanner s = new Scanner(System.in);
		kavosTipas = kavosTipas.toUpperCase();

		
		arUztenkaProduktu(kavosTipas);
		
		/*// Tikriname, ar uzteks produktu
		if (kavosTipas == "JUODA") {
			if (produktai.getKavaAparateGramais() < 20) {
				System.out.println("Aparate truksta kavos");
				papildykPupeliu();
			}
			if (produktai.getCukrusAparateGramais() < 20) {
				System.out.println("Aparate truksta cukraus");
				papildykCukraus();
			}
		} else if (kavosTipas == "ESPRESSO") {
			if (produktai.getKavaAparateGramais() < 20) {
				System.out.println("Aparate truksta kavos");
				papildykPupeliu();
			}
		} else if (kavosTipas == "DVIGUBA ESPRESSO") {
			if (produktai.getKavaAparateGramais() < 40) {
				System.out.println("Aparate truksta kavos");
				papildykPupeliu();
			}
		} else if (kavosTipas == "SU PIENU") {
			if (produktai.getKavaAparateGramais() < 20) {
				System.out.println("Aparate truksta kavos");
				papildykPupeliu();
			}
			if (produktai.getPienasAparateMililitrais() < 40) {
				System.out.println("Aparate truksta pieno");
				papildykPiena();
			}
		} else {
			System.out.println("Tokios kavos neturime, bandykite dar karta!");
			System.exit(0);
		}*/

		switch (kavosTipas) {
		case "JUODA":
			kavosPuodelis = new JuodaKava();
			break;
		case "ESPRESSO":
			kavosPuodelis = new Espresso();
			break;
		case "DVIGUBA ESPRESSO":
			kavosPuodelis = new DvigubaEspresso();
			break;
		case "SU PIENU":
			kavosPuodelis = new KavaSuPienu();
			break;
		}

		if (kavosPuodelis != null) {
			perskaiciuokProduktus(kavosPuodelis);
			System.out.println(kavosPuodelis.toString());
		}

		return kavosPuodelis;

	}

	private void arUztenkaProduktu(String kavosTipas) throws TrukstaProduktu {

		switch (kavosTipas) {
		case "JUODA":
			JuodaKava juoda = new JuodaKava();
			if (this.produktai.getCukrusAparateGramais() - juoda.getProduktai().getCukrusAparateGramais() < 0 
					|| this.produktai.getKavaAparateGramais() - juoda.getProduktai().getKavaAparateGramais()<0 
					|| this.produktai.getPienasAparateMililitrais() - juoda.getProduktai().getPienasAparateMililitrais()<0) {
				throw new TrukstaProduktu("Truktsta produktu");
			}
			break;

		default:
			break;
		}
	}

	private void gaminkKava(KavosPuodelis kavosPavadinimas) {
		Produktai puodelioProduktai = kavosPavadinimas.getProduktai();
		gaminkKava(puodelioProduktai.getCukrusAparateGramais(), puodelioProduktai.getKavaAparateGramais(),
				puodelioProduktai.getPienasAparateMililitrais());
		kavosPavadinimas.setKavaPagaminta(true);
		System.out.println(kavosPavadinimas.toString());
	}

	private void gaminkKava(int cukrus, int kava, int pienas) {
		produktai.setCukrusAparateGramais(produktai.getCukrusAparateGramais() - cukrus);
		produktai.setKavaAparateGramais(produktai.getKavaAparateGramais() - kava);
		produktai.setPienasAparateMililitrais(produktai.getPienasAparateMililitrais() - pienas);
		panaudojimuSkaicius++;
	}

	// Pamazinam kavos pagal pasirinkima
	private void perskaiciuokProduktus(KavosPuodelis kavosPuodelis) {
		produktai.setKavaAparateGramais(
				produktai.getKavaAparateGramais() - kavosPuodelis.getProduktai().getKavaAparateGramais());
		produktai.setCukrusAparateGramais(
				produktai.getCukrusAparateGramais() - kavosPuodelis.getProduktai().getCukrusAparateGramais());
		produktai.setPienasAparateMililitrais(
				produktai.getPienasAparateMililitrais() - kavosPuodelis.getProduktai().getPienasAparateMililitrais());
		kavosPuodelis.setKavaPagaminta(true);
		this.panaudojimuSkaicius++;

	}

	// Metodas papildyti cukru
	public void papildykCukraus() {
		int cukrus;
		Scanner s = new Scanner(System.in);
		System.out.println("Cukraus kiekis aparate yra: " + produktai.getCukrusAparateGramais() + " g.");
		System.out.println("Kiek gramu cukraus ipilsite?");

		do {
			cukrus = s.nextInt();
			if (produktai.getCukrusAparateGramais() + cukrus > 1000) {
				produktai.setCukrusAparateGramais(1000);
				System.out.println("Maximalus galimas kiekis yra 1000 g.");
				System.out.println("Aparate yra " + produktai.getCukrusAparateGramais() + " g. cukraus");
			} else if (cukrus < 20) {
				System.out.println("Minimalus galimas papildyti kiekis yra 20 g.");
				System.out.println("Iveskite is naujo");
			} else {
				produktai.setCukrusAparateGramais(produktai.getCukrusAparateGramais() + cukrus);
				System.out.println("Aparate yra " + produktai.getCukrusAparateGramais() + " g. cukraus");
			}
		} while (cukrus < 20);
	}

	@Override
	public void papildykCukraus(int cukrus) {
		if (produktai.getCukrusAparateGramais() + cukrus > 1000) {
			produktai.setCukrusAparateGramais(1000);
			System.out.println("Maximalus galimas kiekis yra 1000 g.");
			System.out.println("Aparate yra " + produktai.getCukrusAparateGramais() + " g. cukraus");
		} else if (cukrus < 20) {
			System.out.println("Minimalus galimas papildyti kiekis yra 20 g.");
			System.out.println("Iveskite is naujo");
		} else {
			produktai.setCukrusAparateGramais(produktai.getCukrusAparateGramais() + cukrus);
			System.out.println("Aparate yra " + produktai.getCukrusAparateGramais() + " g. cukraus");
		}
	}

	// Metodas papildyti kava
	public void papildykPupeliu() {
		int pupeliuKiekis;
		Scanner s = new Scanner(System.in);
		System.out.println("Kavos kiekis aparate yra: " + produktai.getKavaAparateGramais() + " g.");
		System.out.println("Kiek gramu kavos idesite?");
		do {
			pupeliuKiekis = s.nextInt();
			if (produktai.getKavaAparateGramais() + pupeliuKiekis > 1000) {
				produktai.setKavaAparateGramais(1000);
				System.out.println("Maximalus galimas kiekis yra 1000 g.");
				System.out.println("Aparate yra " + produktai.getKavaAparateGramais() + " g. kavos");
			} else if (pupeliuKiekis < 40) {
				System.out.println("Minimalus kiekis, kuri galima papildyti yra 40 g.");
				System.out.println("Iveskite is naujo");
			} else {
				produktai.setKavaAparateGramais(produktai.getKavaAparateGramais() + pupeliuKiekis);
				System.out.println("Aparate yra " + produktai.getKavaAparateGramais() + " g. kavos");
			}
		} while (pupeliuKiekis < 40);
	}

	@Override
	public void papildykPupeliu(int pupeliuKiekis) {
		int kava;
		Scanner s = new Scanner(System.in);
		System.out.println("Kavos kiekis aparate yra: " + produktai.getKavaAparateGramais() + " g.");
		System.out.println("Kiek gramu kavos idesite?");
		do {
			kava = s.nextInt();
			if (produktai.getKavaAparateGramais() + kava > 1000) {
				produktai.setKavaAparateGramais(1000);
				System.out.println("Maximalus galimas kiekis yra 1000 g.");
				System.out.println("Aparate yra " + produktai.getKavaAparateGramais() + " g. kavos");
			} else if (kava < 40) {
				System.out.println("Minimalus kiekis, kuri galima papildyti yra 40 g.");
				System.out.println("Iveskite is naujo");
			} else {
				produktai.setKavaAparateGramais(produktai.getKavaAparateGramais() + kava);
				System.out.println("Aparate yra " + produktai.getKavaAparateGramais() + " g. kavos");
			}
		} while (kava < 40);
	}

	// Metodas papildyti piena
	public void papildykPiena() {
		int pienas;
		Scanner s = new Scanner(System.in);
		System.out.println("Pieno kiekis aparate yra: " + produktai.getPienasAparateMililitrais() + " ml.");
		System.out.println("Kiek mililitru pieno ipilsite?");

		do {
			pienas = s.nextInt();
			if (produktai.getPienasAparateMililitrais() + pienas > 1000) {
				produktai.setPienasAparateMililitrais(1000);
				System.out.println("Maximalus galimas kiekis yra 1000 ml.");
				System.out.println("Aparate yra " + produktai.getPienasAparateMililitrais() + " ml. pieno");
			} else if (pienas < 40) {
				System.out.println("Minimalus galimas papildyti kiekis yra 40 ml.");
				System.out.println("Iveskite is naujo");
			} else {
				produktai.setPienasAparateMililitrais(produktai.getPienasAparateMililitrais() + pienas);
				System.out.println("Aparate yra " + produktai.getPienasAparateMililitrais() + " ml. pieno");
			}
		} while (pienas < 20);
	}

	public void papildykPiena(int pienas) {
		if (produktai.getPienasAparateMililitrais() + pienas > 1000) {
			produktai.setPienasAparateMililitrais(1000);
			System.out.println("Maximalus galimas kiekis yra 1000 ml.");
			System.out.println("Aparate yra " + produktai.getPienasAparateMililitrais() + " ml. pieno");
		} else if (pienas < 40) {
			System.out.println("Minimalus galimas papildyti kiekis yra 40 ml.");
			System.out.println("Iveskite is naujo");
		} else {
			produktai.setPienasAparateMililitrais(produktai.getPienasAparateMililitrais() + pienas);
			System.out.println("Aparate yra " + produktai.getPienasAparateMililitrais() + " ml. pieno");
		}
	}

	// Atlieka aparato plovima, kuris trunka nustatyta laiko trukme
	public void atlikPlovima() {
		if (this.panaudojimuSkaicius == 0) {
			System.out.println("Aparatas jau isplautas, plauti nereikia");
		} else {
			System.out.println("Aparatas plaunamas (uztruks 10 sekundziu...)");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
			}
			this.panaudojimuSkaicius = 0;
			System.out.println("Aparatas sekmingai isplautas!");
		}
	}

	// Produktu busenos tikrinimas
	public void sakykProduktuBusena() {
		System.out.println("Kavos aparate yra: " + produktai.getKavaAparateGramais() + " g.");
		System.out.println("Pieno aparate yra: " + produktai.getPienasAparateMililitrais() + " ml.");
		System.out.println("Cukraus aparate yra: " + produktai.getCukrusAparateGramais() + " g.");
	}

	// Pasako aparato busena
	public void sakykAparatoBusena() {
		System.out
				.println("Iki plovimo liko: " + (PANAUDOJIMU_SK_PRIES_PLOVIMA - panaudojimuSkaicius) + " panaudojimu");
		sakykProduktuBusena();
	}

	// Pasako, ar reikia plauti
	private boolean arReikiaPlauti() {
		if (panaudojimuSkaicius >= PANAUDOJIMU_SK_PRIES_PLOVIMA) {
			System.out.println("Aparata reikia plauti!");
			return true;
		} else {
			return false;
		}
	}

	// Pasako, ar aparatas paruostas naudojimui
	@Override
	public boolean arAparatasPasiruoses() {
		boolean paruostas = !arReikiaPlauti() && produktai.getKavaAparateGramais() != 0
				&& produktai.getCukrusAparateGramais() != 0 && produktai.getPienasAparateMililitrais() != 0;
		if (paruostas) {
			System.out.println("Aparatas paruostas");
		} else
			System.out.println("Aparatas neparuostas");
		return paruostas;
	}

	// Set ir get metodai panaudojimu skaiciui (nepanadoti?)
	private int getPanaudojimuSkaicius() {
		return panaudojimuSkaicius;
	}

	private void setPanaudojimuSkaicius(int panaudojimuSkaicius) {
		this.panaudojimuSkaicius = panaudojimuSkaicius;
	}

	@Override
	public void ismurzinkAparata() {
		this.panaudojimuSkaicius = PANAUDOJIMU_SK_PRIES_PLOVIMA;
		System.out.println("Achtung Attention Attenzione!!! Aparatas per prievarta ismurzintas");
	}

	@Override
	public void isvalykProduktus() {
		this.produktai.setCukrusAparateGramais(0);
		this.produktai.setKavaAparateGramais(0);
		this.produktai.setPienasAparateMililitrais(0);
	}

	@Override
	public Produktai getProduktaiKopija() {
		return this.produktai.gaukKopija();
	}

	@Override
	public void papildykVandens(int vandensKiekis) {
		System.out.println("Vandens papildyt nereikia");
		System.out.println("Aparatas prijungtas prie vandentiekio :)");
		System.out.println("Galima papildyti cukraus, pieno arba pupeliu");

	}
}
