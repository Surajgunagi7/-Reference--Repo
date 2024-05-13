package sdmcet.cse.oop.thread.primenumber;

class GeneratePrime  {
	private int LowerBound;
	private int UpperBound;
	
	synchronized void generatePrime(int LowerBound,int UpperBound) {
		this.LowerBound = LowerBound;
		this.UpperBound = UpperBound;
		
		System.out.println("Prime Number from "+LowerBound+" "+UpperBound+" :");
		for(int i = this.LowerBound;i <= this.UpperBound; i++) {
			if (i == 1) {
				continue;
			}
			
			boolean isPrime = true;
			for(int j = 2; j < i;j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i + " ");
			}
		}
	}
	
}

class GeneratePrimeThread1 implements Runnable {
	GeneratePrime g;
	
	public GeneratePrimeThread1(GeneratePrime g) {
		this.g = g;
		new Thread(this,"thread1").start();
	}
	
	public void run() {
		g.generatePrime(1,100);
	}
}

class GeneratePrimeThread2 implements Runnable {
	GeneratePrime g;
	
	public GeneratePrimeThread2(GeneratePrime g) {
		this.g = g;
		new Thread(this,"thread2").start();
	}
	
	public void run() {
		g.generatePrime(101,200);
	}
}

class GeneratePrimeThread3 implements Runnable {
	GeneratePrime g;
	
	public GeneratePrimeThread3(GeneratePrime g) {
		this.g = g;
		new Thread(this,"thread3").start();
	}
	
	public void run() {
		g.generatePrime(201,300);
	}
}
public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneratePrime G = new GeneratePrime();
		new GeneratePrimeThread1(G);
		new GeneratePrimeThread2(G);
		new GeneratePrimeThread3(G);
	}

}
