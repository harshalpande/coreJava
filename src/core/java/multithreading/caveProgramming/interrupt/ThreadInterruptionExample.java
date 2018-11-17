package core.java.multithreading.caveProgramming.interrupt;

import java.util.Random;

/**
 * Thread Interrupt Example via Thread Class
 * 
 * @author Harshal S Pande
 *
 */
public class ThreadInterruptionExample {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Starting");

				Random random = new Random();
				for (int i = 0; i < 1E8; i++) {
					
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("Thread Interrupted.");
						break;
					}
					
					Math.floorDiv(random.nextInt(500), random.nextInt(10) == 0 ? 1 : 1);
				}

				System.out.println("Finished");
			}
		});
		
		t.start();
		t.interrupt();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
