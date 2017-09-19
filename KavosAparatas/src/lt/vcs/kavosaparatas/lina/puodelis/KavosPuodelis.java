package lt.vcs.kavosaparatas.lina.puodelis;

import lt.vcs.kavosaparatas.lina.produkcija.Produktai;

public class KavosPuodelis extends Puodelis {
	private Produktai produktai;
	private String kavosPavadinimas;
	private boolean arPagaminta;

	public KavosPuodelis(String kavospavadinimas, int cukrus, int vanduo, int pupeles) {
		this.kavosPavadinimas = kavospavadinimas;
		this.produktai = new lt.vcs.kavosaparatas.lina.produkcija.Produktai(cukrus, pupeles, vanduo);
	}

	public boolean arKavaPagaminta() {
		return arPagaminta;
	}

	// public Produktai getProduktai() {
	// return this.produktai.grazinkKopija();
	// }

	public Produktai getProduktai() {
		return this.produktai.grazinkKopija();
	}

	public void kavaPagaminta() {
		arPagaminta = true;
	}

	// public String toString() {
	// return System.out.println(arPagaminta ? "pagaminta" : "nepagaminta");
	// }
}
