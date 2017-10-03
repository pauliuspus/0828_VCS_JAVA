package lt.vcs.laivumusis.USSENTERPRISE;

import javax.xml.stream.Location;

public class ZaidimoLenta {

    private Location[][] zaidimolenta;
    private int taskai;

    // Nesikeiciantys stulpeliu ir eiluciu skaicius
    public static final int SK_EILUCIU = 10;
    public static final int SK_STULPELIU = 10;

    public ZaidimoLenta() {
        if (SK_EILUCIU > 11) {
            throw new IllegalArgumentException ("ERROR SK EILUCIU NEGALI BUTI > 11");
        }
        zaidimolenta = new Location[SK_EILUCIU][SK_STULPELIU];

        for (int eilute = 0; eilute < zaidimolenta.length; eilute++) {
            for (int stulpelis = 0; stulpelis < zaidimolenta[eilute].length; stulpelis++) {


            }
        }
    }
}
