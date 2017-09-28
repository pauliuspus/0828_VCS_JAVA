package lt.vcs.andrius.interfacepvz2;

public class MockSiltnamis implements SiltnamisInterface {
	
	int id =5;

	@Override
	public int getId() {
		return id;
	}

	@Override
	public boolean arReikiaLaistyti() {
		return true;
	}

	@Override
	public void laistykSiltnami() throws TrukstaVandens {
		System.out.println(99999999);
	}

	@Override
	public long suraskVieta(int augaloStoris) {
		return 5;
	}

	@Override
	public void sodink(int vieta, Augalas augalas) {
		
	}

}
