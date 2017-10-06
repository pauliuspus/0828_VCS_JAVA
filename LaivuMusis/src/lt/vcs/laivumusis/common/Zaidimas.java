package lt.vcs.laivumusis.common;

import java.util.List;

public interface Zaidimas extends Runnable {
	// visos taisykles zaidime

	// TODO paslepti nuo zaideju
	public List<ZaidimoLenta> getLentos();

	public void skaiciuokStatistika();

	public Busena tikrinkBusena(String zaidejoId);

	public String registruokZaideja();

	public void pridekLaiva(Laivas laivas, String zaidejoId);

	public boolean sauk(String x, int y, String zaidejoId);

	public List<Laivas> duokLaivus(String zaidejoId);

	public ZaidimoLenta duokZaidimoLenta(String zaidejoId);
}
