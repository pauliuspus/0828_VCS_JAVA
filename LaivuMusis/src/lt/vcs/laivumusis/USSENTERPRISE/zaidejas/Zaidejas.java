package lt.vcs.laivumusis.USSENTERPRISE.zaidejas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;
import lt.vcs.laivumusis.common.Zaidimas;

public class Zaidejas implements lt.vcs.laivumusis.common.Zaidejas {

	Scanner laivas = new Scanner(System.in);
	
	
	private Zaidimas zaidimas;
	private String zaidejasId;
	private Laivas laivelis;
	private int y;
	private String x;

	public Zaidejas() {
		
	}
	
	public Zaidejas(Zaidimas zaidimas) {
		this.zaidimas = zaidimas;
	}

	@Override
	public void run() {
	
		while(true) {
			switch(zaidimas.tikrinkBusena(zaidejasId)) {
			    case Registracija :
			    		this.zaidimas.registruokZaideja();
				break;
			    case DalinemesLaivus :
		    			this.zaidimas.duokLaivus(zaidejasId);
					break;
			    case DalinamesZemelapius :
		    			this.zaidimas.duokZaidimoLenta(zaidejasId);
					break;
			    case RikiuojamLaivus :
		//    			this.zaidimas.pridekLaiva(, zaidejasId);
					break;
			    case TavoEile :
	//	    			this.zaidimas.sauk('A', 10, zaidejasId);
					break;
			    case PriesininkoEile :
		    		
					break;
			    case TuLaimejai :
		    		
					break;
			    case PriesasLaimejo :
		    		
					break;
					
			}			
		}
		
	}

	// sukurti metoda konsole prideda kordinates, laivo vardas, 5 laivai

	public void zaidejauPridekLaivus() {
			int counter= 0;
			
			for(int i=0; i<this.zaidimas.duokLaivus("testas").size(); i++) {
				System.out.println(this.zaidimas.duokLaivus("testas").get(i));
				counter++;
			}
			
		    System.out.println("Ivesk laiva: " /*laivo pavadinimas*/);
		    String laivoPav = laivas.nextLine();
		    
		    for(int ilg=1; counter < ilg;ilg++)
		    {
			    switch(laivoPav)
			    {
			    	case "laivasVienas" :
			    		LaivuSkaiciavimas(1,"laivasVienas" );
			        break;
			    	case "krovininis" :
			    		LaivuSkaiciavimas(2,"krovininis");
				    break;
			    	case "kruizeris" :
			    		LaivuSkaiciavimas(3,"kruizeris");
				    break;
			    	case "povandeninis" :
			    		LaivuSkaiciavimas(4,"povandeninis");
		            break;
			    	case "naikintojas" :
			    		LaivuSkaiciavimas(5,"naikintojas");
			        break;
	
			    }
		    }
		
		
	}
	
	private void LaivuSkaiciavimas(int laivoIlgis, String laivoPavadinimas) {
		List<Langelis> list = new ArrayList<>();

		
		 System.out.println("Turite ivesti "+ laivoPavadinimas +" laivo kordinates");
		  
		 
		 for(int i =1; i<= laivoIlgis;i++)
		 {
			 System.out.println("Kordinates: X");
			 this.x = laivas.nextLine();
			 System.out.println("Kordinate: Y");
			 this.y = laivas.nextInt();
			 
			 list.add(new lt.vcs.laivumusis.USSENTERPRISE.langelis.Langelis(x,y));
			
		 }   
			
	}
	
	
	

	
	public String getZaidejas() {
		return this.zaidejasId;
	}

	@Override
	public Zaidimas getZaidimas() {
		// TODO Auto-generated method stub
		return null;
	}

}
