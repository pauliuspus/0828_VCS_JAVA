package lt.vcs.kavosaparatas.kestutis.Main;

import java.util.Scanner;

import lt.vcs.kavosaparatas.kestutis.KavosAparatas.KavosAparatas;


public class Main {
	
	public static void pradekAparatoDarba() {
		KavosAparatas aparatas = new KavosAparatas(0, 0, 0);
		sukuriamMenu();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			int ivestas = scanner.nextInt();
					
			switch (ivestas) {
			case 1:
				 aparatas.gaminkJuodaKava();
				 break;
			case 2:
				aparatas.gaminkEspresso();
				break;
			case 3:
				aparatas.gaminkCapuccino();
				break;
			case 4:
				aparatas.papildykCukraus();
				break;
			case 5:
				aparatas.papildykPupeliu();
				break;
			case 6:
				aparatas.papildykVandens();
				break;
			case 7:
				aparatas.valykAparata();
				break;
			case 8:
				aparatas.rodykBusena();
				break;
		
				
			default:
				System.out.println("Neteisingas meniu punktas");
				break;
			}
			scanner.close();
		}
		
		
	}
	
	public static void sukuriamMenu() {
		System.out.println("1. Juoda kava");
		System.out.println("2. Espresso");
		System.out.println("3. Capuccino");
		System.out.println("4. Papildyti cukraus");
		System.out.println("5. Papildyti pupeliu");
		System.out.println("6. Papildyti vandens");
		System.out.println("7. Plauti");
		System.out.println("8. Busena");
	}

	public static void main(String[] args) {
		pradekAparatoDarba();
		
		
		
	}

}

