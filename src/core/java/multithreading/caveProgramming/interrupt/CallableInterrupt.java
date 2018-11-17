package core.java.multithreading.caveProgramming.interrupt;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableInterrupt {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<?> fu = executor.submit(new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				System.out.println("Starting");

				Random random = new Random();
				for (int i = 0; i < 1E8; i++) {
					
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("Thread Interrupted.");
						break;
					}
					
					Math.floorDiv(random.nextInt(500), random.nextInt(10) == 0 ? 1 : 1);
				}

				return null;
			}
		});
		
		executor.shutdown();
		/*
		 * First Method to interrupt a method is by using Future Reference Variable to cancel the running.
		 * */
		//fu.cancel(true);
		
		/*
		 * Second Method to interrupt a method is by using ExecutorService Reference
		 * Variable to shut down immediately without allowing all the threads running
		 * the background to complete their operation.
		 */
		executor.shutdownNow();
		
		executor.awaitTermination(1, TimeUnit.DAYS);
		
		System.out.println("Finished");
		
	}

}
