// package oops.producerconsumer;

class Queue {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Put: " + n);
		valueSet = true;
		notify();
	}
}

class Producer implements Runnable {
	Queue q;

	Producer(Queue q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	Queue q;

	Consumer(Queue q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Queue q = new Queue();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press control to stop..");

	}

}