package lt.vcs.kavosaparatas.pijus.produktai;

import lt.vcs.kavosaparatas.common.Products;

public class Produktai implements Products {
	// Kintamieji
	private int vandensKiekis;
	private int cukrausKiekis;
	private int pupeliuKiekis;

	// constructor
	public Produktai(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		this.vandensKiekis = vandensKiekis;
		this.pupeliuKiekis = pupeliuKiekis;
		this.cukrausKiekis = cukrausKiekis;
	}

	public int getVandensKiekis() {
		return vandensKiekis;
	}

	public void setVandensKiekis(int vandensKiekis) {
		this.vandensKiekis = vandensKiekis;
	}

	public int getCukrausKiekis() {
		return cukrausKiekis;
	}

	public void setCukrausKiekis(int cukrausKiekis) {
		this.cukrausKiekis = cukrausKiekis;
	}

	public int getPupeliuKiekis() {
		return pupeliuKiekis;
	}

	public void setPupeliuKiekis(int pupeliuKiekis) {
		this.pupeliuKiekis = pupeliuKiekis;
	}

	public Produktai gaukKopija() {
		return new Produktai(vandensKiekis, cukrausKiekis, pupeliuKiekis);
	}

}
