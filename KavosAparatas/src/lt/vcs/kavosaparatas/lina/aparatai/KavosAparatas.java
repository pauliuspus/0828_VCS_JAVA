package lt.vcs.kavosaparatas.lina.aparatai;

import java.util.HashSet;
import java.util.Set;

import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.lina.Kavos.JuodaKava;
import lt.vcs.kavosaparatas.lina.Kavos.KavaSuPienu;
import lt.vcs.kavosaparatas.lina.Kavos.Latte;
import lt.vcs.kavosaparatas.lina.klaidos.NeraTokioTipoKavos;
import lt.vcs.kavosaparatas.lina.klaidos.ReikiaValytiAparata;
import lt.vcs.kavosaparatas.lina.klaidos.TrukstaProduktu;
//import lt.vcs.kavosaparatas.lina.klaidos.Klaida;
import lt.vcs.kavosaparatas.lina.produkcija.Produktai;
import lt.vcs.kavosaparatas.lina.puodelis.KavosPuodelis;


public class KavosAparatas implements CoffeeMashine {

	private Produktai produktai;
	private int panaudojimukiekis;
	private int riba = 2;
	public static final String LATTE = "latte";
	public static final String KAVASUPIENU = "kava su pienu";
	public static final String JUODAKAVA = "juoda kava";
	private Set<String> kavosRusys = new HashSet<String>();

	{
		kavosRusys.add(KAVASUPIENU);
		kavosRusys.add(LATTE);
		kavosRusys.add(JUODAKAVA);
	}

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

	public void pridekKavosRusi(String kavosRusis) {
		this.kavosRusys.add(kavosRusis);
	}

	public void papildykProduktus(int cukrauskiekis, int kavospupeliukiekis, int vandenskiekis) {
		produktai.setCukrausKiekis(cukrauskiekis + produktai.getCukrausKiekis());
		produktai.setVandensKiekis(vandenskiekis + produktai.getVandensKiekis());
		produktai.setKavosPupeliuKiekis(kavospupeliukiekis + produktai.getKavosPupeliuKiekis());
	}

	public void sakykProduktuBusena() {
		this.produktai.atspausdinkProduktus();
	}

	public void sakykAparatoBusena() {
		sakykProduktuBusena();
		System.out.println("Liko panaudojimui kartu iki plovimo: " + (this.riba - this.panaudojimukiekis));
	}

	public KavosPuodelis gaminkKava(String kavosTipas) throws NeraTokioTipoKavos, ReikiaValytiAparata, TrukstaProduktu {
		KavosPuodelis puodelis = null;

		if (kavosRusys.contains(kavosTipas)) {

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
			}
			gaminkKava(puodelis);
		} else {
			throw new NeraTokioTipoKavos();
		}
		return puodelis;
	}

	private void gaminkKava(KavosPuodelis puodelis) throws ReikiaValytiAparata, TrukstaProduktu {
		Produktai produktai = puodelis.getProduktai();
		gaminkKava(produktai.getVandensKiekis(), produktai.getCukrausKiekis(), produktai.getKavosPupeliuKiekis());
	}

	private void gaminkKava(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis) throws ReikiaValytiAparata, TrukstaProduktu {
		if (arAparatasPasiruoses(vandensKiekis, cukrausKiekis, pupeliuKiekis)) {
			produktai.setCukrausKiekis(produktai.getCukrausKiekis() - cukrausKiekis);
			produktai.setKavosPupeliuKiekis(produktai.getKavosPupeliuKiekis() - pupeliuKiekis);
			produktai.setVandensKiekis(produktai.getVandensKiekis() - vandensKiekis);
			panaudojimukiekis++;
			System.out.println("skanios kavos");
		}
	}

	public boolean arAparatasPasiruoses(int cukrauskiekis, int kavospupeliukiekis, int vandenskiekis) throws ReikiaValytiAparata, TrukstaProduktu {
		if (this.panaudojimukiekis>=this.riba) {
			throw new ReikiaValytiAparata();
		}
		
		if (produktai.getCukrausKiekis() < cukrauskiekis
				|| produktai.getKavosPupeliuKiekis() < kavospupeliukiekis
				|| produktai.getVandensKiekis() < vandenskiekis) {
			throw new TrukstaProduktu();
		}
		return true;
	}

	public boolean arAparatasPasiruoses() {
		if (this.panaudojimukiekis >= this.riba) {
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
