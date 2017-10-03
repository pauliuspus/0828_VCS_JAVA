package lt.vcs.laivumusis.piratai;

import lt.vcs.laivumusis.common.Vaizdas;

public class MockVaizdas implements Vaizdas{

	@Override
	public void pieskVaizda() {
		System.out.println("Nupiestas grazus vaizdelis");
		
	}

	@Override
	public void atnaujinkVaizda() {
		System.out.println("Vaizdas atnaujintas");
		
	}

	@Override
	public void isvalyk() {
		System.out.println("vaizdas isvalytas");
		
	}

}
