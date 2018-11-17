package core.java.multithreading.caveProgramming.reentrantlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

	private Integer count = 0;

	Lock lock = new ReentrantLock();
	Condition cond = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void process1() throws InterruptedException {
		lock.lock();
		System.out.println("Thread will now wait");
		cond.await();
		
		System.out.println("Woken up");
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void process2() throws InterruptedException {
		
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Enter Return Key");
		new Scanner(System.in).nextLine();
		System.out.println("Return Key pressed");
		
		cond.signal();
		
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void finished() {
		System.out.println("Count is :" + count);
	}
}
