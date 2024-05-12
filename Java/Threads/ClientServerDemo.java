

class Resource {
	boolean valueSet = false;

	synchronized void request() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Request Receiced");
		valueSet = false;
		notify();
	}

	synchronized void response() {
		while (valueSet) {
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Response sent");
		valueSet = true;
		notify();
	}
}

class Server implements Runnable {
	Resource r;

	Server(Resource r) {
		this.r = r;
		new Thread(this, "Server").start();
	}

	public void run() {
		while (true) {
			r.response();
		}
	}
}

class Client implements Runnable {
	Resource r;

	Client(Resource r) {
		this.r = r;
		new Thread(this, "Client").start();
	}

	public void run() {
		while (true) {
			r.request();
		}
	}
}

public class ClientServerDemo {

	public static void main(String[] args) {
		Resource r = new Resource();
		new Server(r);
		new Client(r);
		System.out.println("Press control to stop..");

	}

}