package lt.vcs.kavosaparatas.odeta.aparatai;

import lt.vcs.kavosaparatas.odeta.produktai.Produktai;

public class KavosAparatasDu {

	private Produktai produktai;

	public int panaudojimuKiekis = 0;

	// konstanta (visiems objektams, kuriems kuri bus tas pats):
	// final - nekeiciamas
	private static final int PANAUDOJIMU_SKAICIUS_KADA_PLAUTI = 100;

	// cia kad reikia visu triju produktu vienu metu, kad galiu tureti kitiems
	// produktam default value
	private static final int DEFAULT_PRODUCT_VALUE = 50;

	//konstruktorius, kuris priima produktu kiekisu
	
	public KavosAparatasDu(int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
		produktai = new Produktai(cukrausKiekis, kavosPupeliuKiekis, vandensKiekis);
	}
	
	public KavosAparatasDu() {
		this(DEFAULT_PRODUCT_VALUE, DEFAULT_PRODUCT_VALUE, DEFAULT_PRODUCT_VALUE);
	}

	public void gaminkKava(String kavosTipas) {
		switch (kavosTipas) {
		case "juoda":
			gaminkKava(1, 2, 3);
			break;
		case "latte":
			gaminkKava(1, 3, 4);
			break;
		case "capuccino":
			gaminkKava(1, 2, 6);
			break;
		default:
			System.out.println("Atsiprasome, tokios kavos rusies neturime");
		}
	}

	//nereikia this prie produktu, nes cia 
	
	private void gaminkKava(int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
		if (arUzteksProduktu(cukrausKiekis, kavosPupeliuKiekis, vandensKiekis) & arPasiruosesGaminimui() & !arJauReikiaPlovimo()) {
		produktai.setCukrausKiekis(produktai.getCukrausKiekis() - cukrausKiekis);
		produktai.setKavosPupeliuKiekis(produktai.getKavosPupeliuKiekis() - kavosPupeliuKiekis);
		produktai.setVandensKiekis(produktai.getVandensKiekis() - vandensKiekis);
			this.panaudojimuKiekis++;
			System.out.println("Kava pagaminta ---- SKANAUS!");
			
		} else {
			System.out.println("Kavos pagaminti negalima");
		}
	}

	public boolean arUzteksProduktu(int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
		if (produktai.getCukrausKiekis() - cukrausKiekis >= 0 & produktai.getKavosPupeliuKiekis() - kavosPupeliuKiekis >= 0 & produktai.getVandensKiekis()- vandensKiekis >+ 0) {
			System.out.println("Produktu uzteks");
			return true;
		}else {
			System.out.println("Produktu neuzteks - truksta bent vieno produkto");
			return false;
		}
		
	}

	public void atlikPlovima() {
		if (arJauReikiaPlovimo()) {
			System.out.println("Plovimas atliktas");
			this.panaudojimuKiekis = 0;
		} else {
			System.out.println("Plovimo dar nereikia :)");
		}
	}
	
	
	public void isvalykVisusProduktus() {
		produktai.setCukrausKiekis(0);
		produktai.setKavosPupeliuKiekis(0);
		produktai.setVandensKiekis(0);
	}
	
	public boolean arJauReikiaPlovimo() {
		if (this.panaudojimuKiekis == PANAUDOJIMU_SKAICIUS_KADA_PLAUTI) {
			System.out.println("Plovimo reikia");
			return true;
		} else {
			System.out.println("Plovimo nereikia");
			return false;
		}
	}

	public boolean arPasiruosesGaminimui() {
		if ((arProduktaiNeNuliai() & pasakykArIsivales())) {
			System.out.println("Pasiruoses");
			return true;
		} else {
			System.out.println("Nepasiruoses");
			return false;
		}

	}

	private boolean arProduktaiNeNuliai() {
		if (produktai.getVandensKiekis() > 0 || produktai.getCukrausKiekis() > 0 || produktai.getKavosPupeliuKiekis() > 0) {
			return true;
		} else {
			System.out.println("Neuztenka bent vieno produkto");
			return false;
		}

	}

	public boolean pasakykArIsivales() {
		if (this.panaudojimuKiekis == 0) {
			System.out.println("Aparatas issivales");
			return true;
		} else {
			System.out.println("Aparatas dar neissivales");
			return false;
		}
	}

	public void pasakykKokiaAparatoBusena() {
		pasakykProduktuBusena();
		pasakykKiekLikoPanaudojimuIkiPlovimo();
	}

	public void pasakykKiekLikoPanaudojimuIkiPlovimo() {
		System.out.println("Iki plovimo liko: " + (PANAUDOJIMU_SKAICIUS_KADA_PLAUTI - panaudojimuKiekis));
	}

	public void pasakykProduktuBusena() {
		System.out.println("Cukraus liko: " + produktai.getCukrausKiekis());
		System.out.println("Kavos pupeliu liko: " + produktai.getKavosPupeliuKiekis());
		System.out.println("Vandens liko: " + produktai.getVandensKiekis());
	}

	public Produktai getProduktai() {
		return this.produktai;
	}
	
	public Produktai getProduktaiKopija() {
		return this.produktai.gaukKopija();
	}

	public void setProduktai(Produktai produktai) {
		this.produktai = produktai;
	}
	
	
	//Produktu papildymu metodai:

	public void papildykCukrausKieki (int cukrausKiekis) {
		produktai.setCukrausKiekis(produktai.getCukrausKiekis() + cukrausKiekis);
	}
	
	public void papildykKavosPupeliuKieki (int kavosPupeliuKiekis) {
		produktai.setKavosPupeliuKiekis(produktai.getKavosPupeliuKiekis() + kavosPupeliuKiekis);
	}
	
	public void papildykVandensKieki (int vandensKiekis) {
		produktai.setVandensKiekis(produktai.getVandensKiekis() + vandensKiekis);
	}
	
}