package lt.vcs.laivumusis.piratai;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;

public class MockLaivas implements Laivas {

	@Override
	public int getLaivoIlgis() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public boolean arNusautas() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Langelis> getLaivoKoordinates() {
		List<Langelis> langelis = new ArrayList<Langelis>();
		return langelis;
	}

}
