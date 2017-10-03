package lt.vcs.kavosaparatas.arnas.puodeliai;

public abstract class Puodelis {

	int maksimaliRiba;
	
	public void rodykInformacija() {
		System.out.println("Puodelio maksimali talpa yra " + maksimaliRiba + " ml.");
	}
	
}
