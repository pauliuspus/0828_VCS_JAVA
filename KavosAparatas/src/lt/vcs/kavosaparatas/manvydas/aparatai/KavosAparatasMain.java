package lt.vcs.kavosaparatas.manvydas.aparatai;

import lt.vcs.kavosaparatas.common.exceptions.NesvarusAparatas;
import lt.vcs.kavosaparatas.common.exceptions.TrukstaProduktu;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.Espresso;

public class KavosAparatasMain {

	public static void main(String[] args) {

		KavosAparatas kavosAparatas = new KavosAparatas(5, 20, 0);

		try {
			kavosAparatas.gaminkKava("JUODA");
			kavosAparatas.gaminkKava("JUODA");
			
			
			
			
			
			
		} catch (TrukstaProduktu e) {
			System.out.println("Reikia papildyti produktu");
			e.printStackTrace();
		} catch (NesvarusAparatas e) {
			System.out.println("Reikia isplauti aparata");
			e.printStackTrace();
		}
		

	}
}
