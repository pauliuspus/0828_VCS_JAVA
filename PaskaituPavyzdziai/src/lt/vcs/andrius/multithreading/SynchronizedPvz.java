package lt.vcs.andrius.multithreading;

public class SynchronizedPvz {

	public static Object lock = new Object();

	public static void synchronizedWithLock() {
		synchronized (lock) {
			// synchronized blokas
		}
	}

	public synchronized void synchronizedMethod() {
		// synchronized metodas
	}
}











