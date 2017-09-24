package lt.vcs.kavosaparatas.arnas.aparatoaptarnavimas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import lt.vcs.kavosaparatas.arnas.kavosaparatas.Kava;
import lt.vcs.kavosaparatas.arnas.produktai.Produktai;

public class AparatoAptarnavimas {

	public Kava sukurkAparata(int cukrus, int kava, int vanduo) {
		Kava naujasAparatas = new Kava(cukrus, kava, vanduo);
		return naujasAparatas;
	}

	public void isplaukAparata(Kava aparatas) {
		aparatas.setPanaudojimuSkaicius(0);

	}

	public Kava[] sukurkNAparatu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Iveskite kiek aparatu sukurti");
		int kiekAparatuSukurt = input.nextInt();
		Kava[] aparatuMasyvas = new Kava[kiekAparatuSukurt];
		for (int i = 0; i < kiekAparatuSukurt; i++) {
			aparatuMasyvas[i] = sukurkAparata(100, 400, 800);
		}
		return aparatuMasyvas;
	}

	public List<Kava> sukurkNAparatu(int kiekAparatuSukurtiListe) {
		List<Kava> kavosAparatuListas = new ArrayList<Kava>(kiekAparatuSukurtiListe);
		for (int i = 0; i < kavosAparatuListas.size(); i++) {
			kavosAparatuListas.add(i, new Kava(100, 400, 800));
		}
		return kavosAparatuListas;
	}

	public Map<Integer, Kava> sukurkNAparatu(Kava[] aparatuMasyvasSumappinimui) {
		Map<Integer, Kava> aparatuMapas = new HashMap<Integer, Kava>();
		for (int i = 0; i < aparatuMasyvasSumappinimui.length; i++) {
			aparatuMapas.put(i + 1, aparatuMasyvasSumappinimui[i]);
		}
		return aparatuMapas;
	}

	public void isvalykProduktus(Kava aparatas) {
		System.out.println("Buvo isvalyta " + aparatas.getProduktai().getCukrausKiekis() + " cukraus, "
				+ aparatas.getProduktai().getKavosPupeles() + " pupeliu, " + aparatas.getProduktai().getVandensKiekis()
				+ " vandens");
		aparatas.setProduktai(0, 0, 0);
	}

	public void isplaukAparatus(Kava[] aparatuMasyvas) {
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].atlikPlovima();
		}
	}

	public void isplaukAparatus(List<Kava> aparatuListas) {
		for (int i = 0; i < aparatuListas.size(); i++) {
			aparatuListas.get(i).atlikPlovima();
		}
	}

	public void isplaukAparatus(Map<Integer, Kava> aparatuMapas) {
		for (int i : aparatuMapas.keySet()) {
			aparatuMapas.get(i).atlikPlovima();
		}
	}

	// priskiria pasirinkto masyvo nario produktus visam masyvui
	public void priskirkPasirinktoMasyvoProduktus(Kava[] aparatuMasyvas, int kurisMasyvoNarys) {
		if (kurisMasyvoNarys<0 || kurisMasyvoNarys>aparatuMasyvas.length) {
			System.out.println("Sis masyvas neturi tiek nariu, prasau ivesti skaiciu nuo  1 iki " + aparatuMasyvas.length);
		}else {
			for (int i = 0; i < aparatuMasyvas.length; i++) {
				aparatuMasyvas[i].setProduktai(aparatuMasyvas[kurisMasyvoNarys - 1].getProduktai());

			}
		}
			
		
	}

	public void priskirkPasirinktoMasyvoProduktus(List<Kava> aparatuListas, int kurisMasyvoNarys) {
		if(kurisMasyvoNarys<0 || kurisMasyvoNarys>aparatuListas.size()) {
			System.out.println("Sis masyvas neturi tiek nariu, prasau ivesti skaiciu nuo  1 iki " + aparatuListas.size());
		}else {
			for (int i = 0; i < aparatuListas.size(); i++) {
				aparatuListas.get(i).setProduktai(aparatuListas.get(kurisMasyvoNarys - 1).getProduktai());

			}
		}
		
	}

	public void priskirkPasirinktoMasyvoProduktus(Map<Integer, Kava> aparatuMapas, int AparatuMapoNarys) {
		if(AparatuMapoNarys<0 || AparatuMapoNarys>aparatuMapas.size()) {
			System.out.println("Sis masyvas neturi tiek nariu, prasau ivesti skaiciu nuo  1 iki " + aparatuMapas.size());
		}else {
			for (int i : aparatuMapas.keySet()) {
				aparatuMapas.get(i).setProduktai(aparatuMapas.get(AparatuMapoNarys).getProduktai());
			}
		}
		
	}

	public void priskirkTuosPaciusProduktus(Kava kavosAparatas, Produktai produktuObj) {
		kavosAparatas.setProduktai(produktuObj);
	}

	public void priskirkSkirtingusProduktusMasyvui(Kava[] aparatuMasyvas, Produktai produktuObj) {
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].setProduktai(produktuObj.gaukKopija());
		}
	}

	public void priskirkSkirtingusProduktusMasyvui(List<Kava> aparatuListas, Produktai produktuObj) {
		for (int i = 0; i < aparatuListas.size(); i++) {
			aparatuListas.get(i).setProduktai(produktuObj.gaukKopija());
		}
	}

	public void priskirkSkirtingusProduktusMasyvui(Map<Integer, Kava> aparatuMapas, Produktai produktuObj) {
		for (int i : aparatuMapas.keySet()) {
			aparatuMapas.get(i).setProduktai(produktuObj.gaukKopija());
		}
	}
	
	

}

