// package oops.threethreads;

class MyThread implements Runnable {
	private String str;

	public MyThread(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		{ // Synchronize on System.out to ensure proper output
			for (int i = 0; i < 5; i++) {
				System.out.println(str + ": " + i);
			}
		}
	}
}

public class ThreeThreads {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		MyThread t3 = new MyThread("Three");

		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);

		thread1.start();
		thread2.start();
		thread3.start();

		try {
			// Wait main thread till all threads to finish execution
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
