class AdditionThread extends Thread {
	private int a, b;

	public AdditionThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		System.out.println("Addition Result: " + (a + b));
	}
}

class SubtractionThread extends Thread {
	private int a, b;

	public SubtractionThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		System.out.println("Subtraction Result: " + (a - b));
	}
}

class MultiplicationThread extends Thread {
	private int a, b;

	public MultiplicationThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		System.out.println("Multiplication Result: " + (a * b));
	}
}

class DivisionThread extends Thread {
	private int a, b;

	public DivisionThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void run() {
		if (b != 0)
			System.out.println("Division Result: " + ((double) a / b));
		else
			System.out.println("Division by zero is undefined.");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		int operand1 = 10;
		int operand2 = 5;

		
		AdditionThread addThread = new AdditionThread(operand1, operand2);
		SubtractionThread subThread = new SubtractionThread(operand1, operand2);
		MultiplicationThread mulThread = new MultiplicationThread(operand1, operand2);
		DivisionThread divThread = new DivisionThread(operand1, operand2);

		
		addThread.start();
		subThread.start();
		mulThread.start();
		divThread.start();
	}
}
