package lt.vcs.kavosaparatas.odeta.main;

import lt.vcs.kavosaparatas.odeta.aparatai.KavosAparatasDu;
import lt.vcs.kavosaparatas.odeta.produktai.Produktai;
import lt.vcs.kavosaparatas.odeta.servisai.KavosAparatuServisas;

public class MainKavosDu {

	public static void main(String[] args) {

		Produktai p = new Produktai(5, 5, 5);
		
		KavosAparatuServisas kac = new KavosAparatuServisas();
		
		KavosAparatasDu aparatas =kac.sukurVienaKavosAparata();
		
		aparatas.setProduktai(p);
		
		aparatas.gaminkKava("juoda");
		
		
		//System.out.println(p.getCukrausKiekis());
		//System.out.println(p.getKavosPupeliuKiekis());
		//System.out.println(p.getVandensKiekis());
		
		kac.sakykKiekBuvoSukurtaAparatu();
		
		KavosAparatasDu aparatai[] = kac.sukurkKavosAparatus(8);
		
		aparatai[1].setProduktai(p);
		aparatai[1].sakykProduktuBusena();
		aparatai[1].isvalykProduktus();
		
		aparatai[1].sakykProduktuBusena();

	kac.sakykKiekBuvoSukurtaAparatu();
		
		
	
		//kavosAparatasDu.gaminkKava("juoda");
		
		//KavosAparatuServisas delKavosAparatu = new KavosAparatuServisas();
	
		//delKavosAparatu.sukurkKavosAparatus(5);
			
		//Produktai produktaiMusu = new Produktai(5, 10, 10);
		
		//produktaiMusu.getCukrausKiekis();
	
	
		
	}

}
