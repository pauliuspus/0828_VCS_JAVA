package lt.vcs.laivumusis.USSENTERPRISE.langelis;

import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import lt.vcs.laivumusis.common.Laivas;

public class Langelis implements lt.vcs.laivumusis.common.Langelis {
	private int suviuSkaicius; // naudojam nustatyti kiek kartu sauta i viena langeli
	private boolean langelioBusena;
	private String x;
	private int y;
	public Langelis(Integer y) {
		this.y = y;
	}
	public Langelis(String x) {
		this.x = x;
	}
	
	
	
	public Langelis(String x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	// kiekvienas langelis turi buti zaidimo lentos bendrame mape
	@Override
	public void sauk() { // turim langeli padaryti nusauta ir pradeti skaiciuoti jo suviu skaiciu,
		langelioBusena = true;
		suviuSkaicius++;
	}

	@Override
	public Laivas getLaivas() { // kreipiames i laiva kalse
		
		return null;
	}

	@Override
	public boolean arSauta() {
		return langelioBusena;
	}

	@Override
	public int sakykKiekKartuSauta() {
		return suviuSkaicius;
	}

	@Override
	public String getX() { // pagal ideja turim grazinti is zaidimo lentos x o poto Y
		
		return null;
	}

	@Override
	public int getY() {

		return 0;
	}

}
