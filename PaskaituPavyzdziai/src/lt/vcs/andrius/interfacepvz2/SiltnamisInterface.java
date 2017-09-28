package lt.vcs.andrius.interfacepvz2;

public interface SiltnamisInterface {
	
	public int getId();
	
	public boolean arReikiaLaistyti();

	public void laistykSiltnami() throws TrukstaVandens;

	public long suraskVieta(int augaloStoris);

	public void sodink(int vieta, Augalas augalas);

}
