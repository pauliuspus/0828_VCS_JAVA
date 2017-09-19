package lt.vcs.andrius.objektinis;

public class ManoMainKlaseObjetuKurimuiTest1 {
	
	
	
	public static void spausdinkJungtuka(boolean ijungtas){
		System.out.println("jungtukas: " + ijungtas);
	}
	
	public static void spausdinkJungtuka(Jungtukas jungtukas){
		System.out.println("jungtukas: " + jungtukas.ijungtas);
	}

	public static void main(String[] args) {
		
		
		Jungtukas jngt = new Jungtukas();
		jngt.isjunkMygtuka();
		Jungtukas jngt2 = new Jungtukas();
		
		System.out.println(jngt.arLygus(jngt2));


	}

}
