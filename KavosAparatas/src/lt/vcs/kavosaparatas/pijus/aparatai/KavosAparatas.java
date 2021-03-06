package lt.vcs.kavosaparatas.pijus.aparatai;

import java.util.HashMap;
import java.util.Map;

import org.omg.PortableServer.ThreadPolicyOperations;

import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.common.Products;
import lt.vcs.kavosaparatas.common.exceptions.NesvarusAparatas;
import lt.vcs.kavosaparatas.common.exceptions.TrukstaProduktu;
import lt.vcs.kavosaparatas.pijus.produktai.Produktai;
import lt.vcs.kavosaparatas.pijus.puodeliai.JuodaKavaPuodelis;
import lt.vcs.kavosaparatas.pijus.puodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.pijus.puodeliai.LattePuodelis;
import lt.vcs.kavosaparatas.pijus.puodeliai.MochaPuodelis;
import lt.vcs.kavosaparatas.pijus.puodeliai.Puodelis;

public class KavosAparatas implements CoffeeMashine {
	Produktai p;
	private int panaudojimuSkaicius;
	private static final int panaudotuSkaiciuRiba = 100;
	Map<String, KavosPuodelis> puodeliai = new HashMap<String, KavosPuodelis>();

	// Constructor

	public KavosAparatas(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		p = new Produktai(vandensKiekis, cukrausKiekis, pupeliuKiekis);
		puodeliai.put("Mocha", new MochaPuodelis());
		puodeliai.put("late", new LattePuodelis());
		puodeliai.put("juoda", new JuodaKavaPuodelis());
	}

	public KavosAparatas() {
		puodeliai.put("Mocha", new MochaPuodelis());
		puodeliai.put("late", new LattePuodelis());
		puodeliai.put("juoda", new JuodaKavaPuodelis());
	}

	// Kavos gaminimas ir kita

	public KavosPuodelis gaminkKava(String kavosTipas) throws NesvarusAparatas, TrukstaProduktu {
		KavosPuodelis puodelis = null;
		switch (kavosTipas) {
		case "Mocha":
			puodelis = new MochaPuodelis();
			break;
		case "late":
			puodelis = new LattePuodelis();
			break;
		case "juoda":
			puodelis = new JuodaKavaPuodelis();
			break;
		default:
			System.out.println("tokios kavos neturim");
			break;
		}

		if (puodelis != null) {
			if (arValyti() != false)
				throw new NesvarusAparatas("nesvarus");
			Produktai produktai = puodelis.getProduktai();
			if (arUzteks(produktai.getVandensKiekis(), produktai.getCukrausKiekis(),
					produktai.getPupeliuKiekis()) != true)
				throw new TrukstaProduktu("truksta produktu");

			gaminkKava(puodelis);
		}
		return puodelis;
	}

	// sitas metodas gamina pagal mapa
	public void gaminkKavaJeiYra(String kavosTipas) {
		kavosTipas = kavosTipas.toLowerCase();
		if (puodeliai.equals(kavosTipas)) {
			gaminkKava(puodeliai.get(kavosTipas));
		} else {
			System.out.println("nera tokios kavos");
		}
	}

	private void gaminkKava(KavosPuodelis puodelis) {
		Produktai produktai = puodelis.getProduktai();
		gaminkKava(produktai.getVandensKiekis(), produktai.getCukrausKiekis(), produktai.getPupeliuKiekis());
		puodelis.setKavaPagaminta(true);
	}

	private void gaminkKava(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		if (arUzteks(vandensKiekis, cukrausKiekis, pupeliuKiekis) && arValyti() != false) {
			p.setCukrausKiekis(p.getCukrausKiekis() - cukrausKiekis);
			p.setPupeliuKiekis(p.getPupeliuKiekis() - pupeliuKiekis);
			p.setVandensKiekis(p.getVandensKiekis() - vandensKiekis);
			panaudojimuSkaicius++;
			System.out.println("skanios kavos");
		} else {
			// sutvarkyti cia dar viska
		}
	}

	public void pridekPuodeli(String s, KavosPuodelis puodelis) {
		puodeliai.put(s, puodelis);
	}

	public void pasalinkkPuodeli(String s) {
		puodeliai.remove(s);
	}

	private boolean arUzteks(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		boolean random = true;
		if (vandensKiekis >= p.getVandensKiekis()) {
			System.out.println("truksta vandens");
			return false;
		}
		if (cukrausKiekis >= p.getCukrausKiekis()) {
			System.out.println("truksta cukraus");
			return false;
		}
		if (pupeliuKiekis >= p.getPupeliuKiekis()) {
			System.out.println("truksta pupeliu");
			return false;
		}
		return random;
	}

	private boolean arValyti() {
		if (panaudojimuSkaicius >= panaudotuSkaiciuRiba) {

		}
		return true;

	}

	public boolean arAparatasPasiruoses() {
		if (arNeTuscias() && panaudojimuSkaicius < panaudotuSkaiciuRiba) {
			System.out.println("pasiruoses");
			return true;
		}
		return false;
	}

	public boolean arNeTuscias() {
		arUzteks(1, 1, 1);
		return true;
	}

	public void atlikPlovima() {
		panaudojimuSkaicius = 0;
	}

	public void isvalykProduktus() {
		p.setCukrausKiekis(0);
		p.setPupeliuKiekis(0);
		p.setVandensKiekis(0);
	}

	public void sakykProduktuBusena() {
		System.out.println(p.getCukrausKiekis());
		System.out.println(p.getVandensKiekis());
		System.out.println(p.getPupeliuKiekis());
	}

	public void isvalykAparata() {
		panaudojimuSkaicius = 0;
	}

	public void ismurzinkAparata() {
		this.panaudojimuSkaicius = panaudotuSkaiciuRiba;
		System.out.println("maksimalus panaudojimu skaicus");
	}

	public void keiskProduktus(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		p.setCukrausKiekis(cukrausKiekis);
		p.setVandensKiekis(vandensKiekis);
		p.setPupeliuKiekis(pupeliuKiekis);
	}

	public void sakykAparatoBusena() {
		System.out.println("cukraus liko " + p.getCukrausKiekis());
		System.out.println("pupeliu liko " + p.getPupeliuKiekis());
		System.out.println("vandens liko " + p.getVandensKiekis());

		System.out.println("panaudijumu liko " + (panaudotuSkaiciuRiba - panaudojimuSkaicius));
	}
	// Set/get

	public void pridekPuodeliuSarasa(Map<String, KavosPuodelis> puodeliai) {
		this.puodeliai = puodeliai;
	}

	public void getProduktkaiKopija(Produktai produktai) {
		this.p = produktai;
	}

	public void papildykPupeliu(int pupeliuKiekis) {
		p.setPupeliuKiekis(p.getPupeliuKiekis() + pupeliuKiekis);
	}

	public void papildykCukraus(int cukrausKiekis) {
		p.setCukrausKiekis(p.getCukrausKiekis() + cukrausKiekis);
	}

	public void papildykVandens(int vandensKiekis) {
		p.setVandensKiekis(p.getVandensKiekis() + vandensKiekis);
	}

	@Override
	public Products getProduktaiKopija() { // neturi reiksmes

		return null;
	}

}
