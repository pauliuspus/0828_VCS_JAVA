package lt.vcs.andrius.enums;

import lt.vcs.andrius.abstraktiklase.Gyvunas;
import lt.vcs.andrius.abstraktiklase.VaiksciojantisGyvunas;

public class Parduotuves2 {
	public static final String NORFA = "norfa";
	public static final String MAXIMA = "maxima";
	
	

	
	public static void skaiciuokApyvarta(String parduotuvesVardas){
		switch (parduotuvesVardas) {
		case Parduotuves2.MAXIMA:
			
			break;
			
		case Parduotuves2.NORFA:
			
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		String parduotuve = Parduotuves2.MAXIMA;
		
		
		skaiciuokApyvarta(parduotuve);
		skaiciuokApyvarta(Parduotuves2.NORFA);
		
		skaiciuokApyvarta(Automobiliai.BMW);
		
		
		
		
		
		if("".equals(Parduotuves2.MAXIMA)){
			
		}
		
		

	}

}
