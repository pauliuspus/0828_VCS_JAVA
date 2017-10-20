package lt.vcs.laivumusis.USSENTERPRISE.zaidejas;

import java.util.List;
import java.util.Scanner;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.org.apache.xml.internal.security.keys.storage.implementations.SingleCertificateResolver;

import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.common.Zaidejas;
import lt.vcs.laivumusis.common.Zaidimas;

public class pijausZaidejas implements Zaidejas {
	Scanner laivoScaneris = new Scanner(System.in);

	private Zaidimas zaidimas;
	private String zaidejasId = "Krabas";
	private List<Laivas> zaidejoLaivuListas;
	private lt.vcs.laivumusis.common.ZaidimoLenta zaidejoZaidimoLenta;

	public pijausZaidejas(Zaidimas zaidimas) {
		this.zaidimas = zaidimas;
	}

	@Override
	public void run() {// sutvarkyti nauja isvis galbut Siwtch iskelti i metoda pagalvot kaip veikt
		System.out.println(zaidejasId);
		boolean a = zaidimas.registruokZaideja(zaidejasId);

		while (a) {
			switch (zaidimas.tikrinkBusena(zaidejasId)) {
			case DalinemesLaivus:
				zaidejoLaivuListas = this.zaidimas.duokLaivus(zaidejasId);
				continue;
			case DalinamesZemelapius:
				zaidejoZaidimoLenta = this.zaidimas.duokZaidimoLenta(zaidejasId);
				continue;
			case RikiuojamLaivus:
				zaidejauPridekLaivus();
				continue;
			case TavoEile:
				zaidejauSauk();
				break;
			case PriesininkoEile:

				break;
			case TuLaimejai:

				break;
			case PriesasLaimejo:

				break;
			}
		}

	}
	// public void generuokRandomLaivoKordinates

	public void zaidejauSauk() {
		String x = laivoScaneris.nextLine();
		int y = laivoScaneris.nextInt();
		zaidimas.sauk(x, y, zaidejasId);
	}

	
	public synchronized void zaidejauPridekLaivus() {

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
