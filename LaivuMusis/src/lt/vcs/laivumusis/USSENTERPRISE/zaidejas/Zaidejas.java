package lt.vcs.laivumusis.USSENTERPRISE.zaidejas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.common.Zaidimas;

public class Zaidejas implements lt.vcs.laivumusis.common.Zaidejas {

	Scanner laivoScaneris = new Scanner(System.in);

	private Zaidimas zaidimas;
	private String zaidejasId;
	private Laivas laivelis;
	private int y;
	private String x;

	public Zaidejas() {

	}

	public Zaidejas(Zaidimas zaidimas) {
		this.zaidimas = zaidimas;
	}

	@Override
	public void run() {

		while (true) {
			switch (zaidimas.tikrinkBusena(zaidejasId)) {
			case Registracija:
				this.zaidimas.registruokZaideja();
				break;
			case DalinemesLaivus:
				this.zaidimas.duokLaivus(zaidejasId);
				break;
			case DalinamesZemelapius:
				this.zaidimas.duokZaidimoLenta(zaidejasId);
				break;
			case RikiuojamLaivus:
				// this.zaidimas.pridekLaiva(, zaidejasId);
				break;
			case TavoEile:
				// this.zaidimas.sauk('A', 10, zaidejasId);
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
			this.zaidimas.pridekLaiva(laivelis, zaidejasId);
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
