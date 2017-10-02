package lt.vcs.kavosaparatas.lina;

import lt.vcs.kavosaparatas.common.exceptions.NesvarusAparatas;
import lt.vcs.kavosaparatas.common.exceptions.TrukstaProduktu;
import lt.vcs.kavosaparatas.lina.aparatai.KavosAparatas;


public class Main {

	public static void main(String[] args) {

		KavosAparatas kavosaparatas = new KavosAparatas();
		kavosaparatas.sakykAparatoBusena();
		try {
			kavosaparatas.gaminkKava("Latte");
		} catch (TrukstaProduktu e) {
			e.getMessage();
		} catch (NesvarusAparatas e) {
			e.getStackTrace();
		}
		kavosaparatas.sakykAparatoBusena();

	}
}