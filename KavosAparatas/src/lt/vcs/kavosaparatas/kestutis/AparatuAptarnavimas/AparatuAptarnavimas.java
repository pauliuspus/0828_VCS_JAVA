package lt.vcs.kavosaparatas.kestutis.aparatuaptarnavimas;

import lt.vcs.kavosaparatas.kestutis.kavosaparatas.KavosAparatas;
import lt.vcs.kavosaparatas.kestutis.produktai.Produktai;

public class AparatuAptarnavimas {
	
	
	/*public   KavosAparatas sukurkAparata() {
		return  new KavosAparatas(0,0,0);
	}

	public void isplaukKavosAparata(KavosAparatas isplauk) {
		isplauk.
	}
	
	public   KavosAparatas[] sukurkMasyva(int n) {
		KavosAparatas[] masyvas = new KavosAparatas[n];
		for(int i = 0; i < masyvas.length ; i++)
		{
		    masyvas[i] = new KavosAparatas(0,0,0);
		}			
		return masyvas;
	}
	
public void sumuokIrValykProduktus(KavosAparatas[] masyvas, int cukrausSuma, int kavosSuma, int vandensSuma) {
		
		for(int i = 0; i < masyvas.length ; i++)
		{
		cukrausSuma = cukrausSuma + masyvas[i].produktai.getCukrus();
		kavosSuma = kavosSuma + masyvas[i].produktai.getKava();
		vandensSuma = vandensSuma + masyvas[i].produktai.getVanduo();
		masyvas[i].produktai.setCukrus(0);
		masyvas[i].produktai.setKava(0);
		masyvas[i].produktai.setVanduo(0);
		}		
		
		System.out.println("isvalyta cukraus " + cukrausSuma);
		System.out.println("isvalyta kavos " + kavosSuma);
		System.out.println("isvalyta vandens " + vandensSuma);
}

	

	public void isplaukVisusAparatus(KavosAparatas[] masyvas) {
		
		for(int i = 0; i < masyvas.length ; i++)
		{
		    masyvas[i].valykAparata();
		}			
	 }
	
	public void priskirkTaPatiObjekta(KavosAparatas[] masyvas) {
		Produktai naujas = new Produktai(10,10,10);
		for(int i = 0; i < masyvas.length ; i++)
		{
			masyvas[i].setProduktai(naujas);
		}		
	}	
	public void priskirkSkirtingusObjektus(KavosAparatas[] masyvas) {
		Produktai naujas = new Produktai(20,20,20);
		for(int i = 0; i < masyvas.length ; i++)
		{
			masyvas[i].setProduktai(naujas);
		}			
	}	
	
	public Produktai istraukProduktus(KavosAparatas k) {
		return k.getProduktai();*/
	
	public KavosAparatas[] sukurkKavosAparatus(int skaicius) {
		KavosAparatas[] kavosAparatai = new KavosAparatas[skaicius];

		for (int i = 0; i < kavosAparatai.length; i++) {
			kavosAparatai[i] = new KavosAparatas(0,0,0);
		}

		return kavosAparatai;
	}

	private void sumuokProduktus(Produktai produktuSuma, Produktai produktaiPrideti) {
		produktuSuma.setCukrus(produktuSuma.getCukrus() + produktaiPrideti.getCukrus());
		produktuSuma.setKava(produktuSuma.getKava() + produktaiPrideti.getKava());
		produktuSuma.setVanduo(produktuSuma.getVanduo() + produktaiPrideti.getVanduo());
	}

	public void isvalykAparatuProduktus(KavosAparatas[] kavosAparatai) {

		Produktai produktuSuma = new Produktai(0, 0, 0);

		for (int i = 0; i < kavosAparatai.length; i++) {
			sumuokProduktus(produktuSuma, kavosAparatai[i].getProduktai());
			kavosAparatai[i].isvalykProduktus();
		}

		System.out.println("Isvalyta cukraus: " + produktuSuma.getCukrus());
		System.out.println("Isvalyta pupeliu: " + produktuSuma.getKava());
		System.out.println("Isvalyta vandens: " + produktuSuma.getVanduo());
	}

	public void isplaukAparatus(KavosAparatas[] kavosAparatai) {
		for (int i = 0; i < kavosAparatai.length; i++) {
			// Kreipiuosi i sukurta vino aparato plovimo metoda; galima kreiptis
			// ir kavosAparatai[i].atlikPlovima();
			isplaukAparatà(kavosAparatai[i]);
		}
	}

	public void priskirkVisiemsTaPatiProdukta(KavosAparatas[] kavosAparatai, Produktai produktai) {
		for (int i = 0; i < kavosAparatai.length; i++) {
			kavosAparatai[i].setProduktai(produktai);
		}
	}

	public void priskirkVisiemsTaAtskiraProdukta(KavosAparatas[] kavosAparatai) {
		for (int i = 0; i < kavosAparatai.length; i++) {
			kavosAparatai[i].setProduktai(new Produktai(40, 40, 40
					));
		}
	}

	public void isplaukAparatà(KavosAparatas kavosAparatas) {
		kavosAparatas.atlikPlovima();
	}
	
	
	
			
			public static void main(String[] args) {
		         

	}

}
