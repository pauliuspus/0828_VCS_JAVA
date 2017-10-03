package lt.vcs.andrius.enums;

public class Main {

	public static void skaiciuokApyvarta(Parduotuves p) {
		
		p.getDarbuotojuSk();
		
		p.getParduotuviuSk();

		if (p == Parduotuves.Lidl) {

		}

		switch (p) {
		case Lidl:

			break;
		case Maxima:

			break;

		default:
			break;
		}
		//
	}

	public static void main(String[] args) {
		Parduotuves p = Parduotuves.Lidl;

		// Parduotuves p2 = Parduotuves.valueOf("Lidl");
		// System.out.println(p2);

		for (Parduotuves parduotuve : Parduotuves.values()) {
			System.out.println(parduotuve);
		}

		skaiciuokApyvarta(p);
		skaiciuokApyvarta(Parduotuves.Maxima);

	}

}
