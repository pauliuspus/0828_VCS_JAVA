package lt.vcs.kavosaparatas.odeta.puodeliai;

import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.Products;
import lt.vcs.kavosaparatas.odeta.produktai.Produktai;

public class KavosPuodelis extends Puodelis implements CoffeeCup {
	
	private Produktai puodelioProduktai;
	
	private String kavosPavadinimas;
	

	// default, kad kava yra nepagaminta:
	protected boolean kavaPagaminta = false;
	
	
	//reikia updatinti:
	public KavosPuodelis(Produktai produktai) {
		this.puodelioProduktai = produktai;
	
	}

	
	@Override
	public boolean isKavaPagaminta() {
		
		return kavaPagaminta;
	}

	@Override
	public String toString() {
		return "KavosPuodelis [puodelioProduktai=" + puodelioProduktai.getCukrausKiekis() + puodelioProduktai.getKavosPupeliuKiekis() + puodelioProduktai.getVandensKiekis() + ", kavosPavadinimas=" + kavosPavadinimas
				+ ", isKavaPagaminta=" + isKavaPagaminta() + "]";
	}


	public Produktai getPuodelioProduktai() {
		return puodelioProduktai;
	}


	@Override
	public void setKavaPagaminta(boolean kavaPagaminta) {
	this.kavaPagaminta = kavaPagaminta;
	
		
	}


	@Override
	public Produktai getProduktai() {
		return this.puodelioProduktai;
	}

}
