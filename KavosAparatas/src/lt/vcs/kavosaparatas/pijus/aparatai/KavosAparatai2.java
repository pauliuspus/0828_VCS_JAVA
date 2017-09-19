package lt.vcs.kavosaparatas.pijus.aparatai;

import lt.vcs.kavosaparatas.pijus.produktai.Produktai;

public class KavosAparatai2 {
	public KavosAparatas2 sukurkKavosAparata() {
		return new KavosAparatas2(10, 10, 10); // jis kolkas neturi reiksmes nes mes rankiniu budu turim irasyti viska
	}

	public KavosAparatas2 vienasAparatas() {
		return new KavosAparatas2();
	}

	public KavosAparatas2[] daugKavosAparatu(int g) {
		KavosAparatas2[] kavosAparatai = new KavosAparatas2[g];

		for (int i = 0; i < kavosAparatai.length; i++) {
			kavosAparatai[i] = new KavosAparatas2();
		}
		return kavosAparatai;
	}

	public void isvalykAparata(KavosAparatas2 aparatas) {
		aparatas.isvalykAparata();
	}

	public void isvalykAparatuPanaudojimuMasyva(KavosAparatas2[] aparatai) {
		for (int i = 0; i < aparatai.length; i++) {
			aparatai[i].isvalykAparata();
		}
	}

	public void isvalykAparatuProduktuMasyva(KavosAparatas2[] aparatai) {
		for (int i = 0; i < aparatai.length; i++) {
			aparatai[i].aparatoBusena();
			aparatai[i].isvalykProduktus();
		}
	}

	public void priskirkTuosPaciusProduktus(KavosAparatas2[] aparatas, Produktai produktai) {
		for (int i = 0; i < aparatas.length; i++) {
			aparatas[i].setProduktai(produktai);
		}
	}

	public void priskirkSkirtingusProduktus(KavosAparatas2[] aparatas) {
		for (int i = 0; i < aparatas.length; i++) {
			aparatas[i].setProduktai(new Produktai(90, 90, 90));
		}

	}
}

