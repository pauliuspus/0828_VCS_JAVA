package lt.vcs.andrius.interfacepvz;

public class Main {
	
	public static void prijungAtjunkIrengini(USB usb){
		usb.plugUsb();
		usb.unPlugUsb();
	}

	public static void main(String[] args) {
		USB u = new Pele();
		u.plugUsb();
		u.unPlugUsb();
		
		System.out.println(u instanceof USB);
		
		((Pele) u).sukRatuka(45);
		
	}

}
