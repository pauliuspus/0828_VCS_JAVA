
public class PirmaKlase {

	public static void sakykSveikasPasauli() {
		System.out.println("Sveikas pasauli metode!");
	}
	
	public static void atpausdinkInt(int skaicius, int skaicius2){
		System.out.println(skaicius + skaicius2);
		return;
	}
	
	public static int sudekDuSkaicius(int a, int b){
		System.out.println("Gauti parametrai: " + a + " " + b);
		int suma = a + b;
		return a + b;
	}

	public static void main(String[] args) {
		int skaicius = 5;
		
		int rezultatas = sudekDuSkaicius(5, 6);
		System.out.println(rezultatas);
		
	
	}

}
