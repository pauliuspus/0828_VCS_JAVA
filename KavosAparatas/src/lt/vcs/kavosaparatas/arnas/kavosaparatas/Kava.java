package lt.vcs.kavosaparatas.arnas.kavosaparatas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import lt.vcs.kavosaparatas.arnas.kavos.BeCukrausPuodelis;
import lt.vcs.kavosaparatas.arnas.kavos.JuodaPuodelis;
import lt.vcs.kavosaparatas.arnas.kavos.PraskiestaPuodelis;
import lt.vcs.kavosaparatas.arnas.kavos.PuodeliaiEnum;
import lt.vcs.kavosaparatas.arnas.produktai.Produktai;
import lt.vcs.kavosaparatas.arnas.puodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.common.exceptions.NesvarusAparatas;
import lt.vcs.kavosaparatas.common.exceptions.TrukstaProduktu;

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
	
	public Kava(int cukrus, int kava, int vanduo,Map<String, KavosPuodelis> puodeliuSarasas ) {
		produktai = new Produktai(cukrus, kava, vanduo);
		pridekPuodeliuSarasa(puodeliuSarasas);
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
		boolean arParuosta = true;
		if (produktai.getKavosPupeles() - 80 < 0 || produktai.getCukrausKiekis() - 10 < 0
				|| produktai.getVandensKiekis() - 400 < 0) {
			arParuosta = false;
		}
		if (panaudojimuSkaicius >= panaudojimoSkaiciausRiba) {
			arParuosta = false;
		}
		return arParuosta;

	}

	public final KavosPuodelis gaminkKava(String kavosTipas) throws NesvarusAparatas, TrukstaProduktu {

		PuodeliaiEnum puodelis = PuodeliaiEnum.valueOf(kavosTipas.toUpperCase());
		KavosPuodelis kavosPuodelis = (KavosPuodelis) puodelis.getPuodelis();

		if (kavosPuodelis != null) {
			if (arAparatasPasiruoses()) {
				gamink(kavosPuodelis);
			} else {
				sakyKoTruksta();
			}
		}
		return kavosPuodelis;
	}

	private void sakyKoTruksta() throws NesvarusAparatas, TrukstaProduktu {

		if (produktai.getCukrausKiekis() < 10) {
			throw new TrukstaProduktu("Truksta cukraus, prasau papildyti");

		}
		if (produktai.getKavosPupeles() < 80) {
			throw new TrukstaProduktu("Truksta kavos, prasau papildyti");

		}
		if (produktai.getVandensKiekis() < 400) {
			throw new TrukstaProduktu("Truksta vandens, prasau papildyti");
		}
		if (panaudojimuSkaicius >= panaudojimoSkaiciausRiba) {
			throw new NesvarusAparatas("Prasau isplauti aparata");
		}
	}

	private void gamink(KavosPuodelis kavosPuodelis) throws NesvarusAparatas, TrukstaProduktu {

		Produktai produktai = kavosPuodelis.getProduktai();
		gaminkKava(produktai.getCukrausKiekis(), produktai.getKavosPupeles(), produktai.getVandensKiekis());
		kavosPuodelis.setKavaPagaminta(true);
		System.out.println("Skanaus!");

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

	public void gaminkKavaJeiYra(String kavosPavadinimas) throws NesvarusAparatas, TrukstaProduktu {
		if (kavosPuodelioRusis.containsKey(kavosPavadinimas.toLowerCase())) {
			KavosPuodelis puodelioKopija = kavosPuodelioRusis.get(kavosPavadinimas);
			if (arAparatasPasiruoses()) {
				gamink(puodelioKopija);
			} else {
				sakyKoTruksta();
			}

		} else {
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
