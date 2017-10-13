package lt.vcs.laivumusis.USSENTERPRISE.laivas;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.laivumusis.USSENTERPRISE.zaidimas.Zaidimas;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import lt.vcs.laivumusis.common.Langelis;

public class Laivas implements lt.vcs.laivumusis.common.Laivas {
	private int laivoIlgis;
	private int laivogyvybes;
	private String laivoPavadinimas;

	public List<Langelis> laivoLangeliaiKordinates = new ArrayList<Langelis>(); // kiekviena karatia kai saunu i laiva
																				// as jam
	// nuimu gyvybes ir taip paziuriu kada jis
	// us nusautas.

	public Laivas(int laivoIlgis, String laivoPavadinimas ) {
		this.laivogyvybes = laivoIlgis;
		this.laivoIlgis = laivoIlgis;
		this.laivoPavadinimas = laivoPavadinimas;
	}

	public Laivas() {
		
	}


	@Override
	public void setKordinates(List<Langelis> langeliai) { // zaidime turesime sukurdi metoda kuris padarys lista
		if (langeliai.size() > laivoIlgis)
			System.out.println("Perilgas Laivas");			
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
