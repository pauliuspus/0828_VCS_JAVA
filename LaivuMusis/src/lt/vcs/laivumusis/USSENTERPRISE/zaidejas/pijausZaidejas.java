package lt.vcs.laivumusis.USSENTERPRISE.zaidejas;

import java.util.List;
import java.util.Scanner;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.common.Zaidejas;
import lt.vcs.laivumusis.common.Zaidimas;

public class pijausZaidejas implements Zaidejas {
	Scanner laivoScaneris = new Scanner(System.in);

	private Zaidimas zaidimas;
	private String zaidejasId = "Krabas";

	public pijausZaidejas() {

	}

	public pijausZaidejas(Zaidimas zaidimas) {
		this.zaidimas = zaidimas;
	}

	@Override
	public void run() {// sutvarkyti nauja isvis galbut Siwtch iskelti i metoda pagalvot kaip veikt
		System.out.println(zaidejasId);
		while (true) {
			switch (zaidimas.tikrinkBusena(zaidejasId)) {
			case Registracija:
				this.zaidimas.registruokZaideja(zaidejasId);
				break;
			case DalinemesLaivus:
				this.zaidimas.duokLaivus(zaidejasId);
				break;
			case DalinamesZemelapius:
				this.zaidimas.duokZaidimoLenta(zaidejasId);
				break;
			case RikiuojamLaivus:
				zaidejauPridekLaivus();
				break;
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

	public void zaidejauSauk() {
		String x = laivoScaneris.nextLine();
		int y = laivoScaneris.nextInt();
		zaidimas.sauk(x, y, zaidejasId);
	}

	// patikrinti ar laivas gerai sudetas
	public void zaidejauPridekLaivus() {
		List<Laivas> laivuListas = this.zaidimas.duokLaivus(zaidejasId);

		for (int i = 0; i < laivuListas.size(); i++) {
			Laivas laivelis = laivuListas.get(i);
			List<Langelis> laivuLangeliai = laivelis.getLaivoKoordinates();
			for (int a = 0; a < laivelis.getLaivoIlgis(); a++) {
				System.out.println("Iveskite laivo kordinate X");
				String x = laivoScaneris.nextLine();
				System.out.println("Iveskite laivo kordinate Y");
				int y = laivoScaneris.nextInt();
				laivuLangeliai.add(new lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis(x, y));
			}
			laivelis.setKordinates(laivuLangeliai);
			try {
				this.zaidimas.pridekLaiva(laivelis, zaidejasId);
			} catch (Exception e) {

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
