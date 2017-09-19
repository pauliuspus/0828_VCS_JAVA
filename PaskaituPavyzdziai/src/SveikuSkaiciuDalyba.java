
public class SveikuSkaiciuDalyba {
	
	public static int skaiciuokFaktoriala(int sk){
		int result = 1;
		for(int i = sk; i > 0;i--){
			result = i * result;
		}
		return result;
	}

	public static void main(String[] args) {
		
		

		
		
		
		
		
		int sk = 123456;
		
		System.out.println(skaiciuokFaktoriala(17));
		System.out.println(sk /10 % 10);
		System.out.println(sk / 10 / 10 % 10);
		
		//System.out.println(sk %100 / 10);
		
		
		
		

	}

}
