package core.java.multithreading.caveProgramming.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

	Account a1 = new Account();
	Account a2 = new Account();

	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();


	public void acquireLock(Lock lock1, Lock lock2) throws InterruptedException {
		while (true) {
			boolean acquiredLock1 = false;
			boolean acquiredLock2 = false;
			try {
				acquiredLock1 = lock1.tryLock();
				acquiredLock2 = lock2.tryLock();
			} finally {
				if (acquiredLock1 && acquiredLock2) {
					return;
				}

				if (acquiredLock1) {
					lock1.unlock();
				}

				if (acquiredLock2) {
					lock2.unlock();
				}
			}
			Thread.sleep(1);
		}
	}

	public void firstThread() throws InterruptedException {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			acquireLock(lock1, lock2);
			try {
				Account.transfer(a1, a2, random.nextInt(100));
			} finally {
				lock2.unlock();
				lock1.unlock();
			}
		}
	}

	public void secondThread() throws InterruptedException {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			acquireLock(lock1, lock2);
			try {
				Account.transfer(a2, a1, random.nextInt(100));
			} finally {
				lock2.unlock();
				lock1.unlock();
			}
		}
	}

	public void finished() {
		System.out.println("Account 1 balance :" + a1.getBalance());
		System.out.println("Account 2 balance :" + a2.getBalance());
		System.out.println("Total balance :" + (a1.getBalance() + a2.getBalance()));
	}

}
