
public class CikluPavyzdys {
	
	public static void forPavyzdys(){
		for(int i = 0;true; i = i - 2){
			System.out.println("For ciklas " + i);
		}
	}
	
	public static void whilePavyzdys(){
		int i = 0;
		while(i < 10){
			if(i == 5){
				System.out.println("Baigiame darba");
				i++;
				break;
			}
			
			///
			System.out.println("While ciklas " + i);
			i++;
			
		}
	}
	
	public static void doWhilePavyzdys(){
		int i = 8;
		if(i < 10 && i >= 0){
			do {
				System.out.println(i);
				i++;
			} while(i < 10 && i >= 0);
		}
		
	}
	
	public static void forEachPavyzdys(){
		int sk = 5;
		
		int [] masyvas = {5,9,8};
		
		for(int skaicius: masyvas){
			skaicius = skaicius * 2;
			System.out.println(skaicius);
		}
		System.out.println("---------");
		
		for(int skaicius: masyvas){
			System.out.println(skaicius);
		}
	}
	
	

	public static void main(String[] args) {
		forEachPavyzdys();

	}

}
