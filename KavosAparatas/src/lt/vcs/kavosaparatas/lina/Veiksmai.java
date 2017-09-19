package lt.vcs.kavosaparatas.lina;

import lt.vcs.kavosaparatas.lina.aparatai.KavosAparatas;
import lt.vcs.kavosaparatas.lina.aptarnavimas.KavosAparataAptarnaujantiKlase;

public class Veiksmai {

	public static void main(String[] args) {
		
		//#1
	/*	KavosAparatas kavosaparatas=new KavosAparatas();
		kavosaparatas.atspausdinkAparatoBusena();
		kavosaparatas.gaminkKava(KavosAparatas.KAVASUPIENU);
		kavosaparatas.atspausdinkAparatoBusena();
		kavosaparatas.atlikPlovima();
		kavosaparatas.atspausdinkAparatoBusena();
		kavosaparatas.papildykProduktus(1, 10, 0, 0.3);
		kavosaparatas.atspausdinkAparatoBusena();
		kavosaparatas.atspausdinkProduktuLikuti(); */
		
		//#2
		/*KavosAparataAptarnaujantiKlase kavosaparatas = new KavosAparataAptarnaujantiKlase();
		KavosAparatas kavosapratas2 = kavosaparatas.sukurkKavosAparata();
		
		kavosapratas2.atspausdinkAparatoBusena();
		kavosapratas2.gaminkKava(KavosAparatas.KAVASUPIENU);
		kavosapratas2.atspausdinkAparatoBusena();
		kavosaparatas.isplaukKavosAparata(kavosapratas2);
		kavosapratas2.atspausdinkAparatoBusena();*/
		
		//#3
		KavosAparataAptarnaujantiKlase kavosaparatas = new KavosAparataAptarnaujantiKlase();
		KavosAparatas []kavosAparatuMasyvas = kavosaparatas.sukurkKavosAparatuMasyva(3);
		
		
		kavosaparatas.priskirkTaPatiProduktuObjekta(kavosAparatuMasyvas);
		
		for (int i=0;i<kavosAparatuMasyvas.length;i++) {
			System.out.println("Aparatas "+i);
			kavosAparatuMasyvas[i].atspausdinkAparatoBusena();
			System.out.println("");
			
			if (i%2 == 0) {
				kavosAparatuMasyvas[i].gaminkKava(KavosAparatas.LATTE);
			}
			
			kavosAparatuMasyvas[i].atspausdinkAparatoBusena();
			System.out.println("");
			
		}
		
		kavosaparatas.isplaukNAparatu(kavosAparatuMasyvas);
		kavosaparatas.isvalykNAparatu(kavosAparatuMasyvas);
		kavosaparatas.atspausdinkLikuti(kavosAparatuMasyvas);
	
	}

}
