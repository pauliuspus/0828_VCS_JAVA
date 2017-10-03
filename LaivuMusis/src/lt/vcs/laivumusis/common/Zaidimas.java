package lt.vcs.laivumusis.common;

import java.util.List;

public interface Zaidimas extends Runnable {

    public List<Zaidejas> getZaidejai();

    public Teisejas getTeisejas();

    public List<ZaidimoLenta> getLentos();

    public void pradekZaidima();

    public void pabaikZaidima();

    public void skaiciuokStatistika();
}
