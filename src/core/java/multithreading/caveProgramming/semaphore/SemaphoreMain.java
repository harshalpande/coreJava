package core.java.multithreading.caveProgramming.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreMain {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newCachedThreadPool();

		for (int i = 0; i < 200; i++) {
			executor.submit(new Runnable() {
				
				@Override
				public void run() {
					Connection.getInstance().connect();
				}
			});
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(10, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
