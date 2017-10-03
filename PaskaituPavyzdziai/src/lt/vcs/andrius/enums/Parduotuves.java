package lt.vcs.andrius.enums;

public enum Parduotuves {
	Norfa(100, 5, new Object()), Lidl(50, 4, ""), Maxima(200, 20, new String());

	private int darbuotojuSk;

	private int parduotuviuSk;

	Parduotuves(int darbuotojuSk, int parduotuviuSk, Object object) {
		this.darbuotojuSk = darbuotojuSk;
		this.parduotuviuSk = parduotuviuSk;
	}
	
	public int getDarbuotojuSk(){
		return darbuotojuSk;
	}
	
	public int getParduotuviuSk(){
		return parduotuviuSk;
	}

}
