package lt.vcs.laivumusis.USSENTERPRISE.laivas;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.laivumusis.common.Langelis;

public class Laivas implements lt.vcs.laivumusis.common.Laivas {
	private String[] masyvasX;
	private int[] masyvasY;
	private int laivoIlgis;
	List<Laivas> laivuListas = new ArrayList<Laivas>();

	public Laivas(int laivoIlgis) { // konstruktorius kad nustatyti laivo dydi ir mes ji naudosime
									// switch metode kuris pasakys laivo varda ir sukurs to dydzio
		this.laivoIlgis = laivoIlgis; // laiva
		this.masyvasX = new String[laivoIlgis];
		this.masyvasY = new int[laivoIlgis];
	}

	@Override
	public void setKordinates(List<Langelis> langeliai) {// reikia i laivu obijekta priskyrti kordinates

	}

	@Override
	public int getLaivoIlgis() {
		return laivoIlgis;
	}

	@Override
	public boolean arNusautas() {// turi grazinti laivo busena liste ar jo visos kordinates true

		return false;
	}

	@Override
	public List<Langelis> getLaivoKoordinates() {

		return null;
	}

}
