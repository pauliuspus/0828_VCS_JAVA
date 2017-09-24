package lt.vcs.kavosaparatas.arnas.kavamain;
import java.util.HashMap;
import java.util.Map;

import lt.vcs.kavosaparatas.arnas.aparatoaptarnavimas.AparatoAptarnavimas;
import lt.vcs.kavosaparatas.arnas.kavosaparatas.Kava;
import lt.vcs.kavosaparatas.arnas.puodeliai.KavosPuodelis;


public class KavaMain {

	public static void main(String[] args) {
		AparatoAptarnavimas tarnas = new AparatoAptarnavimas();
		
		
		/*
		Kava kava = new Kava(300, 300, 400);
		Kava kava2 = new Kava(300, 300, 400);
		tarnas.sukurkNAparatu(25);
		kava.kiekAparatuSukurta();*/
		
		
		
		
		
		
		
		Kava aparatas = new Kava(10, 80, 500);
		Kava aparatas2 = new Kava(100, 90, 400);
		AparatoAptarnavimas aptarnavimas = new AparatoAptarnavimas();

		/*Kava[] aparatuMasyvas = aptarnavimas.sukurkNAparatu();

		aparatuMasyvas[0].gaminkKava("Juoda");
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].sakykProduktuBusena();
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
		aptarnavimas.priskirkPasirinktoMasyvoProduktus(aparatuMasyvas, 3 );
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].sakykProduktuBusena();
			System.out.println();
		}

		aparatuMasyvas[0].gaminkKava("Juoda");
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].sakykProduktuBusena();
			System.out.println();
		}*/
		
		
		aparatas.pridekPuodeli("balta", 10, 10, 10);
		aparatas.pridekPuodeli("pilka", 20, 20, 20);
		aparatas.pridekPuodeli("raudona", 10, 80, 300);
		aparatas.sakykProduktuBusena();
		aparatas.gaminkKavaJeiYra("balta");
		for(String s: aparatas.getKavosPuodelioRusis().keySet()) {
			System.out.println(s);
		}
		aparatas.pasalinkPuodeli("pilka");
		System.out.println("_____________________________");
		for(String s: aparatas.getKavosPuodelioRusis().keySet()) {
			System.out.println(s);
		}
		Map<String, KavosPuodelis> sarasas = new HashMap<String, KavosPuodelis>();
		sarasas.put("juoda", new KavosPuodelis("juoda", 20, 20, 200));
		sarasas.put("zalia", new KavosPuodelis("zalia", 20, 20, 200));
		
		aparatas.pridekPuodeliuSarasa(sarasas);
		System.out.println("_____________________________");
		for(String s: aparatas.getKavosPuodelioRusis().keySet()) {
			System.out.println(s);
		}
		
		
		/*Kava aparatas= new Kava(10, 10, 10);
		Kava aparatas2 = new Kava(20,20,20);
		AparatoAptarnavimas aptarnavimas = new AparatoAptarnavimas();
		aparatas.kiekProduktuLike();
		System.out.println();
		aparatas2.kiekProduktuLike();
		System.out.println();
		aptarnavimas.priskirkProduktus(aparatas, aparatas2.getProduktai());
		aparatas.kiekProduktuLike();
		System.out.println();
		aparatas2.kiekProduktuLike();*/

	}

}
