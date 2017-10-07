package lt.vcs.laivumusis.USSENTERPRISE.laivas;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.laivumusis.common.Langelis;

public class Laivas implements lt.vcs.laivumusis.common.Laivas {
	private String[] masyvasX;
	private int[] masyvasY;
	private int laivoIlgis;
	List<Laivas> laivuListas = new ArrayList<Laivas>();

	public Laivas(int laivoIlgis) {
		this.laivoIlgis = laivoIlgis;
		this.masyvasX = new String[laivoIlgis];
		this.masyvasY = new int[laivoIlgis];

	}

	@Override
	public void setKordinates(List<Langelis> langeliai) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLaivoIlgis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean arNusautas() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Langelis> getLaivoKoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
