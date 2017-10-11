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
	private String laivopavadinimas;
	private boolean arLaivasYraLangelyje;
	Laivas langelioLaivas;
	private String langelioVaizdaviamasZemelapyje = "#";

	// Konstruktoiai
	public Langelis(Integer y) {
		this.y = y;
	}

	public Langelis(String x) {
		this.x = x;
	}
	
	public Langelis(String x, Integer y) {
		
	}

	// INTERFEICU IGIVENDINIMAS
	// kiekvienas langelis turi buti zaidimo lentos bendrame mape
	@Override
	public void sauk() { // turim langeli padaryti nusauta ir pradeti skaiciuoti jo suviu skaiciu,
		langelioBusena = true;
		suviuSkaicius++;

	}
	public String grazinkPilnaKoordinate(){
		return (x + y);
	}

	public void laivoIrasymasILangeli(String laivoPavadinimas) {
		arLaivasYraLangelyje = true;
		this.laivopavadinimas = laivoPavadinimas;
	}

	public void setLaivaLangeliui(lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas laivas) {
		this.langelioLaivas = laivas;
	}

	@Override
	public Laivas getLaivas() {

		return langelioLaivas;
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

	public String getlangelioVaizdaviamasZemelapyje() {
		return langelioVaizdaviamasZemelapyje;
	}

	public void setLangelioVaizdavimasTuriLaiva() {
		this.langelioVaizdaviamasZemelapyje = "O";
	}

	public void setLangelioVaizdavimasPasautasLaivas() {
		this.langelioVaizdaviamasZemelapyje = "X";
	}

	public void setLangelioVaizdavimasPasautaJura() {
		this.langelioVaizdaviamasZemelapyje = "+";
	}
}
