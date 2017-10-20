package lt.vcs.laivumusis.USSENTERPRISE;

import lt.vcs.laivumusis.USSENTERPRISE.zaidejas.pijausZaidejas;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimas.Zaidimas;

public class pijausMain {

	public static void main(String[] args) {
		Zaidimas zaidimas = new Zaidimas();
		//pijausZaidejas zaidejas = new pijausZaidejas(zaidimas);
		Thread x = new Thread(new pijausZaidejas(zaidimas));
		x.start();
		/*zaidejas.getZaidimas().registruokZaideja("Krabas");
		zaidejas.zaidejauPridekLaivus();*/
	}

}
