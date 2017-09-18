import java.util.Scanner;

public class ScannerPavyzdys {

	public static void main(String[] args) {
		
		String s = 2 > 1 ? "" : "";
		
		
		Scanner scanner123 = new Scanner(System.in);
		System.out.println("Iveskite skaiciu");
		int nuskaitytas = scanner123.nextInt();
		
		System.out.println("Nuskaitytas skaicius:" + nuskaitytas);
		nuskaitytas = scanner123.nextInt();
		
		System.out.println(scanner123.nextInt());
		
		//String s = scanner123.next();
	}

}
