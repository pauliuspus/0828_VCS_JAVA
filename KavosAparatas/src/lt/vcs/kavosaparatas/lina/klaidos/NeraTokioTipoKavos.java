package lt.vcs.kavosaparatas.lina.klaidos;

public class NeraTokioTipoKavos extends RuntimeException {
	static final long serialVersionUID = -3387516993124229948L;
	
	public NeraTokioTipoKavos() {
		super();
		System.out.println("Tokio tipo kavos neturime!");
	}
	
	public NeraTokioTipoKavos(String message) {
		super(message);
	}
}
