package lt.vcs.andrius.interfacepvz2;

public class Main {

	public static void main(String[] args) {
		SodininkystesImone s = new SodininkystesImone();
		
		s.pridekSiltnami(new MockSiltnamis());
		s.pridekSiltnami(new MockSiltnamis());
		
		s.laistykSiltnamius();

	}

}
