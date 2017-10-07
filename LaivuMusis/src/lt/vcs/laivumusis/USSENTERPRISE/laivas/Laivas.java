package lt.vcs.laivumusis.USSENTERPRISE.laivas;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.laivumusis.common.Langelis;

public class Laivas implements lt.vcs.laivumusis.common.Laivas {
	private String[] masyvasX;
	private int[] masyvasY;
	private int laivoIlgis;
	private int laivogyvybes;

	List<Langelis> laivoLangeliaiKordinates = new ArrayList<Langelis>(); // kiekviena karatia kai saunu i laiva as jam nuimu gyvybes ir taip paziuriu kada jis us nusautas.

	public Laivas(int laivoIlgis) {
		this.laivogyvybes = laivoIlgis;
		this.laivoIlgis = laivoIlgis;
		this.masyvasX = new String[laivoIlgis];
		this.masyvasY = new int[laivoIlgis];

	}

	@Override
	public void setKordinates(List<Langelis> langeliai) {
		laivoLangeliaiKordinates = langeliai;
	}

	@Override
	public int getLaivoIlgis() {
		return laivoIlgis;
	}

	@Override
	public boolean arNusautas() {

		return false;
	}

	@Override
	public List<Langelis> getLaivoKoordinates() {
		return laivoLangeliaiKordinates;
	}

}
