package lt.vcs.laivumusis.piratai;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;

public class MockLangelis implements Langelis{
	int sautaKartu ;
	boolean arPasautasLangelis;

	@Override
	public void sauk() {
		sautaKartu++;
		arPasautasLangelis = true;
		System.out.println("Pasautas langelis!");		
	}

	@Override
	public Laivas getLaivas() {
		// TODO Auto-generated method stub
		System.out.println("Laivas langelyje");
		return new MockLaivas();
	}

	@Override
	public boolean arSauta() {
		// Ar buvo sauta i si langeli
		return arPasautasLangelis;
	}

	@Override
	public int sakykKiekKartuSauta() {
		System.out.println("I si langeli sauta kartu: "+sautaKartu);
		return sautaKartu;
	}

}
