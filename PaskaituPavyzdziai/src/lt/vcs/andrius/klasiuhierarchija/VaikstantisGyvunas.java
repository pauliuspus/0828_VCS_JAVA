package lt.vcs.andrius.klasiuhierarchija;

public class VaikstantisGyvunas extends Gyvunas {
	int greitis;
	
	boolean arGyvas = true;
	
	
	public VaikstantisGyvunas(){
		greitis = 55;
	}
	
	@Override
	public void miegok() {
		System.out.println("zzz-zzzz-zzz!" + arGyvas + super.arGyvas);
		super.miegok();
	}
	
	public void bek(){
		arGyvas = true;
		greitis++;
		System.out.println(this.getClass() + " bega");
		if(greitis > 2){
			arGyvas = false;
		}
	}
}
