package lt.vcs.laivumusis.USSENTERPRISE;

public class Laivas {

    // laivo kintamieji

    private int eilute;
    private int stulpelis;
    private int ilgis;
    private int kryptis;

    // krypties konstantos

    public static final int NENUSTATYTA = -1;
    public static final int HORIZONTALI = 0;
    public static final int VERTIKALI = 1;


    // konstruktorius
    public Laivas(int ilgis) {
        this.ilgis = ilgis;
        this.eilute = -1;
        this.stulpelis = -1;
        this.kryptis = NENUSTATYTA;
    }

    // lokacija

    public boolean arNustatytaVieta(){
        if (eilute == -1 || stulpelis == -1)
            return false;
        else
            return true;
    }

    public boolean arNustatytaKryptis(){
        if (kryptis == NENUSTATYTA)
            return false;
        else
            return true;
    }

    // laivo vietos nustatymas

    public void setLokacija(int eilute, int stulpelis) {
        this.eilute = eilute;
        this.stulpelis = stulpelis;
    }

    // laivo krypties nustatymas
    public void setKryptis(int kryptis) {
        if (kryptis != NENUSTATYTA && kryptis != HORIZONTALI && kryptis != VERTIKALI )
            throw new IllegalArgumentException ("Netinkama kryptis. turi buti -1, 0 arba 1");
        this.kryptis = kryptis;

    }

    // eiles getteris

    public int getEilute(){
        return eilute;
    }
    // stulpelio getteris

    public int getStulpelis(){
        return stulpelis;
    }

    // laivo ilgio geteris

    public int getIlgis(){
        return ilgis;
    }
    //krypties getteris
     public int getKryptis(){
        return kryptis;
     }
     // metodas gauti string reiksme is krypties
    private String kryptisToString(){
         if (kryptis == NENUSTATYTA)
             return "NENUSTATYTA";
             else if (kryptis == HORIZONTALI)
                 return "HORIZONTALI";
             else
                 return "VERTIKALI";
    }

    //iStringa laivo suma
    public String toString(){
        return "Laivas: "+ getEilute () + ", " + getStulpelis () + "ilgio" + getIlgis () + "kryptimi " + kryptisToString ();
    }
}