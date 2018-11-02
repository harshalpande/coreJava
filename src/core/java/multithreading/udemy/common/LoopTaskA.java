package core.java.multithreading.udemy.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	public static int count = 0;
	public int id;

	@Override
	public void run() {
		System.out.println("##### Thread " + id + " Started #####");
		for (int i = 10; i > 0; i--) {
			System.out.println("<" + id + "> " + " TickTock " + i);
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("##### Thread " + id + " Stopped #####");
	}

	/**
	 * 
	 */
	public LoopTaskA() {
		this.id = ++count;
	}

}
