package core.java.multithreading.caveProgramming.semaphore;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection instance = new Connection();

	private int connections = 0;

	// semaphore - 1st parameter = number of locks
	// 2nd parameter - lets thread execute in first in and first out methodology
	Semaphore sem = new Semaphore(10, true);

	private Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() {
		try {
			sem.acquire();
			doConnect();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} finally {
			sem.release();
		}
	}

	private void doConnect() {

		synchronized (this) {
			connections++;
			System.out.println("Connections on Adding: " + connections);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (this) {
			connections--;
			System.out.println("Connections on Removing: " + connections);
		}
	}

}
