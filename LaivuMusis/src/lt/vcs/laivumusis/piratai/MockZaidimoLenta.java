package lt.vcs.laivumusis.piratai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.common.ZaidimoLenta;

public class MockZaidimoLenta implements ZaidimoLenta{
	
	int ilgis;
	int plotis;
	private static final String abecele = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
		
	
	
	public MockZaidimoLenta(int ilgis, int plotis ) {
		String lentosPlotis;
		Map<String, List<Langelis>> zaidimoLenta = new HashMap<String, List<Langelis>>();
		
		for (int i =0; i<plotis;i++) {
			String stulpelis = "" + abecele.charAt(i);
			List<Langelis> listas = new ArrayList<Langelis>();
			for(int sk = 1; sk<=ilgis;sk++) {
				listas.add(new MockLangelis(stulpelis, sk));
				System.out.println(stulpelis + sk);
			}
			
		}
		
		
		
		
		/*List<MockLangelis> langeliuListas = new ArrayList<MockLangelis>{}
		for (int i = 0; i<ilgis*plotis)
			
			
			
		for (int i =0; i<plotis;i++) {
			for (int sk = 1; sk<=ilgis;sk++) {
				String a = "" + abecele.charAt(i);
				zaidimoLenta.put(a+(sk), new MockLangelis(a, sk));
			}
			
			
			lentosPlotis = lentosPlotis + abecele.charat
		}
		List 
		
		Map<String, List<Langelis>> zaidimoLenta = new HashMap<String, List<Langelis>*/
	}

	@Override
	public Map<String, List<Langelis>> getLangeliai() {
		System.out.println("Grazinu langelius");
		Map<String, List<Langelis>> langeliai = new HashMap<String, List<Langelis>>();
		return langeliai;
	}

	@Override
	public List<Laivas> getLaivai() {
		System.out.println("Grazinu laivus");
		List<Laivas> laivai = new ArrayList<Laivas>();
		return laivai;
	}

	@Override
	public void pridekLaiva(Laivas laivas) {
		System.out.println("Laivas pridetas: " + laivas);
		
	}

	@Override
	public boolean sauk(String x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

}
