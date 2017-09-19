package lt.vcs.kavosaparatas.lina.aparatai;

import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.lina.Kavos.JuodaKava;
import lt.vcs.kavosaparatas.lina.Kavos.KavaSuPienu;
import lt.vcs.kavosaparatas.lina.Kavos.Latte;
import lt.vcs.kavosaparatas.lina.produkcija.Produktai;
import lt.vcs.kavosaparatas.lina.puodelis.KavosPuodelis;

public class KavosAparatas implements CoffeeMashine{

	private Produktai produktai;
	private int panaudojimukiekis;
	private int riba = 2;
	public static final String LATTE = "latte";
	public static final String KAVASUPIENU = "kava su pienu";
	public static final String JUODAKAVA = "juoda kava";

	// Konstruktoriai
	public KavosAparatas() {
		produktai = new Produktai();
	}

	public KavosAparatas(int cukrausKiekis, int kavosPupeliuKiekis, int vandenskiekis) {
		produktai = new Produktai(cukrausKiekis, kavosPupeliuKiekis, vandenskiekis);
	}

	public KavosAparatas(int cukrauskiekis, int kavospupeliukiekis, int vandenskiekis, int riba) {
		this(cukrauskiekis, kavospupeliukiekis, vandenskiekis);
		this.riba = riba;
	}

	public KavosAparatas(Produktai produktai) {
		this.produktai = produktai;
	}

	// metodai

	public void papildykProduktus(int cukrauskiekis, int kavospupeliukiekis, int vandenskiekis) {
		produktai.setCukrausKiekis(cukrauskiekis + produktai.getCukrausKiekis());
		produktai.setVandensKiekis(vandenskiekis + produktai.getVandensKiekis());
		produktai.setKavosPupeliuKiekis(kavospupeliukiekis + produktai.getKavosPupeliuKiekis());
	}

	public void sakykProduktuBusena() {
		this.produktai.atspausdinkProduktus();
		// System.out.println("Cukraus kiekis: " + produktai.getCukrausKiekis());
		// System.out.println("Vandens kiekis: " + produktai.getVandensKiekis());
		// System.out.println("Pupeliu kiekis: " + produktai.getKavosPupeliuKiekis());
		// System.out.println("Pieno kiekis: " + produktai.getPienoKiekis());
	}

	public void sakykAparatoBusena() {
		sakykProduktuBusena();
		System.out.println("Liko panaudojimui kartu iki plovimo: " + (this.riba - this.panaudojimukiekis));
	}

	public KavosPuodelis gaminkKava(String kavosTipas) {
		KavosPuodelis puodelis = null;
		switch (kavosTipas) {
		case LATTE:
			puodelis = new Latte();
			break;

		case JUODAKAVA:
			puodelis = new JuodaKava();
			break;

		case KAVASUPIENU:
			puodelis = new KavaSuPienu();
			break;
		default:
			System.out.println("Pasirinkote neegzistuojanti kavos tipa!");
		}

		if (puodelis != null)
			gaminkKava(puodelis);

		return puodelis;
	}

	private void gaminkKava(KavosPuodelis puodelis) {
		Produktai produktai = puodelis.getProduktai();
		gaminkKava(produktai.getVandensKiekis(), produktai.getCukrausKiekis(), produktai.getKavosPupeliuKiekis());
	}

	private void gaminkKava(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) {
		if (arAparatasPasiruoses(vandensKiekis, cukrausKiekis, pupeliuKiekis)) {
			produktai.setCukrausKiekis(produktai.getCukrausKiekis() - cukrausKiekis);
			produktai.setKavosPupeliuKiekis(produktai.getKavosPupeliuKiekis() - pupeliuKiekis);
			produktai.setVandensKiekis(produktai.getVandensKiekis() - vandensKiekis);
			panaudojimukiekis++;
			System.out.println("skanios kavos");
		}
	}

	public boolean arAparatasPasiruoses(int cukrauskiekis, int kavospupeliukiekis, int vandenskiekis) {
		if (produktai.getCukrausKiekis() - cukrauskiekis > 0
				&& produktai.getKavosPupeliuKiekis() - kavospupeliukiekis > 0
				&& produktai.getVandensKiekis() - vandenskiekis > 0 && this.panaudojimukiekis < this.riba) {
			return true;
		}
		System.out.println("Produktu kiekis yra nepakankamas!");
		return false;
	}
	
	public boolean arAparatasPasiruoses() {
			if(arAparatasPasiruoses(produktai.getCukrausKiekis(), produktai.getKavosPupeliuKiekis(), produktai.getVandensKiekis())) {
				return true;
			}
			return false;
	}

	public void atlikPlovima() {
		this.panaudojimukiekis = 0;
		System.out.println("Kavos aparatas isplautas!");
	}

	public void isvalykProduktus() {
		setProduktai(0, 0, 0);
	}

	// getters and setters

	private void setProduktai(int cukrauskiekis, int kavospupeliukiekis, int vandenskiekis) {
		produktai.setCukrausKiekis(cukrauskiekis);
		produktai.setKavosPupeliuKiekis(kavospupeliukiekis);
		produktai.setVandensKiekis(vandenskiekis);
	}
	
	public void papildykVandens(int vandenskiekis) {
		produktai.setVandensKiekis(vandenskiekis);
	}
	
	public void papildykCukraus(int cukrauskiekis) {
		produktai.setCukrausKiekis(cukrauskiekis);
	}
	
	public void papildykPupeliu(int pupeliukiekis) {
		produktai.setKavosPupeliuKiekis(pupeliukiekis);
	}

	public Produktai getProduktaiKopija() {
		return produktai.gaukKopija();
	}

	public void ismurzinkAparata() {
		this.panaudojimukiekis = riba;
	}
}
