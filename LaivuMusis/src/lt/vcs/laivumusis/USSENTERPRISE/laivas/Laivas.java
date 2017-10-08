package lt.vcs.laivumusis.USSENTERPRISE.laivas;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.laivumusis.common.Langelis;

public class Laivas implements lt.vcs.laivumusis.common.Laivas {
	private int laivoIlgis;
	private int laivogyvybes;

	public List<Langelis> laivoLangeliaiKordinates = new ArrayList<Langelis>(); // kiekviena karatia kai saunu i laiva
																				// as jam
	// nuimu gyvybes ir taip paziuriu kada jis
	// us nusautas.

	public Laivas(int laivoIlgis) {
		this.laivogyvybes = laivoIlgis;
		this.laivoIlgis = laivoIlgis;

	}

	public List<Langelis> duodaLaivoLangeliuKordinates() {
		return laivoLangeliaiKordinates;
	}

	public void saunamILaivoLangeli() { // mes saunam i langeli is sito metodo taip paziuredami ar laivas turi
										// langeli reikia su ifu priestai patikrint ar langelis turi savyje
										// laiva dar

	}

	@Override
	public void setKordinates(List<Langelis> langeliai) { // zaidime turesime sukurdi metoda kuris padarys lista
															// langeliu o cia jis juos sujungs
		laivoLangeliaiKordinates = langeliai;
	}

	@Override
	public int getLaivoIlgis() {
		return laivoIlgis;
	}

	@Override
	public boolean arNusautas() {
		if (laivogyvybes == 0)
			return true;
		return false;
	}

	@Override
	public List<Langelis> getLaivoKoordinates() {
		return laivoLangeliaiKordinates;
	}

}
