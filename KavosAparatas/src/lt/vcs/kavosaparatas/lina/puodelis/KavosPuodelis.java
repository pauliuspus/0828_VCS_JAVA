package lt.vcs.kavosaparatas.lina.puodelis;

import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.lina.produkcija.Produktai;

public class KavosPuodelis extends Puodelis implements CoffeeCup {
	private Produktai produktai;
	private String kavosPavadinimas;
	private boolean arPagaminta;

	public KavosPuodelis(String kavospavadinimas, int cukrus, int vanduo, int pupeles) {
		this.kavosPavadinimas = kavospavadinimas;
		this.produktai = new lt.vcs.kavosaparatas.lina.produkcija.Produktai(cukrus, pupeles, vanduo);
	}

	public boolean isKavaPagaminta() {
		return arPagaminta;
	}

	public void setKavaPagaminta(boolean arPagaminta) {
		this.arPagaminta = arPagaminta;
	}

	public Produktai getProduktai() {
		return this.produktai.gaukKopija();
	}

	public void kavaPagaminta() {
		arPagaminta = true;
	}

	// public String toString() {
	// return System.out.println(arPagaminta ? "pagaminta" : "nepagaminta");
	// }
}
