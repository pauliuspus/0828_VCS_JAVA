package lt.vcs.kavosaparatas.manvydas.resursai;

import lt.vcs.kavosaparatas.common.Products;

public class Produktai implements Products{

	private int cukrusAparateGramais;
	private int kavaAparateGramais;
	private int pienasAparateMililitrais;
	
	// konstruktorius
	public Produktai (int cukrusAparateGramais, int kavaAparateGramais, int pienasAparateMililitrais){
		this.cukrusAparateGramais = cukrusAparateGramais;
		this.kavaAparateGramais = kavaAparateGramais;
		this.pienasAparateMililitrais = pienasAparateMililitrais;
	}
	
	// Grazina produktu kopija su tokiomis paciomis reiksmemis
	public Produktai () {
		Produktai produktuKopija = new Produktai(0, 0, 0);
		produktuKopija.cukrusAparateGramais = this.cukrusAparateGramais;
		produktuKopija.kavaAparateGramais = this.kavaAparateGramais;
		produktuKopija.pienasAparateMililitrais = this.pienasAparateMililitrais;
	}
	
	// Setters and getters
	public int getCukrusAparateGramais() {
		return cukrusAparateGramais;
	}

	public void setCukrusAparateGramais(int cukrusAparateGramais) {
		this.cukrusAparateGramais = cukrusAparateGramais;
	}

	public int getKavaAparateGramais() {
		return kavaAparateGramais;
	}

	public void setKavaAparateGramais(int kavaAparateGramais) {
		this.kavaAparateGramais = kavaAparateGramais;
	}

	public int getPienasAparateMililitrais() {
		return pienasAparateMililitrais;
	}

	public void setPienasAparateMililitrais(int pienasAparateMililitrais) {
		this.pienasAparateMililitrais = pienasAparateMililitrais;
	}

	@Override
	public Products gaukKopija() {
		// TODO Auto-generated method stub
		return null;
	}

}
