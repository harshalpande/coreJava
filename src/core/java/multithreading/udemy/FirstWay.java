package core.java.multithreading.udemy;

import java.util.concurrent.TimeUnit;

public class FirstWay {

	public static void main(String[] args) {
		System.out.println("Main Thread Start");

		new FirstTask();
		@SuppressWarnings("unused")
		Thread t2 = new FirstTask();

		System.out.println("Main Thread End");
	}
}

class FirstTask extends Thread {

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

	public FirstTask() {
		this.id = ++count;
		this.start();
	}

}
