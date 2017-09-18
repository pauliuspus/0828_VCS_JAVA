package lt.vcs.andrius.objektinis;

public class Jungtukas {
	
	public boolean ijungtas = true;
	
	public void ijunkMygtuka(){
		ijungtas = true;
	}
	
	public void isjunkMygtuka(){
		ijungtas = false;
	}
	
	public boolean arLygus(Jungtukas j){
		return ijungtas == j.ijungtas;
	}
	
	

	public static void main(String[] args) {
		Jungtukas j1 = new Jungtukas();				
		
		System.out.println(j1.ijungtas);
		
		j1.ijunkMygtuka();
		
		System.out.println(j1.ijungtas);
	}

}
