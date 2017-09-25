package lt.vcs.kavosaparatas.pijus.aparatai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import lt.vcs.kavosaparatas.pijus.produktai.Produktai;

public class KavosAparatai2 {
	static int KavosAparatuSkaicius = 0;

	public static void aparatuSkaicius() {
		System.out.println("sukurta: " + KavosAparatuSkaicius);
	}

	public KavosAparatas sukurkKavosAparata() {
		KavosAparatuSkaicius++;
		return new KavosAparatas(10, 10, 10); // jis kolkas neturi reiksmes nes mes rankiniu budu turim irasyti viska
	}

	public KavosAparatas vienasAparatas() {
		KavosAparatuSkaicius++;
		return new KavosAparatas();
	}

	public List<KavosAparatas> sukurkKavosAparatuSarasa(int g) {
		List<KavosAparatas> list = new ArrayList<KavosAparatas>();

		for (int i = 0; i < g; i++) {
			list.add(new KavosAparatas());
		}
		return list;
	}

	public Map<Integer, KavosAparatas> sukurkKavosAparatuMapa(int g) {
		Map<Integer, KavosAparatas> mapas = new HashMap<Integer, KavosAparatas>();
		for (int i = 0; i < g; i++) {
			mapas.put(i, new KavosAparatas());
		}
		return mapas;
	}

	public void isvalykAparata(KavosAparatas aparatas) {
		aparatas.isvalykAparata();
	}

	public void isvalykAparatuPanaudojimuMasyva(KavosAparatas[] aparatai) {
		for (int i = 0; i < aparatai.length; i++) {
			aparatai[i].isvalykAparata();
		}
	}

	public void isvalykAparatuProduktuMasyva(KavosAparatas[] aparatai) {
		for (int i = 0; i < aparatai.length; i++) {
			aparatai[i].sakykAparatoBusena();
			aparatai[i].isvalykProduktus();
		}
	}

	// public void priskirkTuosPaciusProduktus(KavosAparatas2[] aparatas, Produktai
	// produktai) {
	// for (int i = 0; i < aparatas.length; i++) {
	// aparatas[i].setProduktai(produktai);
	// }
	// }
	//
	// public void priskirkSkirtingusProduktus(KavosAparatas2[] aparatas) {
	// for (int i = 0; i < aparatas.length; i++) {
	// aparatas[i].keiskProduktus(new Produktai(90, 90, 90));
	// }

}
