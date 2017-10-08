package lt.vcs.laivumusis.USSENTERPRISE.langelis;

import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.*;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.*;
import java.util.ArrayList;
import java.util.List;

public class Langelis implements lt.vcs.laivumusis.common.Langelis {
	private int suviuSkaicius; // naudojam nustatyti kiek kartu sauta i viena langeli
	private boolean langelioBusena;
	private String x;
	private int y;
	private boolean arLaivoDalisPasauta;

	// Konstruktoiai
	public Langelis(Integer y) {
		this.y = y;
	}

	public Langelis(String x) {
		this.x = x;
	}

	public Langelis(String x, Integer y) {
		this.x = x;
		this.y = y;
	}

	// INTERFEICU IGIVENDINIMAS
	// kiekvienas langelis turi buti zaidimo lentos bendrame mape
	@Override
	public void sauk() { // turim langeli padaryti nusauta ir pradeti skaiciuoti jo suviu skaiciu,
		langelioBusena = true;
		suviuSkaicius++;

	}

	@Override
	public Laivas getLaivas() {

		return null;
	}

	@Override
	public boolean arSauta() {
		return langelioBusena;
	}

	@Override
	public int sakykKiekKartuSauta() {
		return suviuSkaicius;
	}

	@Override
	public String getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}
}
