package lt.vcs.kavosaparatas.odeta.puodeliai;

import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.Products;
import lt.vcs.kavosaparatas.odeta.produktai.Produktai;

public class KavosPuodelis extends Puodelis implements CoffeeCup {
	
	protected Produktai puodelioProduktai;
	
	protected String kavosPavadinimas;
	

	// default, kad kava yra nepagaminta:
	protected boolean kavaPagaminta = false;
	
	
	//reikia updatinti:
	public KavosPuodelis(Produktai produktai) {
		this.puodelioProduktai = produktai;
	
	}

	public KavosPuodelis(String kava,int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
		this.kavosPavadinimas = kava;
		this.puodelioProduktai = new Produktai(cukrausKiekis, kavosPupeliuKiekis, vandensKiekis);
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
