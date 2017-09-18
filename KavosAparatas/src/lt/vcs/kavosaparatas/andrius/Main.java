package lt.vcs.kavosaparatas.andrius;

import lt.vcs.kavosaparatas.andrius.aparatai.KavosAparatas;
import lt.vcs.kavosaparatas.andrius.resursai.Produktai;
import lt.vcs.kavosaparatas.andrius.servisai.KavosAparatuServisas;

// Main klasë kurioje bandau naudoti kavos aparatus
public class Main {

	// Metodas kuris padetu atskirti aparato metodu atspausdinamus rezultatus
	private static void spausdinkSkirtuka() {
		System.out.println("--------------------------------------");
	}

	public static void main(String[] args) {
		
		
		
		KavosAparatuServisas servisas = new KavosAparatuServisas();
		
		
		
		servisas.isplaukAparatà(null);
		
		KavosAparatas[] aparatuMasyvas = servisas.sukurkKavosAparatus(500);
		
		aparatuMasyvas[0].gaminkKava("");
		
		
		KavosAparatas k = new KavosAparatas(100);
		
		KavosAparatas k2 = new KavosAparatas(50);
		

	
		k2.produktai = new Produktai(0, 0, 0);
		
		
		Produktai prod = k2.getProduktai();
		
		
		prod.setPupeliuKiekis(55);
		
		
		
		
		
		k2.setProduktai(new Produktai(0, 0, 0));
		
		Produktai p = k2.getProduktai();// k2.produktai 
		
		k.sakykProduktuBusena();
		spausdinkSkirtuka();
		k2.sakykProduktuBusena();
		spausdinkSkirtuka();
		
		k.gaminkKava("dviguba");
		k2.gaminkKava("cukrine");
		
		k.sakykProduktuBusena();
		spausdinkSkirtuka();
		k2.sakykProduktuBusena();
		spausdinkSkirtuka();
		
		
//		k = null;
//		k = new KavosAparatas(100);
//		
//		k.produktai = new Produktai(505, 050, 50);
//		k.produktai = new Produktai(505, 050, 59);
//		k.produktai = null;
//	
//		KavosAparatas aparatas = new KavosAparatas(100, 100, 100);
//		
//		aparatas.ismurzinkAparata();
//
//		aparatas.arAparatasPasiruoses();
//		spausdinkSkirtuka();
//
//		aparatas.atlikPlovima();
//		spausdinkSkirtuka();
//
//		aparatas.sakykAparatoBusena();
//		spausdinkSkirtuka();
//
//		aparatas.sakykProduktuBusena();
//		spausdinkSkirtuka();
//
//		aparatas.gaminkKava("dviguba");
//		spausdinkSkirtuka();
//		
//		aparatas.gaminkKava("dviguba");
//		spausdinkSkirtuka();
//		
//		aparatas.gaminkKava("DAUG KAVOS");
//		spausdinkSkirtuka();
//		
//		aparatas.sakykAparatoBusena();
//		spausdinkSkirtuka();

	}
}
