package lt.vcs.kavosaparatas.odeta.puodeliai;

import lt.vcs.kavosaparatas.odeta.produktai.Produktai;

public class KavosPuodelis extends Puodelis{
	
	private Produktai puodelioProduktai;
	
	private String kavosPavadinimas;
	
	
	private boolean arPagamintaKava;
	
	public KavosPuodelis(Produktai produktai) {
		this.puodelioProduktai = produktai;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "KavosPuodelis [puodelioProduktai=" + puodelioProduktai.getCukrausKiekis() + puodelioProduktai.getKavosPupeliuKiekis() + puodelioProduktai.getVandensKiekis() + ", kavosPavadinimas=" + kavosPavadinimas
				+ ", arPagamintaKava=" + arPagamintaKava + "]";
	}


	public Produktai getPuodelioProduktai() {
		return puodelioProduktai;
	}

}
