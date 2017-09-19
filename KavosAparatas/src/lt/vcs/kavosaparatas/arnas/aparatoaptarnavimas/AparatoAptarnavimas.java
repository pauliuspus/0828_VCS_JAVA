package lt.vcs.kavosaparatas.arnas.aparatoaptarnavimas;

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

	public Kava[] sukurkNAparatu(int kiekAparatuSukurt) {
		Kava[] aparatuMasyvas = new Kava[kiekAparatuSukurt];
		for (int i = 0; i < kiekAparatuSukurt; i++) {
			aparatuMasyvas[i] = sukurkAparata(100, 400, 800);
		}
		return aparatuMasyvas;
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

	// priskiria pasirinkto masyvo nario produktus visam masyvui
	public void priskirkPasirinktoMasyvoProduktus(Kava[] aparatuMasyvas, int kurisMasyvoNarys) {

		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].setProduktai(aparatuMasyvas[kurisMasyvoNarys - 1].getProduktai());

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
	
	
	
}
