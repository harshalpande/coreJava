package core.java.multithreading.caveProgramming;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	public static void producer() throws InterruptedException {
		Random random = new Random();

		while (true) {
			Thread.sleep(100);
			Integer value = random.nextInt(100);
			queue.offer(value);
		}
	}

	public static void consumer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(100);
			if (random.nextInt(10) == 0) {
				queue.forEach(i -> System.out.print(i + " "));
				Integer value = queue.take();
				System.out.println("Value Taken : " + value + " Queue Size : " + queue.size());
			}
		}
	}

}
