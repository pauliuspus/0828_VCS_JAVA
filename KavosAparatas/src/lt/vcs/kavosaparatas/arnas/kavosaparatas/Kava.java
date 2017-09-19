package lt.vcs.kavosaparatas.arnas.kavosaparatas;

import java.util.Scanner;

import lt.vcs.kavosaparatas.arnas.produktai.Produktai;
import lt.vcs.kavosaparatas.arnas.puodeliai.BeCukrausPuodelis;
import lt.vcs.kavosaparatas.arnas.puodeliai.JuodaPuodelis;
import lt.vcs.kavosaparatas.arnas.puodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.arnas.puodeliai.PraskiestaPuodelis;

public class Kava {

	private int panaudojimuSkaicius;
	private static int panaudojimoSkaiciausRiba = 10;

	private Produktai produktai;

	public Kava(int cukrus, int kava, int vanduo) {
		produktai = new Produktai(cukrus, kava, vanduo);
	}

	public void kiekProduktuLike() {
		System.out.println("Cukraus likutis " + produktai.getCukrausKiekis() + " gramai(u)");
		System.out.println("Kavos likutis " + produktai.getKavosPupeles() + " gramai(u)");
		System.out.println("Vandens likutis " + produktai.getVandensKiekis() + " gramai(u)");
	}

	public void kiekLikoIkiPlovimo() {
		int likutis = panaudojimoSkaiciausRiba - panaudojimuSkaicius;
		System.out.println("Iki plovimo liko " + likutis + " kartai(u)");

	}

	public void aparatoValymas() {
		panaudojimuSkaicius = 0;
		System.out.println("Aparatas isvalytas");

	}

	public void cukrausPapildymas(int cukrusGramais) {
		produktai.setCukrausKiekis(produktai.getCukrausKiekis() + cukrusGramais);
		System.out.println("Cukraus papildyta");

	}

	public void kavosPupeliuPapildymas(int pupelesGramais) {
		produktai.setKavosPupeles(produktai.getKavosPupeles() + pupelesGramais);
		System.out.println("Kavos papildyta");

	}

	public void vandensPapildymas(int vanduoGramais) {
		produktai.setVandensKiekis(produktai.getVandensKiekis() + vanduoGramais);
		System.out.println("Vandens papildyta");

	}

	public void aparatoBusena() {
		kiekProduktuLike();
		kiekLikoIkiPlovimo();
	}

	public void arParuosta() {
		String arParuosta = null;
		if (arUztenkaProduktu() && (panaudojimuSkaicius < panaudojimoSkaiciausRiba)) {
			System.out.println("Pasiruosta naudotis");

		}
		if (produktai.getCukrausKiekis() < 10) {
			System.out.println("Prasau papildyti cukru");

		}
		if (produktai.getKavosPupeles() < 80) {
			System.out.println("Prasau papildyti kavos pupeliu");

		}
		if (produktai.getVandensKiekis() < 400) {
			System.out.println("Prasau papildyti vandens");

		}
		if (panaudojimuSkaicius >= panaudojimoSkaiciausRiba) {
			System.out.println("prasau isplaut aparata");

		}

	}

	public KavosPuodelis pasirinkKava() {
		Scanner input = new Scanner(System.in);
		String kavosTipas;
		KavosPuodelis kavosPuodelis = null;
		System.out.println("Iveskite kokios kavos pageidaujate");
		System.out.println("Juoda");
		System.out.println("Be cukraus");
		System.out.println("Praskiesta");

		kavosTipas = new String(input.nextLine().toUpperCase());
		switch (kavosTipas) {
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
			gaminkKava(kavosPuodelis);

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

	private void gaminkKava(KavosPuodelis kavosPuodelis) {
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

	public void setProduktai(Produktai produktai) {
		this.produktai = produktai;
	}

}
