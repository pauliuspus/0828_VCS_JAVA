package lt.vcs.laivumusis.USSENTERPRISE.langelis;

import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.ZaidimoLenta;
import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.USSENTERPRISE.laivas.*;
import lt.vcs.laivumusis.USSENTERPRISE.zaidimoLenta.*;
import java.util.ArrayList;
import java.util.List;

public class Langelis implements lt.vcs.laivumusis.common.Langelis {

	private int suviuSkaicius;
	private boolean langelioBusena;
	private String x;
	private int y;
	Laivas langelioLaivas;
	private String langelioVaizdaviamasZemelapyje = " #";

	public Langelis(Integer y) {
		this.y = y;
	}

	public Langelis(String x, int y) {

	}

	@Override
	public void sauk() {
		langelioBusena = true;
		suviuSkaicius++;

	}

	public String grazinkPilnaKoordinate() {
		return (x + y);
	}

	public void setLaivaLangeliui(lt.vcs.laivumusis.USSENTERPRISE.laivas.Laivas laivas) {
		this.langelioLaivas = laivas;
	}

	public void setX(String x) {
		this.x = x;
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
