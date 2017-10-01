package lt.vcs.kavosaparatas.lina.klaidos;

public class ReikiaValytiAparata extends Exception {
	static final long serialVersionUID = -3387516993124229948L;
	
	public ReikiaValytiAparata() {
		super();
		System.out.println("Isvalykite kavos aparata!");
	}
	
	public ReikiaValytiAparata(String message) {
		super(message);
	}
}
