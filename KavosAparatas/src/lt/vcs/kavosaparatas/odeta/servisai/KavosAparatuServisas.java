package lt.vcs.kavosaparatas.odeta.servisai;

import lt.vcs.kavosaparatas.odeta.aparatai.KavosAparatasDu;
import lt.vcs.kavosaparatas.odeta.produktai.Produktai;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KavosAparatuServisas {
	
	static int skaiciusKiekSukurtaKavosAparatu = 0;

	public KavosAparatasDu sukurVienaKavosAparata() {
		skaiciusKiekSukurtaKavosAparatu++;
		KavosAparatasDu kavosAparatasDu = new KavosAparatasDu();
		return kavosAparatasDu;
	}

	public KavosAparatasDu[] sukurkKavosAparatus(int skaicius) {
		KavosAparatasDu[] kavosAparatai = new KavosAparatasDu[skaicius];
		for (int i = 0; i < kavosAparatai.length; i++) {
			
			// kavosAparatai[i] = new KavosAparatasDu(); - kitas variantas

			kavosAparatai[i] = sukurVienaKavosAparata();
		}

		return kavosAparatai;

	}
	
	public List<KavosAparatasDu> sukurkKavosAparatuLista(int skaiciusKiekSukurtiListe){
		List<KavosAparatasDu>sukurtuKavosAparatuListas = new ArrayList<KavosAparatasDu>(skaiciusKiekSukurtiListe);
		for (int i = 0; i < sukurtuKavosAparatuListas.size(); i++) {
			sukurtuKavosAparatuListas.add(i, new KavosAparatasDu());
	
		}
		return sukurtuKavosAparatuListas;

	}
	
	public Map<Integer, KavosAparatasDu> sukurkKavosAparatuMapa(int skaiciusKiekSukurtiMape){
		Map<Integer, KavosAparatasDu>sukurtuKavosAparatuMapas = new HashMap<Integer, KavosAparatasDu>(skaiciusKiekSukurtiMape);
		for (int i = 0; i < sukurtuKavosAparatuMapas.size(); i++) {
			sukurtuKavosAparatuMapas.put(i, new KavosAparatasDu());
	
		}
		return sukurtuKavosAparatuMapas;

	}


	
	public static int sakykKiekBuvoSukurtaAparatu() {
		System.out.println("Buvo sukurta tiek aparatu: " + skaiciusKiekSukurtaKavosAparatu);
		return skaiciusKiekSukurtaKavosAparatu;
	}
	
	public void isplaukAparatus(KavosAparatasDu[] kavosAparatai) {
		for (int i = 0; i < kavosAparatai.length; i++) {
			kavosAparatai[i].atlikPlovima();
		}
	}

	
	public void isvalykVisuPaduotuAparatuProduktus(KavosAparatasDu[] kavosAparatai) {
		for (int i = 0; i < kavosAparatai.length; i++) {
			// Produktai isvalytiProduktai = new Produktai();
			System.out.println(i + " aparato isvalyta cukraus: " + kavosAparatai[i].getProduktai().getCukrausKiekis());
			System.out.println(
					i + " aparato isvalyta vandens: " + kavosAparatai[i].getProduktai().getKavosPupeliuKiekis());
			System.out.println(i + " aparato isvalyta cukraus: " + kavosAparatai[i].getProduktai().getVandensKiekis());
			kavosAparatai[i].isvalykProduktus();
		}
	}

	// Produktai isvalytuProduktuSuma = new Produktai(0,0,0);

	// cia reikia nuorodos:
	// kai vienas aparatas sunaudos produktus, tai susinaudos is bendro kiekio - ir
	// kitiems sumazes
	public void visiemsAparatamsPriskirTaPatiProduktuObjekta(KavosAparatasDu[] kavosAparatai, Produktai produktai) {
		for (int i = 0; i < kavosAparatai.length; i++) {
			kavosAparatai[i].setProduktai(produktai);
		}
	}

	public void visiemsAparatamsPriskirAtskiraProduktuObejkta(KavosAparatasDu[] kavosAparatai) {
		for (int i = 0; i < kavosAparatai.length; i++) {
			kavosAparatai[i].setProduktai(new Produktai(0, 0, 0));
		}
	}

	// public void isvalykVisusProduktus() {
	// produktai.setCukrausKiekis(0);
	// produktai.setKavosPupeliuKiekis(0);
	// produktai.setVandensKiekis(0);
	// }

}
