package lt.vcs.andrius.manopaketas;

import java.util.Scanner;

class ScannerUtilities {
	
	static String readPassword(){
		System.out.println("Iveskite slaptazodi");
		Scanner s = new Scanner(System.in);
	
		return s.next();
	}
	
	public static void test(){
		
	}

}
