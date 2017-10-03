package lt.vcs.laivumusis.common;

import java.util.List;

public interface Laivas {
	
	public void setKordinates(List<Langelis> langeliai);

    public int getLaivoIlgis();

    public boolean arNusautas();

    public List<Langelis> getLaivoKoordinates();

}
