package lt.vcs.kavosaparatas.lina.aptarnavimas;

import lt.vcs.kavosaparatas.lina.aparatai.KavosAparatas;
import lt.vcs.kavosaparatas.lina.produkcija.Produktai;

public class KavosAparataAptarnaujantiKlase {

	public KavosAparatas sukurkKavosAparata() {
		return new KavosAparatas();
	}

	public void isplaukKavosAparata(KavosAparatas kavosaparatas) {
		kavosaparatas.atlikPlovima();
	}

	public KavosAparatas[] sukurkKavosAparatuMasyva(int n) {
		KavosAparatas[] masyvas = new KavosAparatas[n];
		for (int i = 0; i < masyvas.length; i++) {
			masyvas[i] = sukurkKavosAparata();
		}
		return masyvas;
	}

	public void isvalykNAparatu(KavosAparatas[] masyvas) {
		for (int i = 0; i < masyvas.length; i++) {
			KavosAparatas kavosaparatas = masyvas[i];

			Produktai k = kavosaparatas.getProduktaiKopija();
			kavosaparatas.isvalykProduktus();

			System.out.println("Aparatas isvalytas. Isvalyta buvo: ");
			k.atspausdinkProduktus();

		}
	}

	public void isplaukNAparatu(KavosAparatas[] masyvas) {
		for (int i = 0; i < masyvas.length; i++) {
			KavosAparatas kavosaparatas = masyvas[i];
			kavosaparatas.atlikPlovima();
		}
	}

	public KavosAparatas[] priskirkTaPatiProduktuObjekta(KavosAparatas[] masyvas) {
		Produktai produktai = new Produktai();

		for (int i = 0; i < masyvas.length; i++) {
			masyvas[i] = new KavosAparatas(produktai);
			// masyvas[i].setProduktai(); - yra toks variantas, tik reikia sukurti set
			// metoda.
		}
		return masyvas;
	}

	public KavosAparatas[] priskirkTaPatiProduktuObjekta(KavosAparatas[] masyvas, Produktai produktai) {
		for (int i = 0; i < masyvas.length; i++) {
			masyvas[i] = new KavosAparatas(produktai);
			// masyvas[i].setProduktai(); - yra toks variantas, tik reikia sukurti set
			// metoda.
		}
		return masyvas;
	}

	public KavosAparatas[] priskirkSkirtingusProduktuObjektus(KavosAparatas[] masyvas) {

		for (int i = 0; i < masyvas.length; i++) {
			masyvas[i] = new KavosAparatas(new Produktai());
		}
		return masyvas;
	}

	public Produktai istraukProduktus(KavosAparatas k) {
		// return k.getProduktai();
		return k.getProduktaiKopija();
	}

	public void atspausdinkLikuti(KavosAparatas[] masyvas) {
		for (int i = 0; i < masyvas.length; i++) {
			masyvas[i].sakykProduktuBusena();
		}
	}
}
