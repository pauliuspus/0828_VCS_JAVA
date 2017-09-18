package lt.vcs.andrius.interfacepvz;

public class Pele implements USB {
	
	int x;
	
	int y;
	
	public void sukRatuka(int x){
		this.x = (this.x + x) % 100;
		System.out.println("Dabartine pozicija: " + this.x);
	}

	@Override
	public void plugUsb() {
	}

	@Override
	public void unPlugUsb() {
		System.out.println("Pele atsijunge");
		System.out.println("Paskutine pozicija:" + x + " " + y);
	}

}
