package lt.vcs.kavosaparatas.odeta.aparatai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.common.exceptions.TrukstaProduktu;
import lt.vcs.kavosaparatas.odeta.kavospuodeliai.CapuccinoKavosPuodelis;
import lt.vcs.kavosaparatas.odeta.kavospuodeliai.JuodosKavosPuodelis;
import lt.vcs.kavosaparatas.odeta.kavospuodeliai.LatteKavosPuodelis;
import lt.vcs.kavosaparatas.odeta.produktai.Produktai;
import lt.vcs.kavosaparatas.odeta.puodeliai.KavosPuodelis;

public class KavosAparatasDu implements CoffeeMashine {

	private Produktai produktai;

	public int panaudojimuKiekis = 0;

	// konstanta (visiems objektams, kuriems kuri bus tas pats):
	// final - nekeiciamas
	private static final int PANAUDOJIMU_SKAICIUS_KADA_PLAUTI = 100;

	// cia kad reikia visu triju produktu vienu metu, kad galiu tureti kitiems
	// produktam default value
	private static final int DEFAULT_PRODUCT_VALUE = 50;
	
	public Map<String, KavosPuodelis> kavosPuodeliuRusys = new HashMap<String, KavosPuodelis>();
	
	public void pridekPuodeli(String puodelioPavadinimas, KavosPuodelis puodelis) {
		kavosPuodeliuRusys.put(puodelioPavadinimas, puodelis);
		
	}
	
	public void pasalinkPuodeli(String puodelioPavadinimas) {
		kavosPuodeliuRusys.remove(puodelioPavadinimas);
		
	}
	
	
	/*public void pridekPuodeliuSarasa (ArrayList<KavosPuodelis> pridedamasPuodeliuListas) {
		kavosPuodeliuRusys.put(pridedamasPuodeliuListas);
		
	}*/
	
	//konstruktorius, kuris priima produktu kiekisu
	
	public KavosAparatasDu(int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
		produktai = new Produktai(cukrausKiekis, kavosPupeliuKiekis, vandensKiekis);
	}
	
	public KavosAparatasDu() {
		this(DEFAULT_PRODUCT_VALUE, DEFAULT_PRODUCT_VALUE, DEFAULT_PRODUCT_VALUE);
	}
	
	
	public KavosPuodelis gaminkKava(String kavosTipas) {
		
		KavosPuodelis puodelis = null;
		switch (kavosTipas) {
		case "juoda":
			puodelis = new JuodosKavosPuodelis();
			break;
		case "latte":
			puodelis = new LatteKavosPuodelis();
			break;
		case "capuccino":
			puodelis = new CapuccinoKavosPuodelis();
			break;
		default:
			System.out.println("Atsiprasome, tokios kavos rusies neturime");
			break;
		}
		
		if(puodelis != null)
			gaminkKava(puodelis);
		
		return puodelis;
	}
	
	public void gaminkKava(KavosPuodelis puodelis) {
		Produktai produktai = puodelis.getProduktai();
		gaminkKava(produktai.getCukrausKiekis(), produktai.getKavosPupeliuKiekis(), produktai.getVandensKiekis());
		puodelis.setKavaPagaminta(true);
	
		
	}
	
	public void gaminkKava() throws TrukstaProduktu {
	if (!arAparatasPasiruoses()) {
		throw new TrukstaProduktu("Truksta produktu, kavos gaminti negalime");
	}
	}
	
	
	
	
	public void gaminkKavaKitaip(String kavosTipas)throws TrukstaProduktu {
		if (!arAparatasPasiruoses()) {
			throw new TrukstaProduktu("Truksta produktu, kavos gaminti negalime");
		}
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

	//nereikia this prie produktu
	
	private void gaminkKava(int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
		if (arUzteksProduktu(cukrausKiekis, kavosPupeliuKiekis, vandensKiekis) & arAparatasPasiruoses() & !arJauReikiaPlovimo()) {
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
	
	
	public void isvalykProduktus() {
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

	public boolean arAparatasPasiruoses() {
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

	public void sakykAparatoBusena() {
		sakykProduktuBusena();
		pasakykKiekLikoPanaudojimuIkiPlovimo();
	}

	public void pasakykKiekLikoPanaudojimuIkiPlovimo() {
		System.out.println("Iki plovimo liko: " + (PANAUDOJIMU_SKAICIUS_KADA_PLAUTI - panaudojimuKiekis));
	}

	public void sakykProduktuBusena() {
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

	public void papildykCukraus (int cukrausKiekis) {
		produktai.setCukrausKiekis(produktai.getCukrausKiekis() + cukrausKiekis);
	}
	
	public void papildykKavosPupeliu (int kavosPupeliuKiekis) {
		produktai.setKavosPupeliuKiekis(produktai.getKavosPupeliuKiekis() + kavosPupeliuKiekis);
	}
	
	public void papildykVandens (int vandensKiekis) {
		produktai.setVandensKiekis(produktai.getVandensKiekis() + vandensKiekis);
	}

	
	//sitie buvo auto importuoti. Reikia updatinti/sutvarkyti:
	
	/*@Override
	public CoffeeCup gaminkKava(String kavosTipas) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	
	

	@Override
	public void ismurzinkAparata() {
		this.panaudojimuKiekis = PANAUDOJIMU_SKAICIUS_KADA_PLAUTI;
        System.out.println("DEMSIO DEMESIO DEMESIO - APARATUI DIRBTINAI PADIDINTAS PANAUDOJIMU SKAICIUS");
		
	}


	@Override
	public void papildykPupeliu(int pupeliuKiekis) {
		// TODO Auto-generated method stub
		
	}

	
}