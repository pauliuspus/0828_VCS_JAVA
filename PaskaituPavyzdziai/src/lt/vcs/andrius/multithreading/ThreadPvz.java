package lt.vcs.andrius.multithreading;

public class ThreadPvz implements Runnable {
	@Override
	public void run() {
		System.out.println("Started: " + Thread.currentThread().getName());
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Stopped: " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadPvz());
		Thread t2 = new Thread(new ThreadPvz());
		t1.start();
		t2.start();
	}
}





