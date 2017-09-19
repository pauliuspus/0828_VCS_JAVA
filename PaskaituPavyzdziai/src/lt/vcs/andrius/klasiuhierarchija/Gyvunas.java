package lt.vcs.andrius.klasiuhierarchija;

public class Gyvunas extends Object {

	protected boolean arZinduolis;

	protected boolean arGyvas;
	
	public Gyvunas(boolean arZinduolis, boolean arGyvas) {
		this.arZinduolis = arZinduolis;
		this.arGyvas = arGyvas;
	}
	
	public Gyvunas() {
	}
	
	

	public String toString(){
		return "mane paverte i string";
	}
	public void miegok() {
		System.out.println((arGyvas?"Gyvas":"Negyvas") + " gyvunas miega:" + this.getClass());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
