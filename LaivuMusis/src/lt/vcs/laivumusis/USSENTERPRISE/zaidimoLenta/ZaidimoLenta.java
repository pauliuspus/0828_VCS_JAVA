package lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
<<<<<<< Updated upstream
import lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis;
import lt.vcs.laivumusis.common.*;

public class ZaidimoLenta implements lt.vcs.laivumusis.common.ZaidimoLenta {

	// reikia pagalvot ar mums to reikia , gal mum static mapa reikia susikurti
=======
import java.util.Set;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;

public class ZaidimoLenta implements lt.vcs.laivumusis.common.ZaidimoLenta {
	
	Map<String, List<Integer>> lenta = new HashMap<String, List<Integer>>();
	List<Integer> listas = new ArrayList<Integer>();
	
	public ZaidimoLenta() {
		
		
		for (int rows = 1; rows <= 10; rows++)
			listas.add(rows);
		
		
			
	    for ( char column = 'A'; column <= 'J'; column++) 
	    		lenta.put(String.valueOf(column), listas);
				
		
	    
	    for(String set : lenta.keySet()) {
	    		System.out.print(set+ " ");
	    		System.out.println();
	    		for(Integer i : lenta.get(set)) {
	    			System.out.println(i);
	    		}
	    		
		}
	
	    
	    
	}
>>>>>>> Stashed changes

	public Map<String, List<Langelis>> zaidimoLentele = new HashMap<String, List<Langelis>>();
	public List<Langelis> langas = new ArrayList<Langelis>();

	private void lentosKurimas() {
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			langas.add(new Langelis(kordinateY));
		}
		for (char kordinateY = 'A'; kordinateY <= 'J'; kordinateY++) {
			zaidimoLentele.put(String.valueOf(kordinateY), langas);
		}
	}

	@Override
	public List<Laivas> getLaivai() {
		return null;
	}

	@Override
	public void pridekLaiva(Laivas laivas) {
	}

	@Override
	public boolean sauk(String x, int y) {
		return false;
	}

	@Override
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> getLangeliai() {
		// TODO Auto-generated method stub
		return null;
	}

}
