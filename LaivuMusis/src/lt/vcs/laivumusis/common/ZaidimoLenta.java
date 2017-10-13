package lt.vcs.laivumusis.common;

import java.util.List;
import java.util.Map;

public interface ZaidimoLenta {
	
	public Map<String, List<Langelis>> getLangeliai();

	public List<Laivas> getLaivai();
	
	public boolean sauk(String x, int y);

}
