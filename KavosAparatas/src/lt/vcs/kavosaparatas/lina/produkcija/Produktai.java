package lt.vcs.kavosaparatas.lina.produkcija;

public class Produktai {
	private int cukrausKiekis;
	private int kavosPupeliuKiekis;
	private int vandensKiekis;
	// private double pienoKiekis;

	public Produktai(int cukrauskiekis, int kavospupeliukiekis, int vandenskiekis) {
		this.cukrausKiekis = cukrauskiekis;
		this.kavosPupeliuKiekis = kavospupeliukiekis;
		this.vandensKiekis = vandenskiekis;

	}

	public Produktai() {
		this(50, 50, 50);
	}

	// Metodas grazina produktu kopija, t.y. kita kintamaji su perduto kintamojo
	// reiksmemis
	public Produktai grazinkKopija(Produktai produktai) {
		return new Produktai(produktai.cukrausKiekis, produktai.kavosPupeliuKiekis, produktai.vandensKiekis);
	}

	public void atspausdinkProduktus() {
		System.out.println("Cukraus kiekis: " + this.cukrausKiekis);
		System.out.println("Kavos pupeliø kiekis: " + this.kavosPupeliuKiekis);
		System.out.println("Vandens kiekis: " + this.vandensKiekis);
	}

	// setters and getters
	public int getCukrausKiekis() {
		return cukrausKiekis;
	}

	public void setCukrausKiekis(int cukrausKiekis) {
		this.cukrausKiekis = cukrausKiekis;
	}

	public int getKavosPupeliuKiekis() {
		return kavosPupeliuKiekis;
	}

	public void setKavosPupeliuKiekis(int kavosPupeliuKiekis) {
		this.kavosPupeliuKiekis = kavosPupeliuKiekis;
	}

	public int getVandensKiekis() {
		return vandensKiekis;
	}

	public void setVandensKiekis(int vandensKiekis) {
		this.vandensKiekis = vandensKiekis;
	}
}
