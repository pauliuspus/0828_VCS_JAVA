package lt.vcs.laivumusis.USSENTERPRISE.zaidejas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lt.vcs.laivumusis.USSENTERPRISE.zaidimas.Zaidimas;
import lt.vcs.laivumusis.common.Langelis;

public class Testas {

	static String x;
	static int y;
	static Scanner laivasKl = new Scanner(System.in);
	static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zaidimas zaid = new Zaidimas();
	
		
		
		int counter= 0;
		
		for(int i=0; i<zaid.duokLaivus("test").size(); i++) {
			System.out.println(" Laivas "+     zaid.duokLaivus("testas").get(i));
			counter++;
		}
		
	    System.out.println("Ivesk laiva: ");
	    String laivoPav = laivasKl.nextLine();
	    
	  
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
	
	  static public void LaivuSkaiciavimas(int laivoIlgis, String laivoPavadinimas) {
	
		list.removeAll(list);

	
	 System.out.println("Turite ivesti "+ laivoPavadinimas +" laivo kordinates");
	  
	 
		 for(int i =1; i<= laivoIlgis;i++)
		 {
			 System.out.println("Kordinates: X");
			 x = laivasKl.nextLine();
			 System.out.println("Kordinate: Y");
			 y = laivasKl.nextInt();
			 String bendras = x+" "+y;
			 
			 list.add(bendras);
		 }
		 
	 istraukIsListo();
		 
	}
	
	 static private void istraukIsListo() 
	{
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	

}
