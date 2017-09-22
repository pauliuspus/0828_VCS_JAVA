package lt.vcs.kavosaparatas.andrius.resursai;

import lt.vcs.kavosaparatas.common.Products;

public class Produktai implements Products{
	private int vandensKiekis = 0;
	private int cukrausKiekis = 0;
	private int pupeliuKiekis = 0;

	public Produktai(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		this.vandensKiekis = vandensKiekis;
		this.cukrausKiekis = cukrausKiekis;
		this.pupeliuKiekis = pupeliuKiekis;
	}

	// Metodas kuris sukuria kita objekta, perduodamas jam tokias pacias
	// produktu reiksmes
	public Produktai gaukKopija() {
		return new Produktai(vandensKiekis, cukrausKiekis, pupeliuKiekis);
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

	@Override
	public String toString() {
		return "Produktai [vandensKiekis=" + vandensKiekis + ", cukrausKiekis=" + cukrausKiekis + ", pupeliuKiekis="
				+ pupeliuKiekis + "]";
	}
	
}
