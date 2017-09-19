package lt.vcs.kavosaparatas.manvydas.aparatai;

import java.util.Scanner;

<<<<<<< HEAD
import lt.vcs.kavosaparatas.common.CoffeeMashine;
=======
import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.common.Products;
>>>>>>> 3ca13b297463384a422e58cf60b2a24d5bd9054a
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.DvigubaEspresso;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.Espresso;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.JuodaKava;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.KavaSuPienu;
import lt.vcs.kavosaparatas.manvydas.kavospuodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.manvydas.resursai.Produktai;

<<<<<<< HEAD
public class KavosAparatas{
=======
public class KavosAparatas implements CoffeeMashine{
>>>>>>> 3ca13b297463384a422e58cf60b2a24d5bd9054a

	// Konstanta, kuri galioja visiems aparatams
	private static final int PANAUDOJIMU_SK_PRIES_PLOVIMA = 2;

	// Kintamasis panaudojimu skaicius
	public int panaudojimuSkaicius;

	private Produktai produktai;

	// Kavos aparato konstruktoriai
	public KavosAparatas(int cukrusAparateGramais, int kavaAparateGramais, int pienasAparateMililitrais) {
		produktai = new Produktai(cukrusAparateGramais, kavaAparateGramais, pienasAparateMililitrais);
	}

	public KavosAparatas() {
		this(0, 0, 0);
	}

	public KavosAparatas(int kavaAparateGramais) {
		this(kavaAparateGramais, 0, 0);
	}

	// Grazina produktu kopija NB!! Sitas metodas yra blogai parasytas!!!
	public Produktai grazinkProduktuKopija() {
		Produktai produktuKopija = new Produktai(0, 0, 0);
		produktuKopija = this.produktai;
		return produktuKopija;
	}

	// Produktu set metodas
	public void setProduktai(Produktai produktai) {
		this.produktai = produktai;
	}

	// Metodas kavai gaminti
	public void gaminkKava() {

		// Vidiniai metodo kintamieji, kurie saugo pasirinkimus
		int kavosPasirinkimas;
		int cukrausPasirinkimas;

		// Scanneris, skirtas irasyti ivestiems pasirinkimams
		Scanner s = new Scanner(System.in);

		// Tikriname, ar reikia islplauti pries naudojima
		if (PANAUDOJIMU_SK_PRIES_PLOVIMA - this.panaudojimuSkaicius <= 0) {
			System.out.println("Aparatas nesvarus! Inicijuojamas plovimas...");
			atlikPlovima();
		}

		// Jei truksta vieno is produktu, iskvieciamas papildymo metodas
		if (produktai.getKavaAparateGramais() < 40) {
			System.out.println("Aparate truksta kavos");
			papildykPupeliu(0);
		}
		if (produktai.getCukrusAparateGramais() < 20) {
			System.out.println("Aparate truksta cukraus");
			papildykCukraus(0);
		}
		if (produktai.getPienasAparateMililitrais() < 20) {
			System.out.println("Aparate truksta pieno");
			papildykPiena();
		}

		// Atspausdinami kavos pasirinkimai
		do {
			System.out.println("Aparatas pasiruoses");
			System.out.println("Pasirinkite, kokios kavos noresite?");
			System.out.println("1. Juoda kava");
			System.out.println("2. Espresso");
			System.out.println("3. Dviguba Espresso");
			System.out.println("4. Kava su pienu");

			// Sukuriame ir issaugome pasirinkimo kintamaji
			kavosPasirinkimas = s.nextInt();

			// Apsaugome nuo neteisingo pasirinkimo
			if (kavosPasirinkimas > 4 || kavosPasirinkimas < 1) {
				System.out.println("Blogai ivestas pasirinkimas, bandykite is naujo");
				continue;
			}
		} while (kavosPasirinkimas > 4 || kavosPasirinkimas < 1);
		
		// Atspausdinami cukraus kieko pasirinkimai
				do {
					System.out.println("Ar noresite papildomai cukraus?");
					System.out.println("1. Ne");
					System.out.println("2. Viena cukraus");
					System.out.println("3. Du cukraus");

					// Sukuriame ir issaugome pasirinkimo kintamaji
					cukrausPasirinkimas = s.nextInt();

					// Apsaugome nuo neteisingo pasirinkimo
					if (cukrausPasirinkimas > 3 || cukrausPasirinkimas < 1) {
						System.out.println("Blogai ivestas pasirinkimas, bandykite is naujo");
						continue;
					}
				} while (cukrausPasirinkimas > 3 || cukrausPasirinkimas < 1);
		// Kvieciama privatu kavos gaminimo metoda
		gaminkKava(kavosPasirinkimas,cukrausPasirinkimas);

	}

	// Pasleptas metodas kavos gaminimui
	private KavosPuodelis gaminkKava(int kavosPasirinkimas, int cukrausPasirinkimas) {
		
		// Pamazinam cukraus pagal pasirinkima
				switch (cukrausPasirinkimas) {
				case 1:

					break;
				case 2:
					produktai.setCukrusAparateGramais(produktai.getCukrusAparateGramais() - 10);
					break;
				case 3:
					produktai.setCukrusAparateGramais(produktai.getCukrusAparateGramais() - 20);
					break;
				}

		//iskvieciam metoda pamazinti produktus pagal pasirinkta kava
		KavosPuodelis puodelis = null;
		switch (kavosPasirinkimas) {
		case 1:
			puodelis = new JuodaKava();
			break;
		case 2:
			puodelis = new Espresso();
			break;
		case 3:
			puodelis = new DvigubaEspresso();
			break;
		case 4:
			puodelis = new KavaSuPienu();
			break;
		}

		if (puodelis != null) {
			apartProdMinusPuodelioProd(puodelis);
			System.out.println(puodelis.toString());
		}

		return puodelis;

	}
	// Pamazinam kavos pagal pasirinkima
	private void apartProdMinusPuodelioProd(KavosPuodelis kavosPuodelis) {
		produktai.setKavaAparateGramais(
				produktai.getKavaAparateGramais() - kavosPuodelis.getProduktai().getKavaAparateGramais());
		produktai.setCukrusAparateGramais(
				produktai.getCukrusAparateGramais() - kavosPuodelis.getProduktai().getCukrusAparateGramais());
		produktai.setPienasAparateMililitrais(
				produktai.getPienasAparateMililitrais() - kavosPuodelis.getProduktai().getPienasAparateMililitrais());
		kavosPuodelis.setKavaPagaminta(true);
		this.panaudojimuSkaicius++;

	}

	// Metodas papildyti cukru
	@Override
	public void papildykCukraus(int cukrus) {
		Scanner s = new Scanner(System.in);
		System.out.println("Cukraus kiekis aparate yra: " + produktai.getCukrusAparateGramais() + " g.");
		System.out.println("Kiek gramu cukraus ipilsite?");

		do {
			cukrus = s.nextInt();
			if (produktai.getCukrusAparateGramais() + cukrus > 1000) {
				produktai.setCukrusAparateGramais(1000);
				System.out.println("Maximalus galimas kiekis yra 1000 g.");
				System.out.println("Aparate yra " + produktai.getCukrusAparateGramais() + " g. cukraus");
			} else if (cukrus < 20) {
				System.out.println("Minimalus galimas papildyti kiekis yra 20 g.");
				System.out.println("Iveskite is naujo");
			} else {
				produktai.setCukrusAparateGramais(produktai.getCukrusAparateGramais() + cukrus);
				System.out.println("Aparate yra " + produktai.getCukrusAparateGramais() + " g. cukraus");
			}
		} while (cukrus < 20);
	}

	// Metodas papildyti kava
	@Override
	public void papildykPupeliu(int pupeliuKiekis) {
		int kava;
		Scanner s = new Scanner(System.in);
		System.out.println("Kavos kiekis aparate yra: " + produktai.getKavaAparateGramais() + " g.");
		System.out.println("Kiek gramu kavos idesite?");
		do {
			kava = s.nextInt();
			if (produktai.getKavaAparateGramais() + kava > 1000) {
				produktai.setKavaAparateGramais(1000);
				System.out.println("Maximalus galimas kiekis yra 1000 g.");
				System.out.println("Aparate yra " + produktai.getKavaAparateGramais() + " g. kavos");
			} else if (kava < 40) {
				System.out.println("Minimalus kiekis, kuri galima papildyti yra 40 g.");
				System.out.println("Iveskite is naujo");
			} else {
				produktai.setKavaAparateGramais(produktai.getKavaAparateGramais() + kava);
				System.out.println("Aparate yra " + produktai.getKavaAparateGramais() + " g. kavos");
			}
		} while (kava < 40);
	}

	// Metodas papildyti piena
	public void papildykPiena() {
		int pienas;
		Scanner s = new Scanner(System.in);
		System.out.println("Pieno kiekis aparate yra: " + produktai.getPienasAparateMililitrais() + " ml.");
		System.out.println("Kiek mililitru pieno ipilsite?");

		do {
			pienas = s.nextInt();
			if (produktai.getPienasAparateMililitrais() + pienas > 1000) {
				produktai.setPienasAparateMililitrais(1000);
				System.out.println("Maximalus galimas kiekis yra 1000 ml.");
				System.out.println("Aparate yra " + produktai.getPienasAparateMililitrais() + " ml. pieno");
			} else if (pienas < 20) {
				System.out.println("Minimalus galimas papildyti kiekis yra 20 ml.");
				System.out.println("Iveskite is naujo");
			} else {
				produktai.setPienasAparateMililitrais(produktai.getPienasAparateMililitrais() + pienas);
				System.out.println("Aparate yra " + produktai.getPienasAparateMililitrais() + " ml. pieno");
			}
		} while (pienas < 20);
	}

	// Atlieka aparato plovima, kuris trunka nustatyta laiko trukme
	public void atlikPlovima() {
		if (this.panaudojimuSkaicius == 0) {
			System.out.println("Aparatas jau isplautas, plauti nereikia");
		} else {
			System.out.println("Aparatas plaunamas (uztruks 10 sekundziu...)");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
			}
			this.panaudojimuSkaicius = 0;
			System.out.println("Aparatas sekmingai isplautas!");
		}
	}

	// Produktu busenos tikrinimas
	public void sakykProduktuBusena() {
		System.out.println("Kavos aparate yra: " + produktai.getKavaAparateGramais() + " g.");
		System.out.println("Pieno aparate yra: " + produktai.getPienasAparateMililitrais() + " ml.");
		System.out.println("Cukraus aparate yra: " + produktai.getCukrusAparateGramais() + " g.");
	}

	// Pasako aparato busena
	public void sakykAparatoBusena() {
		System.out
				.println("Iki plovimo liko: " + (PANAUDOJIMU_SK_PRIES_PLOVIMA - panaudojimuSkaicius) + " panaudojimu");
		sakykProduktuBusena();
	}

	// Pasako, ar reikia plauti
	private boolean arReikiaPlauti() {
		if (panaudojimuSkaicius >= PANAUDOJIMU_SK_PRIES_PLOVIMA) {
			System.out.println("Aparata reikia plauti!");
			return true;
		} else {
			return false;
		}
	}

	// Pasako, ar aparatas paruostas naudojimui
	@Override
	public boolean arAparatasPasiruoses() {
		boolean paruostas = !arReikiaPlauti() && produktai.getKavaAparateGramais() != 0
				&& produktai.getCukrusAparateGramais() != 0 && produktai.getPienasAparateMililitrais() != 0;
		if (paruostas) {
			System.out.println("Aparatas paruostas");
		} else
			System.out.println("Aparatas neparuostas");
		return paruostas;
	}

	// Set ir get metodai panaudojimu skaiciui (nepanadoti?)
	private int getPanaudojimuSkaicius() {
		return panaudojimuSkaicius;
	}

	private void setPanaudojimuSkaicius(int panaudojimuSkaicius) {
		this.panaudojimuSkaicius = panaudojimuSkaicius;
	}

	@Override
	public CoffeeCup gaminkKava(String kavosTipas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ismurzinkAparata() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isvalykProduktus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Products getProduktaiKopija() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void papildykVandens(int vandensKiekis) {
		// TODO Auto-generated method stub
		
	}
}
