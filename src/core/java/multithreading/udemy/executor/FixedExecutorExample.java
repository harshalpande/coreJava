package core.java.multithreading.udemy.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import core.java.multithreading.udemy.common.LoopTaskA;

public class FixedExecutorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start of Main Thread...");

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		executorService.submit(new LoopTaskA());
		executorService.submit(new LoopTaskA());
		executorService.submit(new LoopTaskA());
		executorService.submit(new LoopTaskA());
		executorService.submit(new LoopTaskA());
		executorService.shutdown(); // executorService needs to shutdown MANDATORILY else the application will
									// always keeps on running in the background.
		executorService.submit(new LoopTaskA()); // This line will throw a rejectedExecutionException because we have
													// called this task after shutdown() method of ServiceExecutor work.
		System.out.println("End of Main Thread...");
	}

}
