package lt.vcs.kavosaparatas.pijus.puodeliai;

import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.Products;
import lt.vcs.kavosaparatas.pijus.produktai.Produktai;

public class Puodelis {
	protected double maxPuodelioTalpa = 0.4;

	public void rodykInformacija() {
		System.out.println("Puodelio talpa: " + maxPuodelioTalpa);
	}

}
