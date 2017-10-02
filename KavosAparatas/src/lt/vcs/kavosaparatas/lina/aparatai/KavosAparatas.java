package lt.vcs.kavosaparatas.lina.aparatai;

import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.common.exceptions.NesvarusAparatas;
import lt.vcs.kavosaparatas.common.exceptions.TrukstaProduktu;
import lt.vcs.kavosaparatas.lina.enumai.KavosPuodeliai;
import lt.vcs.kavosaparatas.lina.klaidos.NeraTokioTipoKavos;
import lt.vcs.kavosaparatas.lina.produkcija.Produktai;
import lt.vcs.kavosaparatas.lina.puodelis.KavosPuodelis;

public class KavosAparatas implements CoffeeMashine {

	private Produktai produktai;
	private int panaudojimukiekis;
	private int riba = 2;

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
	}

	public void sakykAparatoBusena() {
		sakykProduktuBusena();
		System.out.println("Liko panaudojimui kartu iki plovimo: " + (this.riba - this.panaudojimukiekis));
	}

	public KavosPuodelis gaminkKava(String kavosTipas) throws NesvarusAparatas, TrukstaProduktu {

		KavosPuodeliai tipas = KavosPuodeliai.valueOf(kavosTipas);

		KavosPuodelis puodelis = (KavosPuodelis) tipas.getKavosPuodelis();
		gaminkKava(puodelis);
		return puodelis;
	}

	private void gaminkKava(KavosPuodelis puodelis) throws NesvarusAparatas, TrukstaProduktu {
		Produktai produktai = puodelis.getProduktai();
		gaminkKava(produktai.getVandensKiekis(), produktai.getCukrausKiekis(), produktai.getKavosPupeliuKiekis());
	}

	private void gaminkKava(int vandensKiekis, int cukrausKiekis, int pupeliuKiekis)
			throws NesvarusAparatas, TrukstaProduktu {
		if (arAparatasPasiruoses(vandensKiekis, cukrausKiekis, pupeliuKiekis)) {
			produktai.setCukrausKiekis(produktai.getCukrausKiekis() - cukrausKiekis);
			produktai.setKavosPupeliuKiekis(produktai.getKavosPupeliuKiekis() - pupeliuKiekis);
			produktai.setVandensKiekis(produktai.getVandensKiekis() - vandensKiekis);
			panaudojimukiekis++;
			System.out.println("skanios kavos");
		} else {
			throw new TrukstaProduktu("Truksta produktu!");
		}

	}

	public boolean arAparatasPasiruoses(int cukrauskiekis, int kavospupeliukiekis, int vandenskiekis) {
		if (this.panaudojimukiekis >= this.riba) {
			return false;
		}

		if (produktai.getCukrausKiekis() < cukrauskiekis || produktai.getKavosPupeliuKiekis() < kavospupeliukiekis
				|| produktai.getVandensKiekis() < vandenskiekis) {
			return false;
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
