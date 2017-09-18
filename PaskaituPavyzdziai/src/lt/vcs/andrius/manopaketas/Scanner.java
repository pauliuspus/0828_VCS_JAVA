package lt.vcs.andrius.manopaketas;

public class Scanner {
	
	public static void sakykKasEsi(){
		sakykSavoVarda();
		int test = 99;
		String password = ScannerUtilities.readPassword();
		if("abc".equals(password)){
			System.out.println("esu Scanner, slaptazodis teisingas");
		} else{
			System.out.println("eik miegot");

		}
		
		
	}
	
	private static void sakykSavoVarda(){
		System.out.println("Mano vardas Scanner");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
