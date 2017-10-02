package lt.vcs.laivumusis.common;

import java.util.List;

public interface Zaidejas extends Runnable {
	
	public Zaidimas getZaidimas();
	
	public boolean sauk(String x, int y);
	
	public List<Laivas> gaukLaivus();
	
	public void dekLaiva(Laivas laivas);
	
	public ZaidimoLenta gaukLenta();
	
	public void pasiduok();
	
	public void dziaukis();
	
	public void erzink();
	
	
	

}
