package lt.vcs.kavosaparatas.pijus.puodeliai;

import lt.vcs.kavosaparatas.pijus.produktai.Produktai;

public class KavosPuodelis extends Puodelis {
	public Produktai produktai = new Produktai(10, 10, 10);
	public String kavosPavadinimas;
	public boolean arPagaminta;
	
	@Override
	public String toString() {
		return this.getClass().getName()+"/"+this.kavosPavadinimas+"/"+this.maxPuodelioTalpa;
		
	}
}
