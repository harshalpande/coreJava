package core.java.multithreading.udemy;

import java.util.concurrent.TimeUnit;

/**
 * Fifth technique involves - using via Inner class
 * @author pandehar
 *
 */
public class FiftyWay {
	
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i > 0; i--) {
					System.out.println("Tick-Tok" + i);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t.start();
		
		System.out.println("Main Thread End");
	}
}
