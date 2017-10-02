package lt.vcs.andrius.multithreading;

import java.util.Scanner;

public class ScannerPvz implements Runnable {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		new Thread(new ScannerPvz()).start();
		new Thread(new ScannerPvz()).start();
			

	}

	@Override
	public void run() {

		System.out.println(scanner.nextLine());

	}

}
