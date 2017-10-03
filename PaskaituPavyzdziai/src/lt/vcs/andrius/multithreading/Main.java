package lt.vcs.andrius.multithreading;

public class Main implements Runnable {
	
	
	
	static Object o = new Object();
	
	static int sk = 0;
	
	public Main(int reiksme){
		
	}
	
	public synchronized static void didinkSkReikme(){
		sk = sk + 1;
		System.out.println(sk);
	}
	
	public static void didinkSkReikme2(){
		synchronized (o) {
			sk = sk + 1;
			System.out.println(sk);
		}
	}


	public static void main(String[] args) {
		new Thread(new Main(5)).start();
		new Thread(new Main(6)).start();
		new Thread(new Main(9)).start();
		new Thread(new Main(7)).start();

		System.out.println();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			didinkSkReikme2();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
