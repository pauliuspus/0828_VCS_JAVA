
public class TernaryPavyzdys {

	public static void main(String[] args) {
			
		/*int a = 5;
		int b = 8;
		int c = 6;*/
		
		//int didesnis = a > b? (a > c? a : c): (b > c ? b : c);
	/*	
		if(a > b){
			didesnis = a;
		} else {
			didesnis = b;
		}*/
		
		boolean arVyras = false;
		
		String vardas = "Andrius";
		
		String kreipinys = (arVyras ? "Mr.": "Mrs.") + " " + vardas;
		
		System.out.println(kreipinys);
		

	}

}
