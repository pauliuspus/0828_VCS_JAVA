package lt.vcs.kavosaparatas.kestutis.KavosAparatas;

import lt.vcs.kavosaparatas.kestutis.Produktai.Produktai;

public class KavosAparatas {
	
	//int cukrus = 0;
	//int kava = 0;
	//int vanduo = 0;
	private int panaudojimai = 0;
	
	public Produktai produktai;
	
	public KavosAparatas (int cukrus, int kava, int vanduo) {
		/*this.cukrus = cukrus;
		this.kava = kava;
		this.vanduo = vanduo;*/
		produktai = new Produktai(cukrus, kava, vanduo);
	
	}
	
	public void gaminkJuodaKava() {
		
		if (this.panaudojimai < 50) {
			if (tikrinkArUztenka()) {
				produktai.setCukrus(produktai.getCukrus() - 1);
				produktai.setKava(produktai.getKava() - 1);
				produktai.setVanduo(produktai.getVanduo() - 1);
				this.panaudojimai ++; 
				System.out.println("skanaus");
			}
			
		}
		else System.out.println("isvalyk aparata");
		
	}
	
public void gaminkEspresso() {
		
		if (this.panaudojimai < 50) {
			if (tikrinkArUztenka()) {
				produktai.setCukrus(produktai.getCukrus() - 1);
				produktai.setKava(produktai.getKava() - 2);
				produktai.setVanduo(produktai.getVanduo() - 1);
				this.panaudojimai ++; 
				System.out.println("skanaus");
			}
			
		}
		else System.out.println("isvalyk aparata");
		
	}

public void gaminkCapuccino() {
	
	if (this.panaudojimai < 50) {
		if (tikrinkArUztenka()) {
			produktai.setCukrus(produktai.getCukrus() - 2);
			produktai.setKava(produktai.getKava() - 1);
			produktai.setVanduo(produktai.getVanduo() - 2);
			this.panaudojimai ++; 
			System.out.println("skanaus");
		}
		
	}
	else System.out.println("isvalyk aparata");
	
}
	
	private boolean tikrinkArUztenka() {
					
		if (produktai.getCukrus() < 2) { System.out.println("Neuztenka cukraus");
		 return false;}
		if (produktai.getKava() < 2) { System.out.println("Neuztenka kavos");
		 return false;}
		if (produktai.getVanduo() < 2) { System.out.println("Neuztenka vandens");
		 return false;}
		return true;
		
		}
	
	public void papildykCukraus () {
		if (produktai.getCukrus() < 50) {
		produktai.setCukrus(produktai.getCukrus() + 50);
		System.out.println("Cukraus papildyta");
		} else System.out.println("cukraus uztenka");
			
	}
	
	public void papildykPupeliu () {
		if (produktai.getKava() < 50) {
			produktai.setKava(produktai.getKava() + 50);
			System.out.println("pupeliu papildyta");
			} else System.out.println("pupeliu uztenka");
				
	}
	
	public void papildykVandens () {
		if (produktai.getVanduo() < 50) {
			produktai.setVanduo(produktai.getVanduo() + 50);
			System.out.println("vandens papildyta");
			} else System.out.println("vandens uztenka");
		
	}
	
	public void valykAparata() {
		this.panaudojimai = 0;
		System.out.println("Aparatas isvalytas");
	}
	
	public void rodykBusena() {
		System.out.println("cukraus " + produktai.getCukrus() + ", "
				+ "kavos " + produktai.getKava() + ", Vandens " + produktai.getVanduo());
		System.out.println("iki valymo liko " + (50 - getPanaudojimai()));
	}
	
	



	/*public int getCukrus() {
		return cukrus;
	}

	public void setCukrus(int cukrus) {
		this.cukrus = cukrus;
	}

	public int getKava() {
		return kava;
	}

	public void setKava(int kava) {
		this.kava = kava;
	}

	public int getVanduo() {
		return vanduo;
	}

	public void setVanduo(int vanduo) {
		this.vanduo = vanduo;
	}*/

	public int getPanaudojimai() {
		return panaudojimai;
	}

	public void setPanaudojimai(int panaudojimai) {
		this.panaudojimai = panaudojimai;
	}

	public Produktai getProduktai() {
		return produktai;
	}

	public void setProduktai(Produktai produktai) {
		this.produktai = produktai;
	}

	public static void main(String[] args) {
		

	}

}
