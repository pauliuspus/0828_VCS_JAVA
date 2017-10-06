package lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis;
import lt.vcs.laivumusis.common.*;
import lt.vcs.laivumusis.USSENTERPRISE.Konstantos.Konstantos;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas;

import java.util.Set;

public class ZaidimoLenta implements lt.vcs.laivumusis.common.ZaidimoLenta {

	Map<String, List<Integer>> lenta = new HashMap<String, List<Integer>>();
	List<Integer> listas = new ArrayList<Integer>();

	public ZaidimoLenta() {

		for (int rows = 1; rows <= 10; rows++)
			listas.add(rows);

		for (char column = 'A'; column <= 'J'; column++)
			lenta.put(String.valueOf(column), listas);

		for (String set : lenta.keySet()) {
			System.out.print(set + " ");
			System.out.println();
			for (Integer i : lenta.get(set)) {
				System.out.println(i);
			}

		}

	}

	public List<Laivas> laivuListas = new ArrayList<Laivas>();
	Laivas lektuvnesis = new Laivas(5);
	Laivas kovinisLaivas = new Laivas(4);
	Laivas kruizeris = new Laivas(3);
	Laivas povandeninis = new Laivas(3);
	Laivas naikintojas = new Laivas(2);

	private void laivuSudejimasILista() {
		pridekLaiva(lektuvnesis);

	}

	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> zaidimoLentele = new HashMap<String, List<lt.vcs.laivumusis.common.Langelis>>();
	public List<lt.vcs.laivumusis.common.Langelis> langas = new ArrayList<lt.vcs.laivumusis.common.Langelis>();

	public void lentosKurimas() {
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			langas.add(new Langelis(kordinateY));
		}
		for (char kordinateY = 'A'; kordinateY <= 'J'; kordinateY++) {
			zaidimoLentele.put(String.valueOf(kordinateY), langas);
		}
	}

	@Override
	public List<lt.vcs.laivumusis.common.Laivas> getLaivai() {
		return null;
	}

	@Override
	public boolean sauk(String x, int y) {
		return false;
	}

	@Override
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> getLangeliai() {
		return this.zaidimoLentele;
	}

	@Override
	public void pridekLaiva(lt.vcs.laivumusis.common.Laivas laivas) {
		// TODO Auto-generated method stub

	}

}
