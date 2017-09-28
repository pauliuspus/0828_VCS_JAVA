package lt.vcs.andrius.exceptions;

import java.util.Random;

public class Termometras {

	public static void matuokTemperatura() throws PerKarsta, PerSalta {
		boolean suluzo = new Random().nextInt(10) % 5 == 0;
		if (suluzo) {
			throw new SuluzoTermometras();
		}

		int temperatura = new Random().nextInt(150) - 25;
		System.out.println(temperatura);
		if (temperatura <= 0) {
			throw new PerSalta(temperatura);
		}
		if (temperatura > 99) {
			throw new PerKarsta(temperatura);
		}
	}

	public static void main(String[] args) {

		while (true) {
			try {
				matuokTemperatura();
			} catch (PerKarsta e) {
				System.out.println("KARSTA: " + e.getBlogaTemperatura());
			} catch (PerSalta e) {
				System.out.println("SALTA: " + e.getBlogaTemperatura());
			}
		}

		/*
		 * if (rezultatas == 0) { System.out.println("ok"); } else {
		 * System.out.println("kazkas negerai"); }
		 */

	}

}
