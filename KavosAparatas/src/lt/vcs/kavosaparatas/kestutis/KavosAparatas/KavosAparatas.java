package lt.vcs.kavosaparatas.kestutis.KavosAparatas;



import lt.vcs.kavosaparatas.common.CoffeeMashine;
import lt.vcs.kavosaparatas.kestutis.kavos.Capuccino;
import lt.vcs.kavosaparatas.kestutis.kavos.Espresso;
import lt.vcs.kavosaparatas.kestutis.kavos.JuodaKava;
import lt.vcs.kavosaparatas.kestutis.Produktai.Produktai;
import lt.vcs.kavosaparatas.kestutis.puodeliai.KavosPuodelis;

public class KavosAparatas implements CoffeeMashine {
	
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
	
	/*public void gaminkJuodaKava() {
		
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
	
}*/
	
	
	
	public KavosPuodelis gaminkKava(String kavosTipas) {

        KavosPuodelis puodelis = null;
        switch (kavosTipas) {
        case "Juoda Kava":
            puodelis = new JuodaKava();
            break;
        case "Espresso":
            puodelis = new Espresso();
            break;
        case "Capuccino":
            puodelis = new Capuccino();
            break;
        default:
            System.out.println("Neturime tokio tipo kavos: " + kavosTipas);
            break;
        }

        if (puodelis != null)
            gaminkKava(puodelis);
        
        return puodelis;
    }
	
	private void gaminkKava(KavosPuodelis puodelis) {
        Produktai produktai = puodelis.getProduktai();
        gaminkKava(produktai.getCukrus(), produktai.getKava(), produktai.getVanduo());
        puodelis.setKavaPagaminta(true);
    }
	
	 private void gaminkKava(int cukrus, int kava, int vanduo) {
	            if (arUzteksProduktu(cukrus, kava, vanduo) && !arReikiaPlovimo()) {
	            produktai.setCukrus(produktai.getCukrus() - cukrus);
	            produktai.setKava(produktai.getKava() - kava);
	            produktai.setVanduo(produktai.getVanduo() - vanduo);

	            this.panaudojimai++;

	            System.out.println("Skanios kavos!");
	        }
	    }
	
	 public void atlikPlovima() {
	        if (this.panaudojimai == 0) {
	            System.out.println("Aparatas jau isplautas");
	        } else {
	            this.panaudojimai = 0;
	            System.out.println("Aparatas sekmingai isplautas");
	        }
	    }
	 
	 public void sakykProduktuBusena() {
	        System.out.println("Liko cukraus: " + produktai.getCukrus());
	        System.out.println("Liko pupeliu: " + produktai.getKava());
	        System.out.println("Liko vandens: " + produktai.getVanduo());
	    }
	 
	 public void sakykAparatoBusena() {
	        System.out.println("Liko iki plovimo: " + (50 - panaudojimai));
	        sakykProduktuBusena();
	    }
	 
	 
	 public boolean arAparatasPasiruoses() {
	        boolean pasiruoses = !arReikiaPlovimo() && arUzteksProduktu(1, 1, 1);
	        if (pasiruoses) {
	            System.out.println("Aparatas pasiruoses!");
	        } else {
	            System.out.println("Aparatas nepasiruoses!");
	        }
	        return pasiruoses;
	    }
	 
	 public void isvalykProduktus() {
	        produktai.setCukrus(0);
	        produktai.setKava(0);
	        produktai.setVanduo(0);
	    }
	 
	 private boolean arReikiaPlovimo() {
	        if (panaudojimai >= 50) {
	            System.out.println("Reikalingas plovimas!");
	            return true;
	        } else {
	            return false;
	        }
	    }
	 
	 private boolean arUzteksProduktu(int cukrus, int kava, int vanduo) {
	        boolean uztenka = true;
	        if (produktai.getCukrus() - cukrus < 0) {
	            uztenka = false;
	            System.out.println("Neuztenka cukraus");
	        }
	        if (produktai.getKava() - kava < 0) {
	            uztenka = false;
	            System.out.println("Neuztenka pupeliu");
	        }
	        if (produktai.getVanduo() - vanduo < 0) {
	            uztenka = false;
	            System.out.println("Neuztenka vandens");
	        }
	        return uztenka;
	    }
	 
	 public void ismurzinkAparata() {
	        this.panaudojimai = 50;
	        System.out.println("Aparatas murzinas");
	    }
	 
	/*private boolean tikrinkArUztenka() {
					
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
	
	*/



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
	 
	 public void papildykCukraus(int cukrus) {
	        produktai.setCukrus(produktai.getCukrus() + cukrus);
	    }

	    public void papildykPupeliu(int kava) {
	        produktai.setKava(produktai.getKava() + kava);
	    }

	    public void papildykVandens(int vanduo) {
	        produktai.setVanduo(produktai.getVanduo() + vanduo);
	    }

	

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

	public Produktai getProduktaiKopija() {
        return this.produktai.gaukKopija();
    }
	public static void main(String[] args) {
		

	}

}
