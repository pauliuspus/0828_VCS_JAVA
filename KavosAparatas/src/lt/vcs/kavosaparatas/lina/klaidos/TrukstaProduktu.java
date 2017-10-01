package lt.vcs.kavosaparatas.lina.klaidos;

public class TrukstaProduktu extends Exception{
	static final long serialVersionUID = -3387516993124229948L;
	
	public TrukstaProduktu() {
		super();
		System.out.println("Truksta produktu kavos aparatui!");
	}
	
	public TrukstaProduktu(String message) {
		super(message);
	}
}
