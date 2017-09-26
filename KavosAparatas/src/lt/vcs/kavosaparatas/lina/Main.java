package lt.vcs.kavosaparatas.lina;

import lt.vcs.kavosaparatas.lina.aparatai.KavosAparatas;
import lt.vcs.kavosaparatas.lina.aptarnavimas.KavosAparataAptarnaujantiKlase;

public class Main {

	public static void main(String[] args) {
		KavosAparataAptarnaujantiKlase p = new KavosAparataAptarnaujantiKlase();
		KavosAparatas kavosaparatas = p.sukurkKavosAparata();
		kavosaparatas.sakykAparatoBusena();
		kavosaparatas.gaminkKava("latte");

	}
}