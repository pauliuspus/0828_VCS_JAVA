package lt.vcs.kavosaparatas.pijus.visosklases;

public class KavosAparatas2 {
	Produktai p;

	private int panaudojimuSkaicius;
	// Konstanta
	private static final int panaudotuSkaiciuRiba = 100;

	// Constructor

	public KavosAparatas2(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		p = new Produktai(vandensKiekis, cukrausKiekis, pupeliuKiekis);
	}

	public KavosAparatas2() {

	}

	// Kavos gaminimas ir kita
	public void gaminkKava(String tipas) {
		switch (tipas) {
		case "Mocha":
			MochaPuodelis kpm = new MochaPuodelis();
			// kavosGaminimas(5, 5, 5);
			kavosGaminimas(kpm);
			break;
		case "late":
			LattePuodelis kpl = new LattePuodelis();
			// kavosGaminimas(4, 4, 3);
			kavosGaminimas(kpl);
			break;
		case "juoda":
			JuodaKavaPuodelis kpj = new JuodaKavaPuodelis();
			// kavosGaminimas(5, 3, 7);
			kavosGaminimas(kpj);
			break;
		default:
			System.out.println("tokios kavos neturim");
			break;
		}
	}

	/*
	 * private void kavosGaminimas(int vandensKiekis, int cukrausKiekis, int
	 * pupeliuKiekis) { if (arUzteks(vandensKiekis, cukrausKiekis, pupeliuKiekis) &&
	 * !arValyti()) { p.setCukrausKiekis(p.getCukrausKiekis() - cukrausKiekis);
	 * p.setPupeliuKiekis(p.getPupeliuKiekis() - pupeliuKiekis);
	 * p.setVandensKiekis(p.getVandensKiekis() - vandensKiekis);
	 * panaudojimuSkaicius++; System.out.println("skanios kavos"); } }
	 */

	private KavosPuodelis kavosGaminimas(KavosPuodelis kp) {
		
		if (kp instanceof LattePuodelis) {
			LattePuodelis latte = (LattePuodelis) kp;

			if (arUzteks(p.getVandensKiekis(), p.getCukrausKiekis(),
					p.getPupeliuKiekis()) && !arValyti()) {
				p.setPupeliuKiekis(p.getPupeliuKiekis() - latte.produktai.getPupeliuKiekis());
				p.setCukrausKiekis(p.getCukrausKiekis() - latte.produktai.getCukrausKiekis());
				p.setVandensKiekis(p.getVandensKiekis() - latte.produktai.getVandensKiekis());
				latte.arPagaminta = true ;
				panaudojimuSkaicius++;
				System.out.println("skanios kavos");
				return latte;
			}
		}
		
		if (kp instanceof JuodaKavaPuodelis) {
			JuodaKavaPuodelis juoda = (JuodaKavaPuodelis) kp;

			if (arUzteks(p.getVandensKiekis(), p.getCukrausKiekis(),
					p.getPupeliuKiekis()) && !arValyti()) {
				p.setPupeliuKiekis(p.getPupeliuKiekis() - juoda.produktai.getPupeliuKiekis());
				p.setCukrausKiekis(p.getCukrausKiekis() - juoda.produktai.getCukrausKiekis());
				p.setVandensKiekis(p.getVandensKiekis() - juoda.produktai.getVandensKiekis());
				juoda.arPagaminta = true ;
				panaudojimuSkaicius++;
				System.out.println("skanios kavos");
				return juoda;
			}
		}

		if (kp instanceof MochaPuodelis) {
			MochaPuodelis mocha = (MochaPuodelis) kp;

			if (arUzteks(p.getVandensKiekis(), p.getCukrausKiekis(),
					p.getPupeliuKiekis()) && !arValyti()) {
				p.setPupeliuKiekis(p.getPupeliuKiekis() - mocha.produktai.getPupeliuKiekis());
				p.setCukrausKiekis(p.getCukrausKiekis() - mocha.produktai.getCukrausKiekis());
				p.setVandensKiekis(p.getVandensKiekis() - mocha.produktai.getVandensKiekis());
				mocha.arPagaminta = true ;
				panaudojimuSkaicius++;
				System.out.println("skanios kavos");
				return mocha;
			}
		}
		return kp;
	}

	private boolean arUzteks(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		boolean random = true;
		if (vandensKiekis < 0) {
			System.out.println("truksta vandens");
			return false;
		}
		if (cukrausKiekis < 0) {
			System.out.println("truksta cukraus");
			return false;
		}
		if (pupeliuKiekis < 0) {
			System.out.println("truksta pupeliu");
			return false;
		}
		return random;
	}

	private boolean arValyti() {
		if (panaudojimuSkaicius >= panaudotuSkaiciuRiba)
			return true;
		return false;
	}

	public void arPasiruoses() {
		if (arNeTuscias() && panaudojimuSkaicius < panaudotuSkaiciuRiba)
			System.out.println("pasiruoses");
	}

	public boolean arNeTuscias() {
		arUzteks(1, 1, 1);
		return true;
	}

	public void isvalykAparata() {
		panaudojimuSkaicius = 0;
	}

	public void isvalykProduktus() {
		p.setCukrausKiekis(0);
		p.setPupeliuKiekis(0);
		p.setVandensKiekis(0);
	}

	public void keiskProduktus(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		p.setCukrausKiekis(cukrausKiekis);
		p.setVandensKiekis(vandensKiekis);
		p.setPupeliuKiekis(pupeliuKiekis);
	}

	public void aparatoBusena() {
		System.out.println("cukraus liko " + p.getCukrausKiekis());
		System.out.println("pupeliu liko " + p.getPupeliuKiekis());
		System.out.println("vandens liko " + p.getVandensKiekis());

		System.out.println("panaudijumu liko " + (panaudotuSkaiciuRiba - panaudojimuSkaicius));
	}

	public void setProduktai(Produktai produktai) {
		this.p = produktai;
	}

}
