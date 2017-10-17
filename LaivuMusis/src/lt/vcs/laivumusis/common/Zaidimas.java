package lt.vcs.laivumusis.common;

import java.util.List;

public interface Zaidimas extends Runnable {
	// visos taisykles zaidime

	// TODO paslepti nuo zaideju
	public List<ZaidimoLenta> getLentos();

	// 4fun
	public void skaiciuokStatistika();

	// zaidejai klausineja ka jiems daryti
	public Busena tikrinkBusena(String zaidejoId);

	// grazina unikalu zaidejo id kitu operaciju kvietimui
	public boolean registruokZaideja(String zaidejoId);

	// prideda zaidejo laiva, patalpina ant zemelapio
	// ir pasidaro laivo bei langeliu kopijas
	public void pridekLaiva(Laivas laivas, String zaidejoId) throws LaivuPridejimoKlaida;

	// grazina true if pataike i laiva
	public boolean sauk(String x, int y, String zaidejoId);

	// duoda zaidekio laivus, DUOTI KOPIJAS
	public List<Laivas> duokLaivus(String zaidejoId);

	// duoda zaidejui lenta, DUOTI KOPIJA
	public ZaidimoLenta duokZaidimoLenta(String zaidejoId);
}
