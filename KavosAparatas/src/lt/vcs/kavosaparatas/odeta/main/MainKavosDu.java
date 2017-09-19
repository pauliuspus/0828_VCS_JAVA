package lt.vcs.kavosaparatas.odeta.main;

import lt.vcs.kavosaparatas.odeta.aparatai.KavosAparatasDu;
import lt.vcs.kavosaparatas.odeta.produktai.Produktai;
import lt.vcs.kavosaparatas.odeta.servisai.KavosAparatuServisas;

public class MainKavosDu {

	public static void main(String[] args) {

		Produktai p = new Produktai(5, 5, 5);
		
		KavosAparatasDu kavosAparatasDu = new KavosAparatasDu();
		
		kavosAparatasDu.setProduktai(p);
		
		kavosAparatasDu.gaminkKava("juoda");
		
		//System.out.println(p.getCukrausKiekis());
		//System.out.println(p.getKavosPupeliuKiekis());
		//System.out.println(p.getVandensKiekis());
	
		KavosAparatuServisas kac = new KavosAparatuServisas();
		
		KavosAparatasDu aparatai[] = kac.sukurkKavosAparatus(3);
		
		aparatai[1].setProduktai(p);
		aparatai[1].pasakykProduktuBusena();
		aparatai[1].isvalykVisusProduktus();
		
		aparatai[1].pasakykProduktuBusena();

		
	
		//kavosAparatasDu.gaminkKava("juoda");
		
		//KavosAparatuServisas delKavosAparatu = new KavosAparatuServisas();
	
		//delKavosAparatu.sukurkKavosAparatus(5);
		

		
			
		//Produktai produktaiMusu = new Produktai(5, 10, 10);
		
		//produktaiMusu.getCukrausKiekis();
		
	}

}
