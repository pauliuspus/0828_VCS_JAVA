package lt.vcs.kavosaparatas.arnas.kavamain;

import java.util.HashMap;
import java.util.Map;

import lt.vcs.kavosaparatas.arnas.aparatoaptarnavimas.AparatoAptarnavimas;
import lt.vcs.kavosaparatas.arnas.kavos.PuodeliaiEnum;
import lt.vcs.kavosaparatas.arnas.kavosaparatas.Kava;
import lt.vcs.kavosaparatas.arnas.puodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.common.exceptions.NesvarusAparatas;
import lt.vcs.kavosaparatas.common.exceptions.TrukstaProduktu;

public class KavaMain {

	public static void main(String[] args) {
		
		
		
		/*Kava naujas = new Kava(20,80, 400);
		try {
		naujas.gaminkKava("Juoda");
		
		}catch(TrukstaProduktu e){
			System.out.println(e.getMessage());
		}catch(NesvarusAparatas e) {
		System.out.println(e.getMessage());}*/
		
		Map<String, KavosPuodelis> sarasas = new HashMap<String, KavosPuodelis>();
		
		sarasas.put("Pilka", new KavosPuodelis("Pilka", 20, 20, 30));
		sarasas.put("raudona", new KavosPuodelis("raudona", 20, 20, 30));
		sarasas.put("zalia", new KavosPuodelis("zalia", 20, 20, 30));
		
		Kava naujas2 = new Kava(80, 80, 400, sarasas);
		
		for(String a: sarasas.keySet())
		System.out.println(a);
		try {
			naujas2.gaminkKavaJeiYra("Pilka");
		} catch (NesvarusAparatas e) {
			e.printStackTrace();
		} catch (TrukstaProduktu e) {
			e.printStackTrace();
		}
		
		/*naujas.ismurzinkAparata();
		try {
			naujas.gaminkKava("juoda");
			
			}catch(ExceptionTrukstaProduktu e){
				System.out.println(e.getMessage());
			}catch(ExceptionAparataReikiaValyt e) {
				System.out.println(e.getMessage());}*/
		
		
		
		
		
		
		
		
		
		
		//AparatoAptarnavimas tarnas = new AparatoAptarnavimas();
		/*Kava kava = new Kava(300, 300, 400);
		Kava kava2 = new Kava(300, 300, 400);
		tarnas.sukurkNAparatu(25);
		kava.kiekAparatuSukurta();

		Kava aparatas = new Kava(10, 80, 500);
		Kava aparatas2 = new Kava(100, 90, 400);
		AparatoAptarnavimas aptarnavimas = new AparatoAptarnavimas();

		Kava[] aparatuMasyvas = aptarnavimas.sukurkNAparatu();

		aparatuMasyvas[0].gaminkKava("Juoda");
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].sakykProduktuBusena();
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
		aptarnavimas.priskirkPasirinktoMasyvoProduktus(aparatuMasyvas, 3);
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].sakykProduktuBusena();
			System.out.println();
		}

		aparatuMasyvas[0].gaminkKava("Juoda");
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].sakykProduktuBusena();
			System.out.println();
		}

		aparatas.pridekPuodeli("balta", 10, 10, 10);
		aparatas.pridekPuodeli("pilka", 20, 20, 20);
		aparatas.pridekPuodeli("raudona", 10, 80, 300);
		aparatas.sakykProduktuBusena();
		aparatas.gaminkKavaJeiYra("balta");
		for (String s : aparatas.getKavosPuodelioRusis().keySet()) {
			System.out.println(s);
		}
		aparatas.pasalinkPuodeli("pilka");
		System.out.println("_____________________________");
		for (String s : aparatas.getKavosPuodelioRusis().keySet()) {
			System.out.println(s);
		}
		Map<String, KavosPuodelis> sarasas = new HashMap<String, KavosPuodelis>();
		sarasas.put("juoda", new KavosPuodelis("juoda", 20, 20, 200));
		sarasas.put("zalia", new KavosPuodelis("zalia", 20, 20, 200));

		aparatas.pridekPuodeliuSarasa(sarasas);
		System.out.println("_____________________________");
		for (String s : aparatas.getKavosPuodelioRusis().keySet()) {
			System.out.println(s);
		}*/

	}

}
