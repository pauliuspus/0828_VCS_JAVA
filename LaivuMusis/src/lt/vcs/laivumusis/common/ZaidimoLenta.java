package lt.vcs.laivumusis.common;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;

import java.util.List;
import java.util.Map;

public interface ZaidimoLenta {
    public Map<String, List<Langelis>> getLangeliai();

    public List<Laivas> getLaivai();

    public void pridekLaiva(Laivas laivas);

    public void isvalykLenta();

    public boolean sauk(int x, int y);

}
