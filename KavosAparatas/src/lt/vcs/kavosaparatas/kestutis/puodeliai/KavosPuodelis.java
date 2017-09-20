package lt.vcs.kavosaparatas.kestutis.puodeliai;


import lt.vcs.kavosaparatas.common.CoffeeCup;
import lt.vcs.kavosaparatas.kestutis.produktai.Produktai;

public class KavosPuodelis extends Puodelis implements CoffeeCup{
    protected Produktai produktai;

    protected String kavosPavadinimas;

    protected boolean kavaPagaminta = false;

    public KavosPuodelis(String kavosPavadinimas, int cukrus, int kava, int vanduo) {
        this.kavosPavadinimas = kavosPavadinimas;
        produktai = new Produktai(cukrus, kava, vanduo);
    }

    public boolean isKavaPagaminta() {
        return kavaPagaminta;
    }

    public void setKavaPagaminta(boolean kavaPagaminta) {
        this.kavaPagaminta = kavaPagaminta;
    }
    
    public Produktai getProduktai(){
        return this.produktai.gaukKopija();
    }

    @Override
    public String toString() {
        return kavosPavadinimas + (kavaPagaminta ? " pagamintas" : " nepagamintas");
    }

}
