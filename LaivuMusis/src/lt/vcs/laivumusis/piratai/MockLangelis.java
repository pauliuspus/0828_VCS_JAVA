package lt.vcs.laivumusis.piratai;

import lt.vcs.laivumusis.common.Laivas;
import lt.vcs.laivumusis.common.Langelis;

public class MockLangelis implements Langelis{
	static int sautaKartu ;
	@Override
	public void sauk() {
		System.out.println("Saunu!");
		
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
		if (sautaKartu >0) {
			return true;
		}
		return false;
	}

	@Override
	public int sakykKiekKartuSauta() {
		sautaKartu++;
		System.out.println("I si langeli sauta kartu: "+sautaKartu);
		return sautaKartu;
	}

}
