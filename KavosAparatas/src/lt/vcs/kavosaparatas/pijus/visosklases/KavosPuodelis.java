package lt.vcs.kavosaparatas.pijus.visosklases;

public class KavosPuodelis extends Puodelis {
	protected Produktai produktai = new Produktai(10, 10, 10);
	protected String kavosPavadinimas;
	protected boolean arPagaminta;
	
	@Override
	public String toString() {
		return this.getClass().getName()+"/"+this.kavosPavadinimas+"/"+this.maxPuodelioTalpa;
		
	}
}
