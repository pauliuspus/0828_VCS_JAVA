package lt.vcs.kavosaparatas.arnas.produktai;

public class Produktai {

	private int cukrausKiekis;
	private int kavosPupeles;
	private int vandensKiekis;

	public Produktai(int cukrus, int kava, int vanduo) {
		cukrausKiekis = cukrus;
		kavosPupeles = kava;
		vandensKiekis = vanduo;
	}

	public Produktai produktuKopija() {
		Produktai produktuKopija = new Produktai(cukrausKiekis, kavosPupeles, vandensKiekis);
		return produktuKopija;
	}

	public int getCukrausKiekis() {
		return cukrausKiekis;
	}

	public void setCukrausKiekis(int cukrausKiekis) {
		this.cukrausKiekis = cukrausKiekis;
	}

	public int getKavosPupeles() {
		return kavosPupeles;
	}

	public void setKavosPupeles(int kavosPupeles) {
		this.kavosPupeles = kavosPupeles;
	}

	public int getVandensKiekis() {
		return vandensKiekis;
	}

	public void setVandensKiekis(int vandensKiekis) {
		this.vandensKiekis = vandensKiekis;
	}

}
