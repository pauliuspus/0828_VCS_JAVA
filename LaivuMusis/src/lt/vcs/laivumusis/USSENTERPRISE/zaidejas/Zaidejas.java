package lt.vcs.laivumusis.USSENTERPRISE.zaidejas;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import lt.vcs.laivumusis.common.Busena;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Zaidimas;

public class Zaidejas implements lt.vcs.laivumusis.common.Zaidejas {

	private  Zaidimas zaidimas; 
	private String zaidejasId;
	private Laivas laivelis;
	private int y;
	private String x;
	
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
		    			this.zaidimas.pridekLaiva(, zaidejasId);
					break;
			    case TavoEile :
		    			this.zaidimas.sauk('A', 10, zaidejasId);
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
	
	//sukurti metoda konsole prideda kordinates, laivo vardas, 5 laivai 
	
	public void zaidejauPridekLaivus() {
		
		System.out.println("Ivesk laiva: " /*laivo pavadinimas*/);
		System.out.print("Kordinates: X");
		Scanner laivas = new Scanner(System.in);
		this.x = laivas.nextLine();
		System.out.println("Kordinate: Y");
		this.y = laivas.nextInt();
		
		
		
		
		
		
		
		
		
		
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
