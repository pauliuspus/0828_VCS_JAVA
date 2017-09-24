package lt.vcs.kavosaparatas.odeta.produktai;

import lt.vcs.kavosaparatas.common.Products;

public class Produktai implements Products {

	private int cukrausKiekis = 0;
	private int kavosPupeliuKiekis = 0;
	private int vandensKiekis = 0;
	
	//Produktu konstruktorius:
	
	public Produktai(int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
		this.cukrausKiekis = cukrausKiekis;
		this.kavosPupeliuKiekis = kavosPupeliuKiekis;
		this.vandensKiekis = vandensKiekis;
	}
	
	public Produktai() {
	}
	
	

	//Produktai produktai = new Produktai(0,0,0);
	

	//Metodas, kuris sukuria kita Porduktu objekta ir perduoda tas pacias Produktu reiksmes
	
	public Produktai gaukKopija() {
		return new Produktai(cukrausKiekis, kavosPupeliuKiekis, vandensKiekis);
	}
	
	
	
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
