package lt.vcs.laivumusis.USSENTERPRISE.zaidejas;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Zaidimas;

public class Zaidejas implements lt.vcs.laivumusis.common.Zaidejas {

	private  Zaidimas zaidimas;
	private String zaidejasId;

	public Zaidejas(Zaidimas zaidimas) {
		this.zaidimas = zaidimas;
	}


	@Override
	public void run() {

		while(true) {
			switch(this.zaidimas.tikrinkBusena(this.zaidejasId)) {
				case Registracija :
					this.zaidimas.registruokZaideja();
					break;
				case DalinemesLaivus :

					break;
				case DalinamesZemelapius :

					break;
				case RikiuojamLaivus :

					break;
				case TavoEile :

					break;
				case PriesininkoEile :

					break;
				case TuLaimejai :

					break;
				case PriesasLaimejo :

					break;

			}


		}



	}
	public String getZaidejas() {
		return this.zaidejasId;
	}

	@Override
	public Zaidimas getZaidimas() {
		// TODO Auto-generated method stub
		return null;
	}

}
