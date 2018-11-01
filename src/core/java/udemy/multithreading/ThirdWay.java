package core.java.udemy.multithreading;

import java.util.concurrent.TimeUnit;

public class ThirdWay {
	
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		
		new ThirdTask();
		
		/*
		 * Here the below method of creating a new object of ThirdClass to a reference
		 * variable can't be done when we implement Runnable Interface. This proves that
		 * we should implement runnable only when we dont need to perform more
		 * operations on thread reference variable t3 after creating a thread.
		 */
		/*ThirdClass t3 = new ThirdClass();
		t3.start*/
		
		new ThirdTask();
		
		System.out.println("Main Thread End");
	}
}


/**
 * Changed from Extending from Thread Class to implementing Runnable
 * @author pandehar
 *
 */
class ThirdTask implements Runnable {
	
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
	
	public ThirdTask() {
		this.id = ++count;
		new Thread(this).start();
	}

}

