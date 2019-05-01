package core.java.practice.threading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintOnesAndZeros {

	Lock lock = new ReentrantLock();
	Condition cond = lock.newCondition();

	public void printOne() {
		lock.lock();
		try {
			cond.await();
			printMethod(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void printZero() {
		try {
			Thread.sleep(500);
			lock.lock();
			cond.signal();
			printMethod(0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	private void printMethod(int i) {
		System.out.print(i + " ");
	}

	public static void main(String[] args) {

		PrintOnesAndZeros print = new PrintOnesAndZeros();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					print.printOne();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					print.printZero();
				}
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
