package core.java.multithreading.caveProgramming;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
	
	private CountDownLatch countDownLatch;
	
	public Processor(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		
		System.out.println("Thread Started");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		countDownLatch.countDown();
	}
}

public class CountDownLatchExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i<3; i++) {
			executorService.submit(new Processor(latch));
		}
		latch.await();
		System.out.println("Completed.");
		executorService.shutdown();
	}

}
