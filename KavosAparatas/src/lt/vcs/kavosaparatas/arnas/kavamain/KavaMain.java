package lt.vcs.kavosaparatas.arnas.kavamain;
import lt.vcs.kavosaparatas.arnas.aparatoaptarnavimas.AparatoAptarnavimas;
import lt.vcs.kavosaparatas.arnas.kavosaparatas.Kava;


public class KavaMain {

	public static void main(String[] args) {
		
		
		
		
		Kava kava = new Kava(300, 300, 400);
		
		kava.gaminkKava("praskiesta");
		
		
		
		
		
		
		
		/*Kava aparatas = new Kava(80, 70, 500);
		Kava aparatas2 = new Kava(100, 90, 400);
		AparatoAptarnavimas aptarnavimas = new AparatoAptarnavimas();

		Kava[] aparatuMasyvas = aptarnavimas.sukurkNAparatu(3);

		aparatuMasyvas[0].pasirinkKava();
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].kiekProduktuLike();
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
		aptarnavimas.priskirkSkirtingusProduktusMasyvui(aparatuMasyvas, aparatas2.getProduktai() );
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].kiekProduktuLike();
			System.out.println();
		}

		aparatuMasyvas[0].pasirinkKava();
		for (int i = 0; i < aparatuMasyvas.length; i++) {
			aparatuMasyvas[i].kiekProduktuLike();
			System.out.println();
		}*/
		
		/*Kava aparatas= new Kava(10, 10, 10);
		Kava aparatas2 = new Kava(20,20,20);
		AparatoAptarnavimas aptarnavimas = new AparatoAptarnavimas();
		aparatas.kiekProduktuLike();
		System.out.println();
		aparatas2.kiekProduktuLike();
		System.out.println();
		aptarnavimas.priskirkProduktus(aparatas, aparatas2.getProduktai());
		aparatas.kiekProduktuLike();
		System.out.println();
		aparatas2.kiekProduktuLike();*/

	}

}
