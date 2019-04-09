package core.java.multithreading.caveProgramming;

public class SynchronizeExample {

	private static int count = 0;

	/**
	 * synchronized keyword can only be applied to methods and not instance variable. Gives error Compile time
	 */
	private synchronized static void incrementer() {
		count++;
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					incrementer();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					incrementer();
				}
			}
		});

		t1.start();
		t2.start();

		// main thread starts another thread t1 and t2 and continues printing line 49
		// sysout, hence count = 0, join is required because it allows that the new
		// thread gets joined to main thread thereby completing the task.

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Count : " + count);
	}

}
