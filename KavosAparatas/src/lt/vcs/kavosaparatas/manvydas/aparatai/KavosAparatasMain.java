package lt.vcs.kavosaparatas.manvydas.aparatai;


public class KavosAparatasMain {

	public static void main(String[] args) {
		
		KavosAparatas kavosAparatas = new KavosAparatas();
		
		kavosAparatas.pridekPuodeli("JUODA", 10, 20, 0);
		kavosAparatas.pridekPuodeli("Naujoviska", 30, 30, 30);
		
		
		kavosAparatas.gaminkKavaJeiYra("naujoviska");
		kavosAparatas.sakykAparatoBusena();
	}

}
