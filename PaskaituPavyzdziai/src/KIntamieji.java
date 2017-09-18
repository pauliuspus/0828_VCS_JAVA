
public class KIntamieji {
	
	public static int skaiciuokFaktoriala(int n){
		int result = 1;
		for(int i = n; i > 0;i--){
			result = result * i;
		}
		return result;
	}
	
	public static void print(int sk){
		System.out.println("int");
	}
	
	public static void main(String[] args) {

		System.out.println(Long.MAX_VALUE);
		
		long l = Long.MAX_VALUE;
	
		l = l - 75807;
		
		System.out.println(l);
		
		double f = (double)l;
		
		System.out.println(f);
		
		long l2 = (long)f;
		
		System.out.println(l2);
		


	}

}
