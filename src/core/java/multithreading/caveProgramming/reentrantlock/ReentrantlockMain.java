package core.java.multithreading.caveProgramming.reentrantlock;

public class ReentrantlockMain {
	
	public static void main(String[] args) throws InterruptedException {
		
		ReentrantLockExample reentrantObj = new ReentrantLockExample();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					reentrantObj.process1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					reentrantObj.process2();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		reentrantObj.finished();
	}
}
