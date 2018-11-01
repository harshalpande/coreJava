package core.java.udemy.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import core.java.udemy.multithreading.common.LoopTaskA;

public class SingleExecutorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start of Main Thread...");

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.submit(new LoopTaskA());
		executorService.submit(new LoopTaskA());
		executorService.submit(new LoopTaskA());
		executorService.submit(new LoopTaskA());
		executorService.submit(new LoopTaskA());
		executorService.shutdown(); // executorService needs to shutdown MANDATORILY else the application will
									// always keeps on running in the background.
		System.out.println("End of Main Thread...");
	}

}
