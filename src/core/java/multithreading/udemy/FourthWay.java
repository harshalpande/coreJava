package core.java.multithreading.udemy;

import java.util.concurrent.TimeUnit;

public class FourthWay {
	
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		
		new Thread(new FourthTask()).start();
		
		/*
		 * Most widely used way of creating a Thread which helps to create a thread and
		 * store the reference of the thread in a variable thereby enables to do future
		 * operations on Thread. one more Advantage is it keeps the Thread Operations
		 * Class separate.
		 */
		
		Thread t4 = new Thread (new FourthTask());
		t4.start();
		
		System.out.println("Main Thread End");
	}
}


/**
 * Changed from Extending from Thread Class to implementing Runnable
 * @author pandehar
 *
 */
class FourthTask implements Runnable {
	
	private static int count = 0;
	private int id;

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("<" + id + "> Tick-Tok " + i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public FourthTask() {
		this.id = ++count;
	}

}

