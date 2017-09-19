package lt.vcs.kavosaparatas.arnas.puodeliai;

import lt.vcs.kavosaparatas.arnas.produktai.Produktai;
import lt.vcs.kavosaparatas.common.CoffeeCup;

public class KavosPuodelis extends Puodelis implements CoffeeCup {

	protected String kavosPavadinimas;
	protected boolean arPagaminta;
	protected Produktai produktaiKavai;
	
	protected KavosPuodelis (String kavosPavadinimas, int cukrus, int kava, int vanduo) {
		produktaiKavai = new Produktai(cukrus, kava, vanduo);
		this.kavosPavadinimas = kavosPavadinimas;
	}

	public boolean isKavaPagaminta() {
		return arPagaminta;
	}
	
	public void setKavaPagaminta (boolean arPagaminta) {
		this.arPagaminta = arPagaminta;
	}
	
	public Produktai getProduktai() {
		return this.produktaiKavai.gaukKopija();
	}
	
	@Override
	public String toString() {
		return kavosPavadinimas + (arPagaminta ? " pagaminta" : " nepagaminta");
	}
	
}
