package lt.vcs.kavosaparatas.lina.puodelis;


public abstract class Puodelis {
	private int puodelioTalpa = 5;

	public Puodelis() {

	}

	public Puodelis(int k) {
		this.puodelioTalpa = k;
	}

	public void puodelioInfo() {
		System.out.println(puodelioTalpa);
	}

}
