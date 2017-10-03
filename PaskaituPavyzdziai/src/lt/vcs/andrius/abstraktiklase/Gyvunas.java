package lt.vcs.andrius.abstraktiklase;

public abstract class Gyvunas implements KalbantisGyvunas {

	String rusis;

	public abstract void miegok();

	public void sakykKasEsi() {
		System.out.println("As esu: " + rusis + this.getClass().getName());
	}

	@Override
	public void sakykAte() {
		System.out.println("Ate");
	}

}
