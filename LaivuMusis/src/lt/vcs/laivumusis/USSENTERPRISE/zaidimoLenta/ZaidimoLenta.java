package lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis;
import lt.vcs.laivumusis.common.*;
import sun.security.krb5.internal.util.KrbDataOutputStream;
import lt.vcs.laivumusis.USSENTERPRISE.Konstantos.Konstantos;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas;

import java.util.Set;

public class ZaidimoLenta implements lt.vcs.laivumusis.common.ZaidimoLenta {
	// laivu listas
	public List<lt.vcs.laivumusis.common.Laivas> laivuListas = new ArrayList<lt.vcs.laivumusis.common.Laivas>();
	Laivas lektuvnesis = new Laivas(5);
	Laivas kovinisLaivas = new Laivas(4);
	Laivas kruizeris = new Laivas(3);
	Laivas povandeninis = new Laivas(3);
	Laivas naikintojas = new Laivas(2);
	// mapas
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> zaidimoLentele = new HashMap<String, List<lt.vcs.laivumusis.common.Langelis>>();
	public List<lt.vcs.laivumusis.common.Langelis> langas = new ArrayList<lt.vcs.laivumusis.common.Langelis>();

	// konstruktorius
	public ZaidimoLenta() {
		laivuListoKurimas();
		lentosKurimas();
	}

	public void laivuListoKurimas() {
		laivuListas.add(lektuvnesis);
		laivuListas.add(kovinisLaivas);
		laivuListas.add(kruizeris);
		laivuListas.add(povandeninis);
		laivuListas.add(naikintojas);
	}

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
		return laivuListas;
	}

	@Override
	public boolean sauk(String x, int y) { // pasako ar pataike i laiva
		zaidimoLentele.get(x).get(y).sauk();

		return false;
	}

	@Override
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> getLangeliai() {
		return this.zaidimoLentele;
	}

}
