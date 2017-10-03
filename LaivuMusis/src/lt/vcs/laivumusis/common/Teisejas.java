package lt.vcs.laivumusis.common;

import java.util.List;

public interface Teisejas extends Runnable{
	public List<Laivas> duokLaivus();
	
	// TODO pamastyti del blogo atvejo
	public void patikrinkLenta();
	
	public void patikrinkArGalimaDeti(Laivas laivas);
	
	public void patikrinkArLaimejo();
	
	public void patikrinkArNesukciauja(Zaidejas zaidejas);
	
	public void patikrinkArLaivaiPadeti();
	
	public ZaidimoLenta duokZaidimoLenta();
	
	
	
	
}
