package lt.vcs.laivumusis.USSENTERPRISE.laivas;

import java.util.List;

import lt.vcs.laivumusis.common.Langelis;

public class Laivas implements lt.vcs.laivumusis.common.Laivas {

	@Override
	public void setKordinates(List<Langelis> langeliai) {// reikia i lista ideti laivu kordinates
		
	}

	@Override
	public int getLaivoIlgis() {
		
		return 0;
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
