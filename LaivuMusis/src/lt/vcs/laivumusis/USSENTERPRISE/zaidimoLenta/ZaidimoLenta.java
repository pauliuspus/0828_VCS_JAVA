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
	List<lt.vcs.laivumusis.common.Laivas> laivuListas = new ArrayList<lt.vcs.laivumusis.common.Laivas>();

	Laivas lektuvnesis = new Laivas(5, "lektuvnesis");
	Laivas kovinisLaivas = new Laivas(4, "krovininis");
	Laivas kruizeris = new Laivas(3, "kruizeris");
	Laivas povandeninis = new Laivas(3, "povandeninis");
	Laivas naikintojas = new Laivas(2, "naikintojas");

	// mapas
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> zaidimoLentele = new HashMap<String, List<lt.vcs.laivumusis.common.Langelis>>();
	public List<lt.vcs.laivumusis.common.Langelis> langas = new ArrayList<lt.vcs.laivumusis.common.Langelis>();

	// konstruktorius
	public ZaidimoLenta() {
		laivuListoKurimas();
		lentosKurimas();

	}

	public void laivuListoKurimas() {// cia turetu sitas buti zaidimo klaseje oooo sitoje kalseje turi buti laivai
										// kruie yra jau padeti langeliuose
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
		for (char kordinateX = 'A'; kordinateX <= 'J'; kordinateX++) {
			zaidimoLentele.put(String.valueOf(kordinateX), langas);
		}
	}

	@Override
	public List<lt.vcs.laivumusis.common.Laivas> getLaivai() {
		return laivuListas;
	}

	@Override
	public boolean sauk(String x, int y) { // pasako ar pataike i laiva ir patikrina dar ar langelis turi savyje laiva
											// jei taip jis eina i ta laiva ir is jo jau sauna i savo langeli
		zaidimoLentele.get(x).get(y).sauk();

		return false;
	}

	@Override
	public Map<String, List<lt.vcs.laivumusis.common.Langelis>> getLangeliai() {
		return this.zaidimoLentele;
	}

	
	// bandom atkurti zemelapi
	public static void main(String[] args) {
		ZaidimoLenta lenta = new ZaidimoLenta();
		for (char kordinateX = 'A'; kordinateX <= 'J'; kordinateX++) {
			System.out.print(" "+kordinateX);
			
		}
		System.out.println("");
		for (int kordinateY = 1; kordinateY <= 10; kordinateY++) {
			System.out.println(kordinateY);
			for(int a= 1; a<= 10; a++)
				System.out.print(" #");
		}
	}
}
