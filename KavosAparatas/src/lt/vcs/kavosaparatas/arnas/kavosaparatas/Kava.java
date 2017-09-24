package lt.vcs.kavosaparatas.arnas.kavosaparatas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import lt.vcs.kavosaparatas.arnas.produktai.Produktai;
import lt.vcs.kavosaparatas.arnas.puodeliai.BeCukrausPuodelis;
import lt.vcs.kavosaparatas.arnas.puodeliai.JuodaPuodelis;
import lt.vcs.kavosaparatas.arnas.puodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.arnas.puodeliai.PraskiestaPuodelis;
import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.CoffeeMashine;

public class Kava implements CoffeeMashine {

	private int panaudojimuSkaicius;
	private static int panaudojimoSkaiciausRiba = 10;
	private static int kavosAparatuSkaicius;
	public Map<String, KavosPuodelis> kavosPuodelioRusis = new HashMap<String, KavosPuodelis>();

	private Produktai produktai;

	public Kava(int cukrus, int kava, int vanduo) {
		produktai = new Produktai(cukrus, kava, vanduo);
		kavosAparatuSkaicius++;
	}

	public void sakykProduktuBusena() {
		System.out.println("Cukraus likutis " + produktai.getCukrausKiekis() + " gramai(u)");
		System.out.println("Kavos likutis " + produktai.getKavosPupeles() + " gramai(u)");
		System.out.println("Vandens likutis " + produktai.getVandensKiekis() + " gramai(u)");
	}

	public void kiekLikoIkiPlovimo() {
		int likutis = panaudojimoSkaiciausRiba - panaudojimuSkaicius;
		System.out.println("Iki plovimo liko " + likutis + " kartai(u)");

	}

	public void atlikPlovima() {
		panaudojimuSkaicius = 0;
		System.out.println("Aparatas isvalytas");

	}

	public void ismurzinkAparata() {
		this.panaudojimuSkaicius = panaudojimoSkaiciausRiba;
		System.out.println("DEMSIO DEMESIO DEMESIO - APARATUI DIRBTINAI PADIDINTAS PANAUDOJIMU SKAICIUS");
	}

	public void isvalykProduktus() {
		setProduktai(0, 0, 0);
	}

	public void papildykCukraus(int cukrusGramais) {
		produktai.setCukrausKiekis(produktai.getCukrausKiekis() + cukrusGramais);
		System.out.println("Cukraus papildyta");

	}

	public void papildykPupeliu(int pupelesGramais) {
		produktai.setKavosPupeles(produktai.getKavosPupeles() + pupelesGramais);
		System.out.println("Kavos papildyta");

	}

	public void papildykVandens(int vanduoGramais) {
		produktai.setVandensKiekis(produktai.getVandensKiekis() + vanduoGramais);
		System.out.println("Vandens papildyta");

	}

	public void sakykAparatoBusena() {
		sakykProduktuBusena();
		kiekLikoIkiPlovimo();
	}

	public boolean arAparatasPasiruoses() {
		boolean arParuosta = false;
		if (arUztenkaProduktu() && (panaudojimuSkaicius < panaudojimoSkaiciausRiba)) {
			System.out.println("Pasiruosta naudotis");
			arParuosta = true;
		}
		if (produktai.getCukrausKiekis() < 10) {
			System.out.println("Prasau papildyti cukru");
			return arParuosta;
		}
		if (produktai.getKavosPupeles() < 80) {
			System.out.println("Prasau papildyti kavos pupeliu");
			return arParuosta;
		}
		if (produktai.getVandensKiekis() < 400) {
			System.out.println("Prasau papildyti vandens");
			return arParuosta;
		}
		if (panaudojimuSkaicius >= panaudojimoSkaiciausRiba) {
			System.out.println("prasau isplaut aparata");
			return arParuosta;
		}
		return arParuosta;

	}

	public KavosPuodelis gaminkKava(String kavosTipas) {

		String pasirinkimas = kavosTipas.toUpperCase();
		KavosPuodelis kavosPuodelis = null;

		switch (pasirinkimas) {
		case "JUODA":
			kavosPuodelis = new JuodaPuodelis();
			break;
		case "BE CUKRAUS":
			kavosPuodelis = new BeCukrausPuodelis();
			break;
		case "PRASKIESTA":
			kavosPuodelis = new PraskiestaPuodelis();
			break;
		default:
			System.out.println("neteisingai ivedet pasirinkima, iveskite is naujo");
			break;
		}

		if (kavosPuodelis != null)
			gamink(kavosPuodelis);

		return kavosPuodelis;
	}

	// Minimalus produktu kiekis yra kiekis reikalingas bent 1 karta pagaminti bet
	// kuria kava.
	private boolean arUztenkaProduktu() {
		if (produktai.getKavosPupeles() - 80 < 0 || produktai.getCukrausKiekis() - 10 < 0
				|| produktai.getVandensKiekis() - 400 < 0) {
			return false;
		}
		return true;
	}

	private void gamink(KavosPuodelis kavosPuodelis) {
		if (arUztenkaProduktu()) {
			Produktai produktai = kavosPuodelis.getProduktai();
			gaminkKava(produktai.getCukrausKiekis(), produktai.getKavosPupeles(), produktai.getVandensKiekis());
			kavosPuodelis.setKavaPagaminta(true);
			System.out.println("Skanaus!");
		} else
			System.out.println("Papildykite produktu");

	}

	private void gaminkKava(int cukrus, int kava, int vanduo) {
		this.produktai.setCukrausKiekis(this.produktai.getCukrausKiekis() - cukrus);
		this.produktai.setKavosPupeles(this.produktai.getKavosPupeles() - kava);
		this.produktai.setVandensKiekis(this.produktai.getVandensKiekis() - vanduo);
		panaudojimuSkaicius++;
	}

	public static void kiekAparatuSukurta() {
		System.out.println("Is viso yra sukurta " + kavosAparatuSkaicius + " kavos Aparatu(ai)");
	}

	public void pridekPuodeli(String pavadinimas, int cukrus, int kava, int vanduo) {
		kavosPuodelioRusis.put(pavadinimas, new KavosPuodelis(pavadinimas, cukrus, kava, vanduo));
	}

	public void pasalinkPuodeli(String pavadinimas) {
		kavosPuodelioRusis.remove(pavadinimas);
	}

	public void pridekPuodeliuSarasa(Map<String, KavosPuodelis> sarasas) {
		kavosPuodelioRusis.putAll(sarasas);
	}
	
	public void gaminkKavaJeiYra(String kavosPavadinimas) {
		if (kavosPuodelioRusis.containsKey(kavosPavadinimas.toLowerCase())) {
			KavosPuodelis puodelioKopija = kavosPuodelioRusis.get(kavosPavadinimas);
			gamink(puodelioKopija);
		}else {
			System.out.println("Tokios kavos neturime");
		}
		
	}

	public int getPanaudojimuSkaicius() {
		return panaudojimuSkaicius;
	}

	public void setPanaudojimuSkaicius(int panaudojimuSkaicius) {
		this.panaudojimuSkaicius = panaudojimuSkaicius;
	}

	public static int getPanaudojimoSkaiciausRiba() {
		return panaudojimoSkaiciausRiba;
	}

	public static void setPanaudojimoSkaiciausRiba(int panaudojimoSkaiciausRiba) {
		Kava.panaudojimoSkaiciausRiba = panaudojimoSkaiciausRiba;
	}

	public void setProduktai(int cukrus, int kava, int vanduo) {
		produktai.setCukrausKiekis(cukrus);
		produktai.setKavosPupeles(kava);
		produktai.setVandensKiekis(vanduo);
	}

	public Produktai getProduktai() {
		return produktai;
	}

	public Produktai getProduktaiKopija() {
		return this.produktai.gaukKopija();
	}

	public void setProduktai(Produktai produktai) {
		this.produktai = produktai;
	}

	public static int getKavosAparatuSkaicius() {
		return kavosAparatuSkaicius;
	}

	public static void setKavosAparatuSkaicius(int kavosAparatuSkaicius) {
		Kava.kavosAparatuSkaicius = kavosAparatuSkaicius;
	}

	public Map<String, KavosPuodelis> getKavosPuodelioRusis() {
		return kavosPuodelioRusis;
	}

	public void setKavosPuodelioRusis(HashMap<String, KavosPuodelis> kavosPuodelioRusis) {
		this.kavosPuodelioRusis = kavosPuodelioRusis;
	}

}
