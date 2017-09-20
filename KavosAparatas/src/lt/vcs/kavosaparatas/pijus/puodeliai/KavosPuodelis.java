package lt.vcs.kavosaparatas.pijus.puodeliai;

import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.Products;
import lt.vcs.kavosaparatas.pijus.produktai.Produktai;

public class KavosPuodelis extends Puodelis implements CoffeeCup {
	private Produktai produktai;
	private String kavosPavadinimas;
	private boolean arPagaminta;

	public KavosPuodelis(String kavospavadinimas, int cukrus, int vanduo, int pupeles) {
		this.kavosPavadinimas = kavospavadinimas;
		this.produktai = new Produktai(cukrus, pupeles, vanduo);
	}

	@Override
	public boolean isKavaPagaminta() {
		return arPagaminta;
	}

	@Override
	public void setKavaPagaminta(boolean kavaPagaminta) {
		this.arPagaminta = kavaPagaminta;

	}

	public Produktai getProduktai() {
		return this.produktai.gaukKopija();
	}

}
