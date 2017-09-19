package lt.vcs.kavosaparatas.manvydas.kavospuodeliai;

import lt.vcs.kavosaparatas.manvydas.resursai.Produktai;

public class KavosPuodelis extends Puodelis {

	protected Produktai produktai;
	protected String kavosVardas;
	protected boolean arKavaPagaminta;

	public KavosPuodelis(String pavadinimas, int cukrus, int kava, int pienas) {
		this.kavosVardas = pavadinimas;
		this.produktai = new Produktai(cukrus, kava, pienas);
	}

	public String toString() {
		if (arKavaPagaminta) {
			return (kavosVardas + " pagaminta. Skanaus!");
		}
		return "kava nepagaminta";

	}

	public Produktai getProduktai() {
		return produktai;
	}

	public void setProduktai(Produktai produktai) {
		this.produktai = produktai;
	}

	public String getKavosVardas() {
		return kavosVardas;
	}

	public void setKavosVardas(String kavosVardas) {
		this.kavosVardas = kavosVardas;
	}

	public boolean isArKavaPagaminta() {
		return arKavaPagaminta;
	}

	public void setArKavaPagaminta(boolean arKavaPagaminta) {
		this.arKavaPagaminta = arKavaPagaminta;
	}

}
