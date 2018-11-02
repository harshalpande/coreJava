package core.java.multithreading.caveProgramming;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Runner extends Thread {
	
	private volatile boolean running = true;
	
	@Override
	public void run() {
		while (running) {
			System.out.println("Hello ");
			
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		this.running = false;
	}
}

public class BasicThreadStopping {
	
	public static void main(String[] args) {
		
		Runner t1 = new Runner();
				t1.start();
		
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		
		t1.shutdown();
		
	}

}
