package core.java.multithreading.caveProgramming.callable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureAndCallableExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		
		
		
		Callable<Integer> callableInnerClass = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);
				try {
					Thread.sleep(duration);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return duration;
			}
		};
		
		Future<Integer> future = executorService.submit(callableInnerClass);
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
	}

}
