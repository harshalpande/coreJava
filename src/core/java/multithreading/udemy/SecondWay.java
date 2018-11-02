package core.java.multithreading.udemy;

import java.util.concurrent.TimeUnit;

public class SecondWay {
	
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		
		new SecondTask().start();
		
		Thread t2 = new SecondTask();
		t2.start();
		
		System.out.println("Main Thread End");
	}
}

class SecondTask extends Thread {
	
	private static int count = 0;
	private int id;

	@Override
	public void run() {
		super.run();
		for (int i = 10; i > 0; i--) {
			System.out.println("<" + id + "> Tick-Tok " + i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public SecondTask() {
		this.id = ++count;
	}

}

