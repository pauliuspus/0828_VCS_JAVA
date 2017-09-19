package lt.vcs.andrius.interfacepvz;

public class Flesiukas implements USB {

	@Override
	public void plugUsb() {
		System.out.println("Mirkt");
		System.out.println("Mirkt melynai");
	}

	@Override
	public void unPlugUsb() {
		System.out.println("Informacija issaugota, isjungiam");
	}

}
