package lt.vcs.kavosaparatas.common;

public interface CoffeeMashine {
	public CoffeeCup gaminkKava(String kavosTipas);

	public void ismurzinkAparata();

	public void atlikPlovima();// +

	public void sakykProduktuBusena();// +

	public void sakykAparatoBusena(); // +

	public boolean arAparatasPasiruoses();// +

	public void isvalykProduktus();// +

	public Products getProduktaiKopija();// +

	public void papildykPupeliu(int pupeliuKiekis);

	public void papildykCukraus(int cukrausKiekis);

	public void papildykVandens(int vandensKiekis);

}
