
class GeneratePrime {
	private int LowerBound;
	private int UpperBound;

	synchronized void generatePrime(int LowerBound, int UpperBound) {
		this.LowerBound = LowerBound;
		this.UpperBound = UpperBound;

		System.out.println("Prime Number from " + LowerBound + " " + UpperBound + " :");
		for (int i = this.LowerBound; i <= this.UpperBound; i++) {
			if (i == 1) {
				continue;
			}

			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}
		}
	}

}

class GeneratePrimeThread implements Runnable {
	GeneratePrime g;
	private int lowerbound;
	private int upperbound;

	public GeneratePrimeThread(GeneratePrime g,int lower,int upper) {
		this.g = g;
		this.lowerbound = lower;
		this.upperbound = upper;
		new Thread(this, "thread1").start();
	}

	public void run() {
		g.generatePrime(lowerbound,upperbound);
	}
}


public class PrimeDemo {

	public static void main(String[] args) {
		GeneratePrime G = new GeneratePrime();
		new GeneratePrimeThread(G,1,100);
		new GeneratePrimeThread(G,101,200);
		new GeneratePrimeThread(G,201,300);
		
	}

}