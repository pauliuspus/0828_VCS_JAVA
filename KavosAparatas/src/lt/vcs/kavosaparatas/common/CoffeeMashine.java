package lt.vcs.kavosaparatas.common;

import lt.vcs.kavosaparatas.andrius.puodeliai.KavosPuodelis;
import lt.vcs.kavosaparatas.andrius.resursai.Produktai;

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
